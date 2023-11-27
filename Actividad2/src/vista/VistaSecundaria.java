package vista;

import java.awt.Color;


import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;


import controlador.ControladorActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.formdev.flatlaf.extras.FlatSVGIcon;
/**
 * Clase que representa una ventana secundaria para agregar contactos.
 *
 * Esta clase hereda de JDialog y contiene elementos como etiquetas, campos de texto y botones.
 * Los campos de texto permiten la entrada de informacion del usuario, mientras que los botones
 * ofrecen opciones para confirmar o cancelar la accion.
 * Utiliza la libreria externa FlatLaf library para poder usar imagenes svg para los iconos.
 *
 * @author Alberto Arroyo Santofimia
 * @see JDialog
 * @version v1.0
 */
public class VistaSecundaria extends JDialog {
    private JLabel nombre;
    private JLabel telefono;
    private JButton botonOk;
    private JButton botonCancel;
    private JTextField campoNombre;
    private JTextField campoTelefono;
    private ControladorActionListener controlador;
    private GradientPanel background;  // Nuevo componente para el fondo
    
    //le pasamos por parametro el controlador
    /**
     * Constructor de la clase VistaSecundaria.
     * 
     * @param controlador ControladorActionListener para manejar eventos de la interfaz.
     */
    public VistaSecundaria(ControladorActionListener controlador) {
        this.controlador = controlador;

        // Crear la ventana y establecerla
        setTitle("Añadir Contacto");
        setBounds(100, 100, 400, 180);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        getContentPane().setLayout(null); // No se recomienda, pero se mantiene por compatibilidad
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage("img/icono16.png"));
        
     // Crear el componente background como un panel de degradado
        background = new GradientPanel();
        setContentPane(background);
        // Llamar a initVariables para inicializar los componentes
        initVariables();

        // Hacer visible la ventana (debe ser la última opción del constructor)
        setVisible(true);
    }
    /**
     * Inicializa los componentes de la interfaz grafica.
     */
    private void initVariables() {
        background.setLayout(null);
        // Crear los componentes y configurarlos
        nombre = new JLabel("Nombre");
        nombre.setBounds(60, 20, 80, 20);
        //cambio el color del nombre
        nombre.setForeground(Color.WHITE);
        nombre.setFont(new Font("Dialog",Font.BOLD,14));
        background.add(nombre);
        
        campoNombre = new JTextField();
        //Que solo se puedan introducir letras en el campo
        campoNombre.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		int key = e.getKeyChar();
        		//donde empiezan y terminan los numeros en asci
        		boolean mayusculas = key >=65 && key <=90;
        		boolean minusculas = key >=97 && key <= 122;
        		boolean espacio = key == 32;
        		// letras con acento en mayúsculas y minúsculas
                boolean vocalesAcentuadas = (key == 'á' || key == 'é' || key == 'í' || key == 'ó' || key == 'ú' ||
                                              key == 'Á' || key == 'É' || key == 'Í' || key == 'Ó' || key == 'Ú');
                // letra ñ
                boolean nN = (key == 'ñ' || key == 'Ñ');
                // Si se introduce algo que no sean letras o espacio
                if (!(mayusculas || minusculas || espacio || vocalesAcentuadas || nN)) {
                    e.consume();
        		}
        		
        	}
        });
        campoNombre.setBounds(140, 20, 150, 20);
        //quitar el borde
        campoNombre.setBorder(null);
        campoNombre.setFont(new Font("Dialog",Font.BOLD,14));
        background.add(campoNombre);
        
        telefono = new JLabel("Teléfono");
        telefono.setBounds(60, 60, 80, 20);
        telefono.setForeground(Color.WHITE);
        telefono.setFont(new Font("Dialog",Font.BOLD,14));
        background.add(telefono);
        
        
        campoTelefono = new JTextField();
        //Condicion para no introducir letras Design->SeleccionarCampo->Key->KeyTyped
        campoTelefono.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		int key = e.getKeyChar();
        		//donde empiezan y terminan los numeros en asci
        		boolean numeros = key >=48 && key <=57;
        		//Si se introduce algo que no sea numero no se introduce
        		if (!numeros) {
        			e.consume();
        		}
        		//No se pueden introducir mas de 9 numeros en el campo
        		if(campoTelefono.getText().length()>=9) {
        			e.consume();
        		}
        	}
        });
        campoTelefono.setBounds(140, 60, 150, 20);
      //quitar el borde
        campoTelefono.setBorder(null);
        campoTelefono.setFont(new Font("Dialog",Font.BOLD,14));
        background.add(campoTelefono);
        
     // Asignar imagen al botón Ok
    //  ImageIcon okIcon = new ImageIcon("img/ok512.png");
    //  Image imageOk = okIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    //  okIcon = new ImageIcon(imageOk);
        
        FlatSVGIcon svgIconoOk = new FlatSVGIcon("main/svg/ok-blanco.svg",30, 30);
        botonOk = new JButton(svgIconoOk);
        botonOk.setBounds(180, 105, 30, 30);
        botonOk.setContentAreaFilled(false); // Hace que el área del botón no sea pintada
        botonOk.setBorderPainted(false); // Elimina el borde del botón
        botonOk.setCursor(new Cursor(Cursor.HAND_CURSOR)); // ponemos el cursor de la mano al pasar por el boton
        botonOk.addActionListener(controlador);
        background.add(botonOk);
        
        //ImageIcon cancelIcon = new ImageIcon("img/cancelar512.png");
       // Image imageCancel = cancelIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
       // cancelIcon = new ImageIcon(imageCancel);
        
        FlatSVGIcon svgIconoCancel = new FlatSVGIcon("main/svg/cancel2-blanco.svg",30, 30);
        botonCancel = new JButton(svgIconoCancel);
        botonCancel.setBounds(270, 105, 30, 30);
        botonCancel.setContentAreaFilled(false); // Hace que el área del botón no sea pintada
        botonCancel.setBorderPainted(false); // Elimina el borde del botón
        botonCancel.setBackground(Color.WHITE);
        botonCancel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // ponemos el cursor de la mano al pasar por el boton
        botonCancel.addActionListener(controlador);
        background.add(botonCancel);
    }

    //getters

	public JTextField getCampoNombre() {
		return campoNombre;
	}

	public JTextField getCampoTelefono() {
		return campoTelefono;
	}
    public JButton getBotonOk() {
		return botonOk;
	}

	public JButton getBotonCancel() {
		return botonCancel;
	}

}

