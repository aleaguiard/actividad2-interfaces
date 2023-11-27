package vista;

import java.awt.Color;

import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
/**
 * Clase que representa un panel con fondo de degradado
 * 
 * @author Alberto Arroyo Santofimia
 * 
 * @version v1.0
 */
public class GradientPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Define los colores del degradado
       // Color color1 = new Color(0, 0, 0); // Color inicial
      //  Color color2 = new Color(128, 128, 128); // Color final
     // Define los colores del degradado en formato hexadecimal

        // Rosa 0xEC008C,0xFC6767
        // Azul oscuro a claro 0x16222A,0x3A6073
        // Amarillo #E65C00,#F9D423
        // rojo a amarillo #C21500,#FFC500
        // Verde #ADD100,#7B920A
        // verde #56AB2F,#A8E063
        // Negro a verde #061700, #52C234
        // verde a amarillo #24FE41 #FDFC47
        // Verde claro a azul, #00F5A0,#00D9F5 *** isa
        //	Verde normal a azul #00F260,#0575E6 ***yo
        //	rosa a verde #FC354C,#0ABFBC  *******DEFINITIVO
        
        
        Color color1 = new Color(0xFC354C); 
        Color color2 = new Color(0x0ABFBC); 
        
        

        // Crea un degradado vertical desde la parte superior hasta la inferior
        GradientPaint gradient = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
    
        // Crea un degradado horizontal desde la izquierda hasta la derecha
      //GradientPaint gradient = new GradientPaint(0, 0, color1, getWidth(), 0, color2);
        
        // Establece el degradado en el contexto gráfico
        g2d.setPaint(gradient);

        // Rellena el fondo con el degradado
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}