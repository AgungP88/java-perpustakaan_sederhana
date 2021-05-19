/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.controller;

import perpus.model.modelBuku;
import perpus.view.ViewBukuInternal;

/**
 *
 * @author hp
 */
public class controllerBuku {
    private modelBuku mB;
    private ViewBukuInternal vB;
    
    public controllerBuku(ViewBukuInternal vB){
        this.vB = vB;
    }
    
    public void bersihkan(){
        //pemanggilan variable object swing yang ada di view
        vB.getIdBukuTxt().setText("");
        vB.getJudulBukuTxt().setText("");
        vB.getPengarangTxt().setText("");
        vB.getPenerbitTxt().setText("");
        vB.getTahunTxt().setText("");
        vB.getStokTxt().setText("");
    }
    
    public void kontrolButton(){
        vB.getTombolSimpan().setEnabled(true);
        vB.getTombolHapus().setEnabled(false);
        vB.getTombolBatal().setEnabled(true);
        vB.getTombolUbah().setEnabled(false);
    }
    
    public void kontrolButtonDua(){
        vB.getTombolSimpan().setEnabled(false);
        vB.getTombolHapus().setEnabled(true);
        vB.getTombolBatal().setEnabled(true);
        vB.getTombolUbah().setEnabled(true);
    }
    
    public void deleteData(){
        mB = new modelBuku();
        mB.setIdBuku(vB.getIdBukuTxt().getText());
        
        mB.deleteDataBuku();
        bersihkan();
        kontrolButton();
    }
    
    public void updateData(){
        mB = new modelBuku();
        mB.setIdBuku(vB.getIdBukuTxt().getText());
        
        mB.setJudulBuku(vB.getJudulBukuTxt().getText());
        mB.setPengarang(vB.getPengarangTxt().getText());
        mB.setPenerbit(vB.getPenerbitTxt().getText());
        mB.setTahun(Integer.parseInt(vB.getTahunTxt().getText()));
        mB.setStok(Integer.parseInt(vB.getStokTxt().getText()));
        mB.updateDataBuku();
        bersihkan();
        kontrolButton();
    }
    
    public void simpan(){
        mB = new modelBuku();
        
        mB.setJudulBuku(vB.getJudulBukuTxt().getText());
        mB.setPengarang(vB.getPengarangTxt().getText());
        mB.setPenerbit(vB.getPenerbitTxt().getText());
        mB.setTahun(Integer.parseInt(vB.getTahunTxt().getText()));
        mB.setStok(Integer.parseInt(vB.getStokTxt().getText()));
        
        mB.simpanDataBuku();
        bersihkan();
        //JOptionPane.showConfirmDialog(vP, " Nama Pelanggan      : "+nP.getNamaPelanggan()+
        //        "\n Nomor HP        : "+nP.getNomorHp()+
        //        "\n Jenis Kelamin   : "+nP.getJenisKelamin()+
        //        "\n Umur        : "+nP.getUmur()+
        //        "\n Alamat      : "+nP.getAlamat());
        
    }
}
