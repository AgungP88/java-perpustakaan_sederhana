/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_mvc.dashboard;
import java_mvc.dashboard_karyawan;
import javax.swing.JOptionPane;
import perpus.db.KoneksiDatabase;
import perpus.view.ViewLogin;

/**
 *
 * @author hp
 */
public class modelLogin {
    KoneksiDatabase koneksi = new KoneksiDatabase();
    private String username;
    private String password;

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
    
    public void login(){
        String sql = "SELECT * FROM user WHERE username = '"+getUsername()+"' AND password = '"+getPassword()+"'";
        
        try {
            Statement stat = (Statement) koneksi.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            if (res.next()) {
                if (getUsername().equals(res.getString("username")) && getPassword().equals(res.getString("password"))) {
                    JOptionPane.showMessageDialog(null, "Login Berhasil");
                    if (res.getString("level").equals("admin")) {
                        dashboard dsb = new dashboard();
                        dsb.setVisible(true);
                    } else{
                        dashboard_karyawan dsb = new dashboard_karyawan();
                        dsb.setVisible(true);
                        
                    }
                }
            } else{
                JOptionPane.showMessageDialog(null, "Username atau Password anda salah");
                ViewLogin vL = new ViewLogin();
                
                vL.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Login Gagal \n" + ex);
        }
    }
}
