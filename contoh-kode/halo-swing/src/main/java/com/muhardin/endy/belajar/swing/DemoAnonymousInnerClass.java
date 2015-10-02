package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DemoAnonymousInnerClass {

	public static void main(String[] x){
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("Demo Event Handling");
		fr.setSize(400,300);
		fr.setLocationRelativeTo(null);
		fr.setLayout(new FlowLayout());

		JButton btn = new JButton("Klik saya");
		fr.getContentPane().add(btn);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				// handle event di sini
				JButton sumberEvent = (JButton) e.getSource();
				JOptionPane.showMessageDialog(null, 
					"Terjadi event di tombol : "+sumberEvent.getLabel(), 
					"Informasi", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		JButton btn2 = new JButton("Tombol 2");
		fr.getContentPane().add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("Tombol 2 diklik");
			}
		});

		fr.setVisible(true);
	}
}