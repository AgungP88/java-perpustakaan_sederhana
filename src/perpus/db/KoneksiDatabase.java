/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author hp
 */
public class KoneksiDatabase {
    //inisialisasikan variabel dengan connection file class JDBC
    private static Connection conn;
    //kemudian fungsi class properties untuk memanggil file config database yang kita buat sebelumnya
    private static Properties propert = new Properties();
    
    //kemudian kita akan membuat fungsi untuk ke database
    public static Connection getKoneksi()throws SQLException{
        //cek apakah ada koneksi
        if(conn == null){
            
            try {
                //load file konfigurasiDatabase.properties
                propert.load(new FileInputStream("C:\\Users\\hp\\Documents\\NetBeansProjects\\perpustakaan_fix\\Perpustakaan\\src\\perpus\\db\\konfigurasiKoneksi.properties"));
            } catch (IOException ex) {
                System.err.println("Error mengambil file"+ex);
                System.err.println("Error membaca file file"+ex);
            }
                //inisialisasi koneksi database
                conn = DriverManager.getConnection(propert.getProperty("jdbc.url"), propert.getProperty("jdbc.username"), propert.getProperty("jdbc.password"));
            
                //tampilkan error kepada user jika file tidak ditemukan
                
            
        
    }
        return conn;
}
    public static void main(String[] args) throws SQLException {
        if(getKoneksi().equals(conn)){
            System.out.println("Koneksi Berhasil");
        }
    }
}