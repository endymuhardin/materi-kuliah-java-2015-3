package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DemoLookup extends JFrame {
	
	public static void main(String[] x){

		DemoLookup fr = new DemoLookup();
		
		fr.setVisible(true);

	}

	private JButton btnCari;
	private JTextField txtCari;

	public DemoLookup(){

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Halo Lookup");
		setSize(400,200);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());
		tambahkanKomponen();
		pasangEventHandler();

		tampilkanLogin();
	}

	public void setPilihan(String tulisan){
		if(tulisan == null){
			return;
		}

		txtCari.setText(tulisan);
	}

	private void tambahkanKomponen(){
		btnCari = new JButton("Cari");
		txtCari = new JTextField(20);
		txtCari.setEditable(false);
		getContentPane().add(new JLabel("Kategori"));
		getContentPane().add(txtCari);
		getContentPane().add(btnCari);
	}

	private void pasangEventHandler(){
		btnCari.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Menjalankan event cari");
				DemoLookupDialog dialog = new DemoLookupDialog(DemoLookup.this);
				dialog.setLocationRelativeTo(DemoLookup.this);
				dialog.setVisible(true);
			}
		});
	}

	private void tampilkanLogin(){
		DemoLoginDialog d = new DemoLoginDialog(this);
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}

}