package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


public class DemoEventHandling {

	public static void main(String[] x){
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("Demo Event Handling");
		fr.setSize(400,300);
		fr.setLocationRelativeTo(null);
		fr.setLayout(new FlowLayout());

		JButton btn = new JButton("Klik saya");
		fr.getContentPane().add(btn);

		PopupInformasi eventHandlerButton 
			= new PopupInformasi();
		btn.addActionListener(eventHandlerButton);

		KlikListener k = new KlikListener();
		fr.addMouseListener(k);
		btn.addMouseListener(k);

		fr.setVisible(true);
	}

	static class PopupInformasi implements ActionListener {
		public void actionPerformed(ActionEvent e){
			// handle event di sini
			JButton sumberEvent = (JButton) e.getSource();
			JOptionPane.showMessageDialog(null, 
				"Terjadi event di tombol : "+sumberEvent.getLabel(), 
				"Informasi", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	static class KlikListener implements MouseListener {
		public void mouseClicked(MouseEvent e){
			System.out.println("Mouse diklik di komponen "
				+e.getSource().getClass().getName());
		}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		public void mousePressed(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
	}
}