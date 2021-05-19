/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import perpus.db.KoneksiDatabase;

/**
 *
 * @author hp
 */
public class modelPengembalian {
    private int idAnggota;
    private int idBuku;
    private int idPeminjaman;
    private int jumlah;
    private int stokAkhir;
    private String namaAnggota;
    private String judulBuku;
    private String tglPinjam;
    private String statusPinjam;
    

    KoneksiDatabase koneksi = new KoneksiDatabase();
    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }
    
    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public int getStokAkhir() {
        return stokAkhir;
    }

    public void setStokAkhir(int stokAkhir) {
        this.stokAkhir = stokAkhir;
    }
    
    
    
    public void tambahStok(){
        String cek = "SELECT stok from buku WHERE idBuku = '"+getIdBuku()+"'";
        String jumlah_stok = "SELECT jumlah from peminjaman WHERE idPeminjaman = '"+getIdPeminjaman()+"'";
        try {
            Statement stat = (Statement) koneksi.getKoneksi().createStatement();
            ResultSet res_stok = stat.executeQuery(cek);
            res_stok.next();
            int stok_buku = Integer.parseInt(res_stok.getString("stok"));
            
            ResultSet res_jumlah = stat.executeQuery(jumlah_stok);
            res_jumlah.next();
            int stok_akhir = stok_buku + Integer.parseInt(res_jumlah.getString("jumlah"));
            setStokAkhir(stok_akhir);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal \n"+ex);
        }
    }
    
    public void simpanPengembalian(){
        //inisialisasi query untuk simpan ke data
        String sql = "INSERT INTO pengembalian (idPeminjaman, idAnggota, idBuku, statusPengembalian)"
                + " VALUES ('"+getIdPeminjaman()+"', '"+getIdAnggota()+"',"
                + " '"+getIdBuku()+"', 'dikembalikan')";
        
        String edit_stok = "UPDATE buku SET stok = '"+getStokAkhir()+"' WHERE idBuku = '"+getIdBuku()+"'";
        
        try {
            PreparedStatement eksekusi_sql = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi_sql.execute();
            
            PreparedStatement eksekusi_stok = KoneksiDatabase.getKoneksi().prepareStatement(edit_stok);
            eksekusi_stok.execute();
            
            JOptionPane.showMessageDialog(null, "Data transaksi berhasil disimpan");
        } catch (SQLException ex) {
            Logger.getLogger(modelPeminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateDataPeminjaman(){
        String cek = "SELECT statusPengembalian from pengembalian WHERE idPeminjaman = '"+getIdPeminjaman()+"'";
        try{
            Statement stat = (Statement) KoneksiDatabase.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(cek);
            res.next();
            statusPinjam = res.getString("statusPengembalian");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "gagal \n"+ ex);
        }
        
        
          String sql = "UPDATE peminjaman SET statusPinjam = '"+statusPinjam+"' WHERE idPeminjaman = '"+getIdPeminjaman()+"'";
        
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
