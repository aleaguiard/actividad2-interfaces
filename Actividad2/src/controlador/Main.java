package controlador;

import vista.VistaPrincipal;

/**
 * Clase principal (Main) que contiene el metodo main para iniciar la aplicacion.
 * En esta clase se crea la vista principal, el controlador de eventos y se establece la conexion entre ellos.
 * 
 * La aplicación sigue el patron de diseño Modelo-Vista-Controlador (MVC), donde:
 * - La vista (VistaPrincipal) muestra la interfaz grafica al usuario.
 * - El controlador (ControladorActionListener) maneja los eventos generados por la vista y realiza las operaciones correspondientes.
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 */
public class Main {

	public static void main(String[] args) {
		
		//crear la vista	
		VistaPrincipal vista = new VistaPrincipal();
		//crear el controlador del Boton, y comunicar el controlador con la vista
		ControladorActionListener controlador = new ControladorActionListener(vista);
		ControladorMouseListener controladorMouse = new ControladorMouseListener(vista);
		//llamamos al metodo de los listeners
		vista.establecerListeners(controlador);
		vista.establecerMouseListener(controladorMouse);

		
	}
	
}
