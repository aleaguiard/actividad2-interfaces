package controlador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.VentanaAuxiliar;
import vista.Vista;

public class Controlador implements ActionListener {

	private Vista vista;
	private VentanaAuxiliar ventanaAux;

	public Controlador(Vista vista) {
		this.vista = vista;
		this.ventanaAux = new VentanaAuxiliar(vista, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getBotonAdd()) {
			ventanaAux.setTitle("Añadir Contacto");
			ventanaAux.getBotonOk().setText("Añadir");
			ventanaAux.setVisible(true);
		}

		if (e.getSource() == vista.getBotonEditar()) {
			ventanaAux.setTitle("Editar Contacto");
			ventanaAux.getBotonOk().setText("Editar");

			int selectedRow = vista.getTablaContactos().getSelectedRow();

			if (selectedRow != -1) {
				ventanaAux.setVisible(true);
				ventanaAux.getCampoNombre().setText(vista.getTableModel().getValueAt(selectedRow, 0).toString());
				ventanaAux.getCampoTelefono().setText(vista.getTableModel().getValueAt(selectedRow, 1).toString());
			} else {
				JOptionPane.showMessageDialog(null, "Seleccione una fila para editar", "Aviso",
						JOptionPane.INFORMATION_MESSAGE);
			}
			vista.getBotonAdd().requestFocus();
		}

		if (e.getSource() == vista.getBotonEliminar()) {
			int selectedRow = vista.getTablaContactos().getSelectedRow();

			if (selectedRow != -1) {
				vista.getTableModel().removeRow(selectedRow);
				Sound();
			} else {
				JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "Aviso",
						JOptionPane.INFORMATION_MESSAGE);
			}
			vista.getBotonAdd().requestFocus();
		}

		if (e.getSource() == ventanaAux.getBotonOk()) {
			if (ventanaAux.getCampoNombre().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Nombre vacío", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			} else if (ventanaAux.getCampoTelefono().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Número de teléfono vacío", "Aviso",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (!ventanaAux.getCampoTelefono().getText().matches("[0-9+]+")) {
				JOptionPane.showMessageDialog(null, "Introduce sólo números en el campo teléfono", "Aviso",
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				if (ventanaAux.getBotonOk().getText().equals("Editar")) {
					int selectedRow = vista.getTablaContactos().getSelectedRow();
					vista.getTableModel().setValueAt(ventanaAux.getCampoNombre().getText(), selectedRow, 0);
					vista.getTableModel().setValueAt(ventanaAux.getCampoTelefono().getText(), selectedRow, 1);
				} else {
					vista.getTableModel().addRow(new String[] { ventanaAux.getCampoNombre().getText(),
							ventanaAux.getCampoTelefono().getText() });
					Sound();
				}
				
				//Reestablecemos todo
				vista.getTablaContactos().clearSelection();
				ventanaAux.getCampoNombre().setText(null);
				ventanaAux.getCampoTelefono().setText(null);
				ventanaAux.dispose();
				vista.getBotonAdd().requestFocus();
			}
		}
	}

	private void Sound() {
		Toolkit.getDefaultToolkit().beep();
	}
}