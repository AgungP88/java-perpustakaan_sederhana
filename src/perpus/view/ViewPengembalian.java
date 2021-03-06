/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.view;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import perpus.controller.controllerPengembalian;

/**
 *
 * @author hp
 */
public class ViewPengembalian extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewPengembalian
     */
    private DefaultTableModel model;
    private String idPengembalian;
    private controllerPengembalian cPP;
    public ViewPengembalian() {
        initComponents();
        cPP = new controllerPengembalian(this);
    }

    public JTextField getIdPeminjamanTxt() {
        return idPeminjamanTxt;
    }

    public JTextField getJudulBukuTxt() {
        return judulBukuTxt;
    }

    public JTextField getJumlahTxt() {
        return jumlahTxt;
    }

    public JTextField getNamaAnggotaTxt() {
        return namaAnggotaTxt;
    }

    public JTextField getTglBukuTxt() {
        return tglBukuTxt;
    }

    public JTextField getIdAnggotaTxt() {
        return idAnggotaTxt;
    }

    public JTextField getIdBukuTxt() {
        return idBukuTxt;
    }

    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idPeminjamanTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namaAnggotaTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        judulBukuTxt = new javax.swing.JTextField();
        cariDataPeminjaman = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tglBukuTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jumlahTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idAnggotaTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        idBukuTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        prosesTransaksi = new javax.swing.JButton();
        batalTransaksi = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Model Peminjaman");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Form Pengembalian Buku");

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Peminjaman"));

        jLabel2.setText("ID Peminjaman");

        idPeminjamanTxt.setEditable(false);
        idPeminjamanTxt.setBackground(new java.awt.Color(255, 255, 255));
        idPeminjamanTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPeminjamanTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Anggota");

        namaAnggotaTxt.setEditable(false);
        namaAnggotaTxt.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Judul Buku");

        judulBukuTxt.setEditable(false);
        judulBukuTxt.setBackground(new java.awt.Color(255, 255, 255));
        judulBukuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulBukuTxtActionPerformed(evt);
            }
        });

        cariDataPeminjaman.setBackground(new java.awt.Color(153, 255, 153));
        cariDataPeminjaman.setText("Cari Data");
        cariDataPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariDataPeminjamanActionPerformed(evt);
            }
        });

        jLabel5.setText("Tanggal Pinjam");

        tglBukuTxt.setEditable(false);
        tglBukuTxt.setBackground(new java.awt.Color(255, 255, 255));
        tglBukuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBukuTxtActionPerformed(evt);
            }
        });

        jLabel6.setText("Jumlah");

        jumlahTxt.setEditable(false);
        jumlahTxt.setBackground(new java.awt.Color(255, 255, 255));
        jumlahTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahTxtActionPerformed(evt);
            }
        });

        jLabel7.setText("ID Anggota");

        idAnggotaTxt.setEditable(false);
        idAnggotaTxt.setBackground(new java.awt.Color(255, 255, 255));
        idAnggotaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAnggotaTxtActionPerformed(evt);
            }
        });

        jLabel8.setText("ID Buku");

        idBukuTxt.setEditable(false);
        idBukuTxt.setBackground(new java.awt.Color(255, 255, 255));
        idBukuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBukuTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idPeminjamanTxt)
                    .addComponent(namaAnggotaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(idAnggotaTxt)
                    .addComponent(tglBukuTxt))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumlahTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(idBukuTxt)
                            .addComponent(judulBukuTxt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cariDataPeminjaman)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idPeminjamanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(idBukuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(idAnggotaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judulBukuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaAnggotaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jumlahTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglBukuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cariDataPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        prosesTransaksi.setBackground(new java.awt.Color(153, 255, 153));
        prosesTransaksi.setText("Proses Pengembalian");
        prosesTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesTransaksiActionPerformed(evt);
            }
        });

        batalTransaksi.setBackground(new java.awt.Color(255, 153, 153));
        batalTransaksi.setText("Batal");
        batalTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(batalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(prosesTransaksi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prosesTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariDataPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariDataPeminjamanActionPerformed
        // TODO add your handling code here:
        ViewListDataPeminjaman vldp = new ViewListDataPeminjaman(this);
        vldp.setVisible(true);
    }//GEN-LAST:event_cariDataPeminjamanActionPerformed

    private void prosesTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesTransaksiActionPerformed
        // TODO add your handling code here:
        cPP.simpanPengembalian();
        cPP.updateDataPeminjaman();
    }//GEN-LAST:event_prosesTransaksiActionPerformed

    private void batalTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalTransaksiActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_batalTransaksiActionPerformed

    private void judulBukuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulBukuTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulBukuTxtActionPerformed

    private void tglBukuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBukuTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglBukuTxtActionPerformed

    private void jumlahTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahTxtActionPerformed

    private void idPeminjamanTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPeminjamanTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPeminjamanTxtActionPerformed

    private void idAnggotaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAnggotaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAnggotaTxtActionPerformed

    private void idBukuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBukuTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBukuTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalTransaksi;
    private javax.swing.JButton cariDataPeminjaman;
    private javax.swing.JTextField idAnggotaTxt;
    private javax.swing.JTextField idBukuTxt;
    private javax.swing.JTextField idPeminjamanTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField judulBukuTxt;
    private javax.swing.JTextField jumlahTxt;
    private javax.swing.JTextField namaAnggotaTxt;
    private javax.swing.JButton prosesTransaksi;
    private javax.swing.JTextField tglBukuTxt;
    // End of variables declaration//GEN-END:variables
}
