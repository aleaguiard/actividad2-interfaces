package controlador;

import java.awt.Color;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import vista.VistaPrincipal;
import vista.VistaSecundaria;

public class ControladorMouseListener implements MouseListener{

	//referencia a la vista creando una variable
	 private VistaPrincipal vistaPrincipal;
	 private VistaSecundaria vistaSecundaria;

	
	 public ControladorMouseListener (VistaPrincipal vista) {
		 this.vistaPrincipal = vista;
	 }
	 
	@Override
	public void mouseClicked(MouseEvent e) {
			
			
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		if (e.getSource() == vistaPrincipal.getBotonAdd()) {
			vistaPrincipal.getBotonAdd().setBackground(Color.LIGHT_GRAY);
		}
		if (e.getSource() == vistaPrincipal.getBotonEdit()) {
			vistaPrincipal.getBotonEdit().setBackground(Color.LIGHT_GRAY);
		}
		if (e.getSource() == vistaPrincipal.getBotonDelete()) {
			vistaPrincipal.getBotonDelete().setBackground(Color.LIGHT_GRAY);
		}
		if (e.getSource() == vistaPrincipal.getBotonGuardar()) {
			vistaPrincipal.getBotonGuardar().setBackground(Color.LIGHT_GRAY);
		}
		if (e.getSource() == vistaPrincipal.getBotonCargar()) {
			vistaPrincipal.getBotonCargar().setBackground(Color.LIGHT_GRAY);
		}
		if (e.getSource() == vistaPrincipal.getBotonSonido()) {
			vistaPrincipal.getBotonSonido().setContentAreaFilled(true);
		}
		if (e.getSource() == vistaPrincipal.getBotonAZ()) {
			vistaPrincipal.getBotonAZ().setContentAreaFilled(true);
		}
		if (vistaSecundaria != null && e.getSource() == vistaSecundaria.getBotonOk()) {
			vistaSecundaria.getBotonOk().setBackground(Color.LIGHT_GRAY);
		}
		if (vistaSecundaria != null && e.getSource() == vistaSecundaria.getBotonCancel()) {
			vistaSecundaria.getBotonCancel().setBackground(Color.LIGHT_GRAY);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == vistaPrincipal.getBotonAdd()) {
			vistaPrincipal.getBotonAdd().setBackground(Color.WHITE);
		}
		if (e.getSource() == vistaPrincipal.getBotonEdit()) {
			vistaPrincipal.getBotonEdit().setBackground(Color.WHITE);
		}
		if (e.getSource() == vistaPrincipal.getBotonDelete()) {
			vistaPrincipal.getBotonDelete().setBackground(Color.WHITE);
		}
		if (e.getSource() == vistaPrincipal.getBotonGuardar()) {
			vistaPrincipal.getBotonGuardar().setBackground(Color.WHITE);
		}
		if (e.getSource() == vistaPrincipal.getBotonCargar()) {
			vistaPrincipal.getBotonCargar().setBackground(Color.WHITE);
		}
		if (e.getSource() == vistaPrincipal.getBotonSonido()) {
			vistaPrincipal.getBotonSonido().setContentAreaFilled(false);
		}
		if (e.getSource() == vistaPrincipal.getBotonAZ()) {
			vistaPrincipal.getBotonAZ().setContentAreaFilled(false);
		}
		if (vistaSecundaria != null && e.getSource() == vistaSecundaria.getBotonOk()) {
			vistaSecundaria.getBotonOk().setBackground(Color.WHITE);
		}
		if (vistaSecundaria != null && e.getSource() == vistaSecundaria.getBotonCancel()) {
			vistaSecundaria.getBotonCancel().setBackground(Color.WHITE);
		}
		
	}	

}
