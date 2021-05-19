/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.controller;

import javax.swing.JOptionPane;
import perpus.model.modelPeminjaman;
import perpus.view.ViewPeminjaman;

/**
 *
 * @author hp
 */
public class controllerPeminjaman {
    private modelPeminjaman mP;
    private ViewPeminjaman vP;
    
    public controllerPeminjaman(ViewPeminjaman vP){
        this.vP = vP;
    }
    
    public void simpanPeminjaman(){
        mP = new modelPeminjaman();
        mP.setIdAnggota(Integer.parseInt(vP.getIdAnggotaTxt().getText()));
        mP.setIdBuku(Integer.parseInt(vP.getIdBukuTxt().getText()));
        mP.setJumlah(Integer.parseInt(vP.getJumlahTxt().getText()));
        
        mP.kurangStok();
        mP.simpanPeminjaman();
        
    }
   
}
