package com.muhardin.endy.belajar.swing.mvc;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class MahasiswaTableModel extends AbstractTableModel{

    private List<Mahasiswa> data;

    public MahasiswaTableModel(List<Mahasiswa> x){
        data = x;
    }


    @Override
    public int getRowCount(){
        return data.size();
    }

    @Override
    public int getColumnCount(){
        return 2;
    }

    @Override
    public String getColumnName(int col){
        if(0 == col){
            return "NPM";
        }

        if(1 == col){
            return "Nama";
        }

        return "Undefined";
    }

    @Override
    public Object getValueAt(int baris, int col){
        if(baris > data.size()){
            return null;
        }

        Mahasiswa m = data.get(baris);

        if(0 == col){
            return m.getNpm();
        }

        if(1 == col){
            return m.getNama();
        }

        return null;

    }

}
