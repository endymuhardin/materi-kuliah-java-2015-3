package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class HaloFlowLayout {

	public static void main(String[] x){
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("Halo Flow Layout");
		fr.setSize(200,400);
		fr.setLocationRelativeTo(null);

		fr.setLayout(new FlowLayout(FlowLayout.TRAILING));
		tambahkanKomponen(fr);

		fr.setVisible(true);
	}

	private static void tambahkanKomponen(JFrame fr){
		JButton btn1 = new JButton("Tombol 1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("Tiga");
		JButton btn4 = new JButton("IV");
		JButton btn5 = new JButton("Tombol 5");
		
		fr.getContentPane().add(btn1);
		fr.getContentPane().add(btn2);
		fr.getContentPane().add(btn3);
		fr.getContentPane().add(btn4);
		fr.getContentPane().add(btn5);
	}
}