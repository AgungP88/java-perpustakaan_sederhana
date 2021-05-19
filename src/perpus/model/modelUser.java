/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import perpus.db.KoneksiDatabase;

/**
 *
 * @author hp
 */

public class modelUser {
    private String idUser;
    private String username;
    private String password;
    private String level;
    
    KoneksiDatabase koneksi = new KoneksiDatabase();
    public modelUser(){
        
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
  
    public void simpanDataUser(){
        //inisialisasi query untuk insert kedalam database
        String sql = ("INSERT INTO user ( username, password, level)" 
                + "VALUES ('"+getUsername()+"', '"+getPassword()+"'"
                + ", '"+getLevel()+"')");
        
        try {
            //inisialisasi preparedstatmen
            PreparedStatement eksekusi = koneksi. getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil di simpan
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan \n"+ex);
        }
    }
    
    public void deleteDataUser(){
        String sql = "DELETE FROM user WHERE idUser = '"+getIdUser()+"'";
        try {
            PreparedStatement eksekusi = koneksi. getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus \n"+ex);
        }
    }
    
    public void updateDataUser(){
          String sql = "UPDATE user SET username = '"+getUsername()+"'"
                  + ",password = '"+getPassword()+"'"
                  + ",level = '"+getLevel()+"'"
                  + "' WHERE idUser = '"+idUser+"'";
        
        try {
            PreparedStatement eksekusi = koneksi. getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan \n"+ex);
        }
    }
    
}
