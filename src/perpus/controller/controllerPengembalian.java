/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.controller;

import perpus.model.modelPengembalian;
import perpus.view.ViewPengembalian;

/**
 *
 * @author hp
 */
public class controllerPengembalian {
    private modelPengembalian mPP;
    private ViewPengembalian vPP;
    
    public controllerPengembalian(ViewPengembalian vPP){
        this.vPP = vPP;
    }
    
    public void simpanPengembalian(){
        mPP = new modelPengembalian();
        mPP.setIdPeminjaman(Integer.parseInt(vPP.getIdPeminjamanTxt().getText()));
        mPP.setIdAnggota(Integer.parseInt(vPP.getIdAnggotaTxt().getText()));
        mPP.setIdBuku(Integer.parseInt(vPP.getIdBukuTxt().getText()));
        mPP.setNamaAnggota(vPP.getNamaAnggotaTxt().getText());
        mPP.setJudulBuku(vPP.getJudulBukuTxt().getText());
        mPP.setTglPinjam(vPP.getTglBukuTxt().getText());
        mPP.setJumlah(Integer.parseInt(vPP.getJumlahTxt().getText()));
        
        mPP.tambahStok();
        mPP.simpanPengembalian();
    }
    
    public void updateDataPeminjaman(){
        mPP = new modelPengembalian();
        mPP.setIdPeminjaman(Integer.parseInt(vPP.getIdPeminjamanTxt().getText()));
        
        mPP.updateDataPeminjaman();
    }
}
