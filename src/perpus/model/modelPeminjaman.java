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
public class modelPeminjaman {
    private int idAnggota;
    private int idBuku;
    private int jumlah;
    private int stokAkhir;
    
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

    public int getStokAkhir() {
        return stokAkhir;
    }

    public void setStokAkhir(int stokAkhir) {
        this.stokAkhir = stokAkhir;
    }

    public void kurangStok(){
        String cek = "SELECT stok from buku WHERE idBuku = '"+getIdBuku()+"'";
        try {
            Statement stat = (Statement) koneksi.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(cek);
            res.next();
            int stok_akhir = Integer.parseInt(res.getString("stok")) - getJumlah();
            setStokAkhir(stok_akhir);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal \n"+ex);
        }
    }
    
    public void simpanPeminjaman(){
        //inisialisasi query untuk simpan ke data
        String sql = "INSERT INTO peminjaman (idAnggota, idBuku, jumlah, statusPinjam)"
                + " VALUES ('"+getIdAnggota()+"', '"+getIdBuku()+"',"
                + " '"+getJumlah()+"', 'dipinjam')";
        
        String edit_stok = "UPDATE buku SET stok = '"+getStokAkhir()+"' WHERE idBuku = '"+getIdBuku()+"'";
        
        try {
            PreparedStatement eksekusi_sql = KoneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi_sql.execute();
            
            PreparedStatement eksekusi_stok = KoneksiDatabase.getKoneksi().prepareStatement(edit_stok);
            eksekusi_stok.execute();
            
            JOptionPane.showMessageDialog(null, "Data transaksi berhasil disimpan");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Data transaksi gagal disimpan"+ex);
        }
    }
}
