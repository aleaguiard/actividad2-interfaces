package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.Controlador;

public class VentanaAuxiliar extends JDialog {

    private JLabel labelNombre, labelTelefono;
    private JTextField campoNombre, campoTelefono;
    private JButton botonOk, botonCancelar;
    private Controlador controladorAux;

    public VentanaAuxiliar(JFrame frame, Controlador controladorAux) {
    	this.controladorAux = controladorAux;
        inicializarVentana();
    }

    private void inicializarVentana() {
		getContentPane().setBackground(new Color(51,204,255, 50));
        setLayout(null);
        setBounds(250, 150, 300, 200);

        labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(20, 20, 80, 25);
        add(labelNombre);

        campoNombre = new JTextField();
        campoNombre.setBounds(100, 20, 160, 25);
        add(campoNombre);

        labelTelefono = new JLabel("Teléfono:");
        labelTelefono.setBounds(20, 50, 80, 25);
        add(labelTelefono);

        campoTelefono = new JTextField();
        campoTelefono.setBounds(100, 50, 160, 25);
        add(campoTelefono);

        botonOk = new JButton();
        botonOk.setBounds(50, 100, 80, 25);
        botonOk.addActionListener(controladorAux);
        add(botonOk);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(150, 100, 100, 25);
        add(botonCancelar);
        botonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		});
        
        JButton[] botones = {botonOk, botonCancelar};

        for (JButton boton : botones) {
            boton.setBackground(new Color(123, 104, 238));
            boton.setForeground(Color.WHITE);
            boton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            boton.setFont(new Font("Dialog", Font.BOLD, 12));
        }
        
        JLabel[] labels = {labelNombre, labelTelefono};
        
        for (JLabel label : labels) {
            label.setFont(new Font("Dialog", Font.BOLD, 12));
        }
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JTextField getCampoTelefono() {
        return campoTelefono;
    }

    public JButton getBotonOk() {
        return botonOk;
    }

    public JButton getBotonCancelar() {
        return botonCancelar;
    }
}

