package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class HaloBorderLayout {

	public static void main(String[] x){
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("Halo Border Layout");
		fr.setSize(200,400);
		fr.setLocationRelativeTo(null);

		tambahkanKomponen(fr);

		fr.setVisible(true);
	}

	private static void tambahkanKomponen(JFrame fr){
		JButton btn1 = new JButton("Tombol 1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("Tiga");
		JButton btn4 = new JButton("IV");
		JButton btn5 = new JButton("Tombol 5");
		
		fr.getContentPane().add(btn1, BorderLayout.NORTH);
		fr.getContentPane().add(btn2, BorderLayout.SOUTH);
		fr.getContentPane().add(btn3, BorderLayout.EAST);
		fr.getContentPane().add(btn4, BorderLayout.WEST);
		fr.getContentPane().add(btn5);
	}
}