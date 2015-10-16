package com.muhardin.endy.belajar.swing;

import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DemoLoginDialog extends JDialog {
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JButton btnLogin;

	private static final String usernameValid = "endy";
	private static final String passwordValid = "123";

	private DemoLookup induk;

	public DemoLoginDialog(DemoLookup idk){
		induk = idk;

		setModal(true);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setTitle("Login Dulu Dong");
		setSize(200,300);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		pasangKomponen();
		pasangEventHandler();
	}

	private void pasangKomponen(){
		txtUsername = new JTextField(15);
		txtPassword = new JPasswordField(15);
		btnLogin = new JButton("Login");

		getContentPane().add(new JLabel("Username"));
		getContentPane().add(txtUsername);
		getContentPane().add(new JLabel("Password"));
		getContentPane().add(txtPassword);
		getContentPane().add(btnLogin);
	}

	private void pasangEventHandler(){
		btnLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String user = txtUsername.getText();
				String pass = new String(txtPassword.getPassword());

				if(!usernameValid.equals(user)){
					JOptionPane.showMessageDialog(DemoLoginDialog.this, 
						"Username salah", 
						"Gagal Login", 
						JOptionPane.ERROR_MESSAGE);

					txtUsername.setText("");
					txtPassword.setText("");
					return;
				}

				if(!passwordValid.equals(pass)){
					JOptionPane.showMessageDialog(DemoLoginDialog.this, 
						"Password salah", 
						"Gagal Login", 
						JOptionPane.ERROR_MESSAGE);

					txtUsername.setText("");
					txtPassword.setText("");
					return;
				}

				System.out.println("Login Berhasil");
				DemoLoginDialog.this.dispose();
			}
		});
	}
}