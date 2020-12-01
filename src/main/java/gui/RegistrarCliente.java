package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class RegistrarCliente {

	private JFrame frame;
	private JTextField textFieldNombreCliente;
	private JTextField textFieldTelefono;
	private JTextField textFieldPais;
	private JTextField textFieldRegion;
	private JTextField textFieldCiudad;
	private JTextField textFieldPrimeraDireccion;
	private JTextField textFieldSegundaDireccion;
	private JTextField textFieldCorreoElectronico;
	private JTextField textFieldNumero;
	private JTextField textFieldCodigoPostal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarCliente window = new RegistrarCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistrarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegistroClientes = new JLabel("Registro de Clientes");
		lblRegistroClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroClientes.setBounds(149, 26, 121, 40);
		frame.getContentPane().add(lblRegistroClientes);
		
		JLabel lblNombreCliente = new JLabel("Nombre del Cliente");
		lblNombreCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreCliente.setBounds(10, 103, 121, 33);
		frame.getContentPane().add(lblNombreCliente);
		
		JLabel lblTelefonoContacto = new JLabel("Telefono Contacto");
		lblTelefonoContacto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefonoContacto.setBounds(10, 147, 121, 33);
		frame.getContentPane().add(lblTelefonoContacto);
		
		JLabel lblPais = new JLabel("Pa\u00EDs");
		lblPais.setHorizontalAlignment(SwingConstants.CENTER);
		lblPais.setBounds(10, 191, 121, 33);
		frame.getContentPane().add(lblPais);
		
		JLabel lblRegion = new JLabel("Regi\u00F3n");
		lblRegion.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegion.setBounds(10, 235, 121, 33);
		frame.getContentPane().add(lblRegion);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCiudad.setBounds(10, 279, 121, 33);
		frame.getContentPane().add(lblCiudad);
		
		JLabel lblPrimeraDireccion = new JLabel("Primera Direcci\u00F3n");
		lblPrimeraDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimeraDireccion.setBounds(10, 323, 121, 33);
		frame.getContentPane().add(lblPrimeraDireccion);
		
		JLabel lblSegundaDireccion = new JLabel("Segunda Direcci\u00F3n");
		lblSegundaDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundaDireccion.setBounds(10, 367, 121, 33);
		frame.getContentPane().add(lblSegundaDireccion);
		
		textFieldNombreCliente = new JTextField();
		textFieldNombreCliente.setBounds(181, 109, 121, 20);
		frame.getContentPane().add(textFieldNombreCliente);
		textFieldNombreCliente.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(181, 153, 121, 20);
		frame.getContentPane().add(textFieldTelefono);
		
		textFieldPais = new JTextField();
		textFieldPais.setColumns(10);
		textFieldPais.setBounds(181, 197, 121, 20);
		frame.getContentPane().add(textFieldPais);
		
		textFieldRegion = new JTextField();
		textFieldRegion.setColumns(10);
		textFieldRegion.setBounds(181, 241, 121, 20);
		frame.getContentPane().add(textFieldRegion);
		
		textFieldCiudad = new JTextField();
		textFieldCiudad.setColumns(10);
		textFieldCiudad.setBounds(181, 285, 121, 20);
		frame.getContentPane().add(textFieldCiudad);
		
		textFieldPrimeraDireccion = new JTextField();
		textFieldPrimeraDireccion.setColumns(10);
		textFieldPrimeraDireccion.setBounds(181, 329, 121, 20);
		frame.getContentPane().add(textFieldPrimeraDireccion);
		
		textFieldSegundaDireccion = new JTextField();
		textFieldSegundaDireccion.setColumns(10);
		textFieldSegundaDireccion.setBounds(181, 373, 121, 20);
		frame.getContentPane().add(textFieldSegundaDireccion);
		
		JCheckBox chckbxDNI = new JCheckBox("DNI");
		chckbxDNI.setBounds(34, 499, 97, 23);
		frame.getContentPane().add(chckbxDNI);
		
		JCheckBox chckbxNie = new JCheckBox("NIE");
		chckbxNie.setBounds(205, 499, 97, 23);
		frame.getContentPane().add(chckbxNie);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electr\u00F3nico");
		lblCorreoElectronico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreoElectronico.setBounds(10, 411, 121, 33);
		frame.getContentPane().add(lblCorreoElectronico);
		
		textFieldCorreoElectronico = new JTextField();
		textFieldCorreoElectronico.setColumns(10);
		textFieldCorreoElectronico.setBounds(181, 417, 121, 20);
		frame.getContentPane().add(textFieldCorreoElectronico);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setBounds(10, 540, 121, 33);
		frame.getContentPane().add(lblNumero);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setColumns(10);
		textFieldNumero.setBounds(181, 546, 121, 20);
		frame.getContentPane().add(textFieldNumero);
		
		JLabel lblCodigoPostal = new JLabel("C\u00F3digo Postal");
		lblCodigoPostal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigoPostal.setBounds(10, 455, 121, 33);
		frame.getContentPane().add(lblCodigoPostal);
		
		textFieldCodigoPostal = new JTextField();
		textFieldCodigoPostal.setColumns(10);
		textFieldCodigoPostal.setBounds(181, 461, 121, 20);
		frame.getContentPane().add(textFieldCodigoPostal);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(42, 611, 89, 23);
		frame.getContentPane().add(btnRegistrar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(181, 611, 89, 23);
		frame.getContentPane().add(btnBorrar);
	}
}
