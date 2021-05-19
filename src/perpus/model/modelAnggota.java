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

public class modelAnggota {
    private String idAnggota;
    private String namaAnggota;
    private String noTelp;
    private String jenisKelamin;
    private String alamat;
    
    KoneksiDatabase koneksi = new KoneksiDatabase();
    public modelAnggota(){
        
    }
    
    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
    public void simpanDataAnggota(){
        //inisialisasi query untuk insert kedalam database
        String sql = ("INSERT INTO anggota (namaAnggota, noTelp, jenisKelamin, alamat)" 
                + "VALUES ('"+getNamaAnggota()+"', '"+getNoTelp()+"', '"+getJenisKelamin()+"'"
                + ", '"+getAlamat()+"')");
        
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
    
    public void deleteDataAnggota(){
        String sql = "DELETE FROM anggota WHERE idPelanggan = '"+getIdAnggota()+"'";
        try {
            //inisialisasi preparedstatmen
            PreparedStatement eksekusi = koneksi. getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil di simpan
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus \n"+ex);
        }
    }
    
    public void updateDataAnggota(){
        //inisialisasi query untuk insert kedalam database
//        String sql = ("INSERT INTO pelanggan (namaPelanggan, noHp, jenisKelamin, umur, alamat)" 
//                + "VALUES ('"+getNamaPelanggan()+"', '"+getNomorHp()+"', '"+getJenisKelamin()+"'"
//                + ", '"+getUmur()+"', '"+getAlamat()+"')");
          String sql = "UPDATE anggota SET namaAnggota = '"+getNamaAnggota()+"'"
                  + ",noTelp = '"+getNoTelp()+"'"
                  + ",jenisKelamin = '"+getJenisKelamin()+"'"
                  + ",alamat = '"+getAlamat()+"' WHERE idAnggota = '"+getIdAnggota()+"'";
        
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
    
}
