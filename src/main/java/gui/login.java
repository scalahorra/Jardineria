package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField textFieldUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(83, 87, 110, 24);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setBounds(83, 122, 110, 24);
		frame.getContentPane().add(lblContrasena);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(203, 89, 110, 20);
		frame.getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		//boton de incio de sesion con sus acciones
		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nombre=textFieldUsuario.getText();
				String ctr=passwordField.getText();
				
				if(nombre.equals("name") && ctr.equals("password")) {
					
					JOptionPane.showMessageDialog(frame, "Inicio de sesion exitoso");
				}
				else {
					
					JOptionPane.showMessageDialog(frame, "Inicio de sesion erroneo");
				}
			}
		});
		btnIniciarSesion.setBounds(83, 180, 121, 23);
		frame.getContentPane().add(btnIniciarSesion);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(214, 180, 99, 23);
		frame.getContentPane().add(btnBorrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 124, 110, 22);
		frame.getContentPane().add(passwordField);
	}
}
