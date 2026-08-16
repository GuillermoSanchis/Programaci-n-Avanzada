package PRACTICO_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class primeraImplementacion extends JFrame {

	public primeraImplementacion() {
		this.setTitle("Primera Implementacion-Guillermo Sanchis");
		this.setSize(1440, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(new FlowLayout());

		JPanel panel = new JPanel();

		JLabel nombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(10);

		JLabel apellido = new JLabel("Apellido");
		JTextField txtApellido = new JTextField(10);

		JButton aceptar = new JButton("Aceptar");

		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String contenidoNom = txtNombre.getText();
				String contenidoAp = txtApellido.getText();

				System.out.println("Nombre: " + contenidoNom);
				System.out.println("Apellido: " + contenidoAp);

			}
		});
		this.add(panel);
		panel.setPreferredSize(new Dimension(200, 400));
		panel.add(nombre);
		panel.add(txtNombre);
		panel.add(apellido);
		panel.add(txtApellido);
		panel.add(aceptar);

	}
}
