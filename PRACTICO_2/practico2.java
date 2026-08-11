package PRACTICO_2;
import java.awt.*;
import javax.swing.*;
public class practico2 extends JFrame{
	public practico2() {
	
	this.setTitle("Registrar Usuario");
	this.setSize(1440, 720); 
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	this.setLocationRelativeTo(null); 
	this.setResizable(true); 
	this.setLayout(new FlowLayout());
	
	JPanel panelSuperior = new JPanel();
	
	JLabel nombre = new JLabel("Nombre");
	JTextField txtNombre = new JTextField(10);
	
	JLabel apellido = new JLabel("Apellido");
	JTextField txtApellido = new JTextField(10);
	
	JLabel ci = new JLabel("Cédula");
	JTextField txtCi = new JTextField(10);
	
	JLabel edad = new JLabel("Edad");
	JTextField txtEdad = new JTextField(10);
	
	JLabel rol = new JLabel("Rol");
	
	String[]rolArreglo = {"Usuario", "Administrador"};
	JComboBox cbRol = new JComboBox(rolArreglo);
	
	JButton Registrarse = new JButton("Registrarse");
	
	this.add(panelSuperior);
	
	panelSuperior.setLayout(new GridLayout(6, 2));
	panelSuperior.add(nombre);
	panelSuperior.add(txtNombre);
	panelSuperior.add(apellido);
	panelSuperior.add(txtApellido);
	panelSuperior.add(ci);
	panelSuperior.add(txtCi);
	panelSuperior.add(edad);
	panelSuperior.add(txtEdad);
	panelSuperior.add(rol);
	panelSuperior.add(cbRol);
	panelSuperior.add(Registrarse);
	
}}
