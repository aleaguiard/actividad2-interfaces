package controlador;

import vista.Vista;

public class Main {

	public static void main(String[] args) {

		Vista vista = new Vista();
		Controlador controlador = new Controlador(vista);
		vista.establecerListeners(controlador);
	}
}
