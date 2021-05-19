/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.controller;

import perpus.model.modelAnggota;
import perpus.model.modelUser;
import perpus.view.ViewUser;

/**
 *
 * @author hp
 */
public class controllerUser {
    private modelUser mU;
    private ViewUser vU;
    
    public controllerUser(ViewUser vU){
        this.vU = vU;
    }
    
    public void bersihkan(){
        vU.getIdUser().setText("");
        vU.getUsername().setText("");
        vU.getPassword().setText("");
        vU.getLevel().setText("");
        
    }
    
    public void kontrolButton(){
        vU.getTombolSimpan().setEnabled(true);
        vU.getTombolHapus().setEnabled(false);
        vU.getTombolBatal().setEnabled(true);
        vU.getTombolUbah().setEnabled(false);
    }
    
    public void kontrolButtonDua(){
        vU.getTombolSimpan().setEnabled(false);
        vU.getTombolHapus().setEnabled(true);
        vU.getTombolBatal().setEnabled(true);
        vU.getTombolUbah().setEnabled(true);
    }
    
    public void deleteData(){
        mU = new modelUser();
        mU.setIdUser(vU.getIdUser().getText());
        
        mU.deleteDataUser();
        bersihkan();
        kontrolButton();
    }
    
    public void updateData(){
        mU = new modelUser();
        
        mU.setIdUser(vU.getIdUser().getText()); 
        mU.setUsername(vU.getUsername().getText());
        mU.setPassword(vU.getPassword().getText());
        mU.setLevel(vU.getLevel().getText());
        mU.updateDataUser();
        bersihkan();
        kontrolButton();
    }
    
    public void simpan(){
        mU = new modelUser();
        
        mU.setUsername(vU.getUsername().getText());
        mU.setPassword(vU.getPassword().getText());
        mU.setLevel(vU.getLevel().getText());
        
        mU.simpanDataUser();
        bersihkan();
        
    }
}
