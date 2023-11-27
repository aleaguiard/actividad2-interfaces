package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Taskbar;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;

public class Vista extends JFrame {

	private JLabel titulo;
	private JButton botonAdd, botonEliminar, botonEditar;
	private JTable tablaContactos;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;

	public Vista() {
		setBounds(400, 100, 600, 600);
		setTitle("MI AGENDA");

		//Version para Windows
		//setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/contacts.png")));

		//Version para Mac
		//Comentar las dos líneas siguientes para usar en Windows
		Taskbar taskbar = Taskbar.getTaskbar();
		taskbar.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/contacts.png")));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		inicializarVariables();
		setVisible(true);
	}

	private void inicializarVariables() {

		getContentPane().setBackground(new Color(51, 204, 255, 50));
		getContentPane().setFont(getFont());

		ImageIcon iconAdd = new ImageIcon(getClass().getResource("/images/add.png"));
		ImageIcon iconDelete = new ImageIcon(getClass().getResource("/images/remove.png"));
		ImageIcon iconEdit = new ImageIcon(getClass().getResource("/images/edit-info.png"));

		iconAdd.setImage(iconAdd.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		iconDelete.setImage(iconDelete.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
		iconEdit.setImage(iconEdit.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));

		titulo = new JLabel("AGENDA DE CONTACTOS");
		titulo.setFont(new Font("Dialog", Font.BOLD, 20));
		titulo.setBounds(175, 10, 300, 70);
		add(titulo);

		botonAdd = new JButton("AÑADIR");
		botonAdd.setBounds(100, 100, 100, 60);
		botonAdd.setIcon(iconAdd);
		add(botonAdd);

		botonEliminar = new JButton("ELIMINAR");
		botonEliminar.setBounds(250, 100, 110, 60);
		botonEliminar.setIcon(iconDelete);
		add(botonEliminar);

		botonEditar = new JButton("EDITAR");
		botonEditar.setBounds(400, 100, 100, 60);
		botonEditar.setIcon(iconEdit);
		add(botonEditar);

		String[] nombreColumnas = { "Nombre", "Teléfono" };
		tableModel = new DefaultTableModel(nombreColumnas, 0);

		tablaContactos = new JTable(tableModel);
		tablaContactos.setDefaultEditor(Object.class, null);

		scrollPane = new JScrollPane(tablaContactos);
		scrollPane.setBounds(100, 215, 400, 300);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane);
		
		JButton[] botones = {botonAdd, botonEliminar, botonEditar};

        for (JButton boton : botones) {
            boton.setBackground(new Color(123, 104, 238));
            boton.setForeground(Color.WHITE);
            boton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            boton.setFont(new Font("Dialog", Font.BOLD, 12));
        }
	}

	public void establecerListeners(Controlador controlador) {
		botonAdd.addActionListener(new Controlador(this));
		botonEliminar.addActionListener(new Controlador(this));
		botonEditar.addActionListener(new Controlador(this));
	}

	public JButton getBotonAdd() {
		return botonAdd;
	}

	public JButton getBotonEliminar() {
		return botonEliminar;
	}

	public JTable getTablaContactos() {
		return tablaContactos;
	}

	public JButton getBotonEditar() {
		return botonEditar;
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}
}
