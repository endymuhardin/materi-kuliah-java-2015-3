package com.muhardin.endy.belajar.swing.mvc;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.util.List;
import java.util.ArrayList;

public class TampilanUtama extends JFrame {

    public static void main(String[] x){
        TampilanUtama t = new TampilanUtama();
        t.setVisible(true);
    }

    public TampilanUtama(){
        // inisialisasi data, harusnya ini ambil dari DB
        dataMahasiswa = new ArrayList<>();

        Mahasiswa m1 = new Mahasiswa();
        m1.setNpm("123");
        m1.setNama("Adi");

        Mahasiswa m2 = new Mahasiswa();
        m2.setNpm("456");
        m2.setNama("Endy");

        Mahasiswa m3 = new Mahasiswa();
        m3.setNpm("678");
        m3.setNama("Greg");

        dataMahasiswa.add(m1);
        dataMahasiswa.add(m2);
        dataMahasiswa.add(m3);

        setTitle("Data Mahasiswa");

        pasangKomponen();
        pasangEventHandler();

        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void pasangKomponen(){
    
        MahasiswaTableModel mtm = new
        MahasiswaTableModel(dataMahasiswa);

        tabelMahasiswa = new JTable(mtm);
        getContentPane().add(new
        JScrollPane(tabelMahasiswa));
    
    }

    private void pasangEventHandler(){
    
       tabelMahasiswa.getSelectionModel().addListSelectionListener(new
       ListSelectionListener(){
        public void valueChanged(ListSelectionEvent e){
            // ambil data dari row yang diklik
            int barisYangDiklik = tabelMahasiswa.getSelectedRow();
            System.out.println("Baris yang diklik : "+barisYangDiklik);
            Mahasiswa m =
            dataMahasiswa.get(barisYangDiklik);
            System.out.println("NPM : "+m.getNpm());
            System.out.println("Nama : "+m.getNama());

        }
       }); 
    
    }

    private JTable tabelMahasiswa;
    private List<Mahasiswa> dataMahasiswa;
}
