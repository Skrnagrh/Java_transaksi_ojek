/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksiojek;

import com.placeholder.PlaceHolder;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author Personal
 */
public class transaksi_ojek extends javax.swing.JFrame {

    public void selectData() throws SQLException{
        //Untuk Menampilkan ke Dalam Tabel
    String kolom[] = {"No Custemer", "Nama", "Dari", "Tujuan", "Jarak", "Harga"};
    DefaultTableModel dtm = new DefaultTableModel(null, kolom);
    String SQL = "SELECT * FROM tablequiz";
    ResultSet rs = konek_db.executeQuery(SQL);
    try {
        while(rs.next()){
        String No = rs.getString(1);//untuk kolom 1
        String Nama = rs.getString(2);//untuk kolom 2
        String Dari = rs.getString(3);// kolom 3
        String Tujuan = rs.getString(4);// kolom 4
        String Jarak = "";
            if ("1".equals(rs.getString(5))){
                Jarak = "1";
            }else if ("2".equals(rs.getString(5))){
                Jarak = "2";
            }else if ("3".equals(rs.getString(5))){
                Jarak = "3";
            }else if ("4".equals(rs.getString(5))){
                Jarak = "4";
            }else if ("5".equals(rs.getString(5))){
                Jarak = "5";
            }else if ("6".equals(rs.getString(5))){
                Jarak = "6";
            }else if ("7".equals(rs.getString(5))){
                Jarak = "7";
            }else if ("8".equals(rs.getString(5))){
                Jarak = "8";
            }else if ("9".equals(rs.getString(5))){
                Jarak = "9";
            }else {
                Jarak = "10";
            }
        String Harga = rs.getString(6);// kolom 5
        String Data[] = {No, Nama, Dari, Tujuan, Jarak, Harga}; //arraylist
        dtm.addRow(Data);
        }
    }catch (SQLException ex){
        Logger.getLogger(transaksi_ojek.class.getName()).log(Level.SEVERE, null, ex);
    }
    //source tabel
    tabel.setModel(dtm);
    JTableHeader header = tabel.getTableHeader();
    header.setFont(new Font("Tekton Pro", Font.BOLD, 18));
}
    //Variable
    private String kode;
    private long harga;
    int km;
    public transaksi_ojek() throws SQLException {
        initComponents();
        //untuk Menampilkan Data Dalam Tabel
        selectData();
                //Placeholder
                PlaceHolder holder1 = new PlaceHolder (no, "No Custemer");
                PlaceHolder holder2 = new PlaceHolder (nama, "Nama");
                PlaceHolder holder3 = new PlaceHolder (dari, "Dari");
                PlaceHolder holder4 = new PlaceHolder (tujuan, "Tujuan");
                PlaceHolder holder5 = new PlaceHolder (hg, "Harga");
                PlaceHolder holder6 = new PlaceHolder (cari, "Search");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dari = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tujuan = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        hg = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel1.setText("No Custemer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel2.setText("Jarak");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 40));

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel3.setText("Tujuan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel4.setText("Dari");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 30));

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel5.setText(":");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 30, 40));

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel6.setText(":");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 30, 30));

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel7.setText(":");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 30, 30));

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel8.setText(":");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 30, 30));

        no.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 180, 30));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nocustemer ", "Nama", "Dari", "Tujuan", "Jarak", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 850, 180));

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 150, -1));

        jButton3.setBackground(new java.awt.Color(51, 255, 255));
        jButton3.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 150, -1));

        jButton4.setBackground(new java.awt.Color(51, 255, 255));
        jButton4.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 150, -1));

        dari.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        dari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dariActionPerformed(evt);
            }
        });
        jPanel1.add(dari, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 180, 30));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, 100));

        jLabel11.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel11.setText("Aplikasi Transaksi Sederhana O-Jek");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 630, -1));

        jLabel16.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 991, 120));

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel12.setText("Nama");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel13.setText(":");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 30, 30));

        jLabel15.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 50, 40));

        cari.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cariMouseClicked(evt);
            }
        });
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel1.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 420, 40));

        jLabel22.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel22.setText("Km");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 40, 30));

        tujuan.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(tujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 180, 30));

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jButton5.setText("Excel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 150, -1));

        nama.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, 30));

        jLabel23.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel23.setText("Rp. ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 40, 30));

        hg.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(hg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, 30));

        jLabel17.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel17.setText("Harga");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 120, 40));

        jLabel18.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel18.setText(":");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 30, 40));

        box.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });
        jPanel1.add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, 30));

        getContentPane().add(jPanel1);

        setSize(new java.awt.Dimension(998, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // untuk Menghapus yang ada di Display
        no.setText("");
        nama.setText("");
        dari.setText("");
        tujuan.setText("");
        hg.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Untuk Menyimpan Dalam Tabel
        if ("".equals(no.getText()) ||"".equals(nama.getText()) ||"".equals(dari.getText())||"".equals(tujuan.getText()) ||"".equals(hg.getText())){
            JOptionPane.showMessageDialog(this, "Harap Isi Dengan Benar", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            String Jenis;
            Jenis = (String) box.getSelectedItem();
             //Menampilkan If Else Pemilihan Jenis Kendaraan
            String SQL = "INSERT INTO tablequiz (NoCustemer, Nama, Dari, Tujuan, Jarak, Harga)"
            + "VALUES('"+no.getText()+"','"+nama.getText()+"','"+dari.getText()+"','"+tujuan.getText()+"',"
            + "'"+Jenis+"','"+hg.getText()+"')";
            try {
                int status = konek_db.execute(SQL);
                if(status == 1){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Di Tambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    selectData();
                }else{
                    JOptionPane.showMessageDialog(this, "Data Gagal Di Tambahkan", "Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(transaksi_ojek.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Untuk Menghapus Yang Ada di Tabel
        int baris = tabel.getSelectedRow();
        if (baris != -1){
            String Nocus = tabel.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tablequiz WHERE NoCustemer = '"+Nocus+"'";
            try {
                int status = konek_db.execute(SQL);
                if (status== 1){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Di Hapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Data Gagal Di Hapus", "Gagal", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(transaksi_ojek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }try {
            selectData();
        } catch (SQLException ex) {
            Logger.getLogger(transaksi_ojek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void dariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dariActionPerformed

    }//GEN-LAST:event_dariActionPerformed

    private void cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariMouseClicked
        
    }//GEN-LAST:event_cariMouseClicked
    
    //Metode Ekspor excel
     public void eksporexcel() throws IOException{
        FileWriter file;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("[B]export_output/excel[/B]"));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION){
            try{
                    TableModel model = tabel.getModel();
                    file = new FileWriter(new File(chooser.getSelectedFile() +".xls"));
                    
                    for(int i=0; i < model.getColumnCount(); i++){
                    file.write(model.getColumnName(i).toUpperCase() + "\t");
                }
                    file.write("\n");
                    for(int i=0; i < model.getRowCount(); i++){
                    for(int j=0; j < model.getRowCount(); j++){
                    file.write(model.getValueAt(i,j).toString() + "\t");       
                }
                    file.write("\n");
                }
                    file.close(); 
            } catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            //Puntuk pemanggilan source code ekspor excel
            eksporexcel();
        } catch (IOException ex) {
            Logger.getLogger(transaksi_ojek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
      //untuk pencarian berdasarkan nomor custemer
        DefaultTableModel tab = new DefaultTableModel();
        tab.addColumn("No Custemer");
        tab.addColumn("Nama");
        tab.addColumn("Dari");
        tab.addColumn("Tujuan");
        tab.addColumn("Jarak");
        tab.addColumn("Harga");
        
            try{
                String SQL = "SELECT * FROM tablequiz WHERE NoCustemer LIKE '%" + cari.getText()+ "%'";
                ResultSet rs = konek_db.executeQuery(SQL);
                while(rs.next()){
                    tab.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    });
                }
                tabel.setModel(tab);
            } catch (SQLException ex) {
            Logger.getLogger(transaksi_ojek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseEntered

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        //Menampilkan If Else Pemilihan Jenis Kendaraan
        kode = (String) box.getSelectedItem();
        km = Integer.parseInt(kode);
        if (km <= 5){
            harga = 10000;
        }else {
            harga = km * 2000;
        }
        hg.setText(String.valueOf(harga));
    }//GEN-LAST:event_boxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(transaksi_ojek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi_ojek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi_ojek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi_ojek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new transaksi_ojek().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(transaksi_ojek.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField dari;
    private javax.swing.ButtonGroup group;
    private javax.swing.JTextField hg;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tujuan;
    // End of variables declaration//GEN-END:variables
}