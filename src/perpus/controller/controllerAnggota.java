/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.controller;

import perpus.model.modelAnggota;
import perpus.view.ViewAnggotaInternal;

/**
 *
 * @author hp
 */
public class controllerAnggota {
    private modelAnggota mA;
    private ViewAnggotaInternal vA;
    
    public controllerAnggota(ViewAnggotaInternal vA){
        this.vA = vA;
    }
    
    public void bersihkan(){
        //pemanggilan variable object swing yang ada di view
        vA.getIdAnggotaTxt().setText("");
        vA.getNamaAnggotaTxt().setText("");
        vA.getNoTelpTxt().setText("");
        vA.getAlamatTxt().setText("");
        
    }
    
    public void kontrolButton(){
        vA.getTombolSimpan().setEnabled(true);
        vA.getTombolHapus().setEnabled(false);
        vA.getTombolBatal().setEnabled(true);
        vA.getTombolUbah().setEnabled(false);
    }
    
    public void kontrolButtonDua(){
        vA.getTombolSimpan().setEnabled(false);
        vA.getTombolHapus().setEnabled(true);
        vA.getTombolBatal().setEnabled(true);
        vA.getTombolUbah().setEnabled(true);
    }
    
    public void deleteData(){
        mA = new modelAnggota();
        mA.setIdAnggota(vA.getIdAnggotaTxt().getText());
        
        mA.deleteDataAnggota();
        bersihkan();
        kontrolButton();
    }
    
    public void updateData(){
        mA = new modelAnggota();
        mA.setIdAnggota(vA.getIdAnggotaTxt().getText());
        
        mA.setNamaAnggota(vA.getNamaAnggotaTxt().getText());
        mA.setNoTelp(vA.getNoTelpTxt().getText());
        
        if(vA.getLakiLakiRb().isSelected()){
            mA.setJenisKelamin("laki laki");
        }else if(vA.getPerempuanRb().isSelected()){
            mA.setJenisKelamin("perempuan");
        }
        
        mA.setAlamat(vA.getAlamatTxt().getText());
        mA.updateDataAnggota();
        bersihkan();
        kontrolButton();
    }
    
    public void simpan(){
        mA = new modelAnggota();
        
        mA.setNamaAnggota(vA.getNamaAnggotaTxt().getText());
        mA.setNoTelp(vA.getNoTelpTxt().getText());
        
        if(vA.getLakiLakiRb().isSelected()){
            mA.setJenisKelamin("laki laki");
        }else if(vA.getPerempuanRb().isSelected()){
            mA.setJenisKelamin("perempuan");
        }
        
        mA.setAlamat(vA.getAlamatTxt().getText());
        
        mA.simpanDataAnggota();
        bersihkan();
        //JOptionPane.showConfirmDialog(vP, " Nama Pelanggan      : "+nP.getNamaPelanggan()+
        //        "\n Nomor HP        : "+nP.getNomorHp()+
        //        "\n Jenis Kelamin   : "+nP.getJenisKelamin()+
        //        "\n Umur        : "+nP.getUmur()+
        //        "\n Alamat      : "+nP.getAlamat());
        
    }
}
