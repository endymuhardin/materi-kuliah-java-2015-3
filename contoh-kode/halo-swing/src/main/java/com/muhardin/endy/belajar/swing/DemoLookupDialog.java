package com.muhardin.endy.belajar.swing;

import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DemoLookupDialog extends JDialog {
	private JRadioButton kategoriAksesoris;
	private JRadioButton kategoriPerlengkapan;
	private JRadioButton kategoriKomputer;
	private JButton btnPilih;

	private DemoLookup induk;

	public DemoLookupDialog(DemoLookup idk){
		this.induk = idk;
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Halo Lookup");
		setSize(200,300);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		pasangKomponen();
		pasangEventHandler();
	}

	private void pasangKomponen(){
		kategoriKomputer = new JRadioButton("Komputer dan Laptop");
		kategoriPerlengkapan = new JRadioButton("Perlengkapan Komputer");
		kategoriAksesoris = new JRadioButton("Aksesoris Handphone");
		
		ButtonGroup grpKategori = new ButtonGroup();
		grpKategori.add(kategoriKomputer);
		grpKategori.add(kategoriAksesoris);
		grpKategori.add(kategoriPerlengkapan);

		btnPilih = new JButton("Pilih");

		getContentPane().add(kategoriKomputer);
		getContentPane().add(kategoriPerlengkapan);
		getContentPane().add(kategoriAksesoris);
		getContentPane().add(btnPilih);
	}

	private void pasangEventHandler(){
		btnPilih.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String hasil = null;
				if(kategoriKomputer.isSelected()){
					hasil = kategoriKomputer.getText();
				}
				if(kategoriPerlengkapan.isSelected()){
					hasil = kategoriPerlengkapan.getText();
				}
				if(kategoriAksesoris.isSelected()){
					hasil = kategoriAksesoris.getText();
				}

				System.out.println("Kategori yang dipilih : "+hasil);
				induk.setPilihan(hasil);
				DemoLookupDialog.this.dispose();
			}
		});
	}
}