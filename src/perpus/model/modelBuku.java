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
public class modelBuku {
    private String idBuku;
    private String judulBuku;
    private String pengarang;
    private String penerbit;
    private int tahun;
    private int stok;
    
    KoneksiDatabase koneksi = new KoneksiDatabase();
    
    public modelBuku(){
        
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void simpanDataBuku(){
        //inisialisasi query untuk insert kedalam database
        String sql = ("INSERT INTO buku (judulBuku, pengarang, penerbit, tahun, stok)" 
                + "VALUES ('"+getJudulBuku()+"', '"+getPengarang()+"', '"+getPenerbit()+"'"
                + ", '"+getTahun()+"', '"+getStok()+"')");
        
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
    
    public void deleteDataBuku(){
        String sql = "DELETE FROM buku WHERE idBuku = '"+getIdBuku()+"'";
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
    
    public void updateDataBuku(){
        //inisialisasi query untuk insert kedalam database
//        String sql = ("INSERT INTO pelanggan (namaPelanggan, noHp, jenisKelamin, umur, alamat)" 
//                + "VALUES ('"+getNamaPelanggan()+"', '"+getNomorHp()+"', '"+getJenisKelamin()+"'"
//                + ", '"+getUmur()+"', '"+getAlamat()+"')");
          String sql = "UPDATE buku SET judulBuku = '"+getJudulBuku()+"'"
                  + ",pengarang = '"+getPengarang()+"'"
                  + ",penerbit = '"+getPenerbit()+"'"
                  + ",tahun = '"+getTahun()+"'"
                  + ",stok = '"+getStok()+"' WHERE idBuku = '"+getIdBuku()+"'";
        
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
