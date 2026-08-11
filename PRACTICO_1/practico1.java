package PRACTICO_1;

import java.awt.*;
import javax.swing.*;

public class practico1 extends JFrame{
	
	public practico1() {
	this.setTitle("Ventana 1-Guillermo Sanchis");
	this.setSize(1440, 720); 
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	this.setLocationRelativeTo(null); 
	this.setResizable(true); 
	this.setLayout(new FlowLayout());
	
	JLabel bienvenida = new JLabel("Bienvenido a mi programa /");
	
	JLabel nombre = new JLabel(" Nombre");
	JTextField txtNombre = new JTextField(10);
	
	JButton aceptar = new JButton ("Aceptar");
	
	this.add(bienvenida);
	this.add(nombre);
	this.add(txtNombre);
	this.add(aceptar);
	
	

}}
