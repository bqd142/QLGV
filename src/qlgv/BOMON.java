/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlgv;

import javax.swing.JOptionPane;

/**
 *
 * @author bqd14
 */
public class BOMON extends javax.swing.JFrame {

    DAL_BOMON bm = new DAL_BOMON();
    DAL_KHOA k = new DAL_KHOA();
    public BOMON() {
        initComponents();
        tbbomon.setModel(bm.Select());
        for(int i=0; i< k.Select().getRowCount(); i++){
            cbbmakhoa.addItem(String.valueOf(k.Select().getValueAt(i,0)));
        }
        
    }
    public void click(){
        int row = tbbomon.getSelectedRow();
        String mbm = String.valueOf(tbbomon.getValueAt(row, 0));
        String tbm = String.valueOf(tbbomon.getValueAt(row, 1));
        String phong = String.valueOf(tbbomon.getValueAt(row, 2));
        String dt = String.valueOf(tbbomon.getValueAt(row, 3));
        String truongbm = String.valueOf(tbbomon.getValueAt(row, 4));
        String makhoa = String.valueOf(tbbomon.getValueAt(row, 5));
        String ngaynhanchuc = String.valueOf(tbbomon.getValueAt(row, 6));
        txtmabomon.setText(mbm);
        txttenbomon.setText(tbm);
        txtphong.setText(phong);
        txtdienthoai.setText(dt);
        txttruongbomon.setText(truongbm);
        cbbmakhoa.setSelectedItem(makhoa);
        txtngaynhanchuc.setText(ngaynhanchuc);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmabomon = new javax.swing.JTextField();
        txttenbomon = new javax.swing.JTextField();
        txtphong = new javax.swing.JTextField();
        txtdienthoai = new javax.swing.JTextField();
        txttruongbomon = new javax.swing.JTextField();
        cbbmakhoa = new javax.swing.JComboBox<>();
        txtngaynhanchuc = new javax.swing.JTextField();
        btxem = new javax.swing.JButton();
        btthem = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btdong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbomon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã Bộ Môn");

        jLabel3.setText("Tên Bộ Môn");

        jLabel4.setText("Phòng");

        jLabel5.setText("Điện Thoại");

        jLabel6.setText("Trưởng Bộ Môn");

        jLabel7.setText("Mã Khoa");

        jLabel8.setText("Ngày Nhận Chức");

        btxem.setText("Xem");
        btxem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxemActionPerformed(evt);
            }
        });

        btthem.setText("Thêm");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });

        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btxoa.setText("Xoá");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        btdong.setText("Đóng");
        btdong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdongActionPerformed(evt);
            }
        });

        tbbomon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbbomon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbbomonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbbomon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btxem)
                        .addGap(68, 68, 68)
                        .addComponent(btthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btsua)
                        .addGap(78, 78, 78)
                        .addComponent(btxoa)
                        .addGap(69, 69, 69)
                        .addComponent(btdong))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 611, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdienthoai)
                                    .addComponent(txtphong)
                                    .addComponent(txttruongbomon)
                                    .addComponent(cbbmakhoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtngaynhanchuc)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmabomon, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                            .addComponent(txttenbomon))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtmabomon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttenbomon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttruongbomon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbmakhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtngaynhanchuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btxem)
                    .addComponent(btthem)
                    .addComponent(btsua)
                    .addComponent(btxoa)
                    .addComponent(btdong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        DAL_BOMON tmp = new DAL_BOMON(txtmabomon.getText(), txttenbomon.getText(), txtphong.getText(), txtdienthoai.getText(), txttruongbomon.getText(), cbbmakhoa.getSelectedItem().toString(), txtngaynhanchuc.getText());
        
        int a = 0;
        for(int i=0; i< tbbomon.getRowCount();i++){
            if(tmp.getMaBomon().equalsIgnoreCase(String.valueOf(tbbomon.getValueAt(i,0)))) a++;
        }
        if(a==0){
            boolean kq = tmp.Insert(tmp);
            if(kq) JOptionPane.showMessageDialog(null,"Insert success");
            else JOptionPane.showMessageDialog(null,"Insert fail"); 
        }
        else JOptionPane.showMessageDialog(null,"Mã bộ môn đã tồn tại"); 
      
    }//GEN-LAST:event_btthemActionPerformed

    private void btxemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxemActionPerformed
        tbbomon.setModel(bm.Select());
    }//GEN-LAST:event_btxemActionPerformed

    private void btdongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btdongActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
         DAL_BOMON tmp = new DAL_BOMON(txtmabomon.getText(), txttenbomon.getText(), txtphong.getText(), txtdienthoai.getText(), txttruongbomon.getText(), cbbmakhoa.getSelectedItem().toString(), txtngaynhanchuc.getText());
         boolean kq = tmp.Update(tmp);
         if(kq) JOptionPane.showMessageDialog(null,"Update success");
         else JOptionPane.showMessageDialog(null,"Update fail");
    }//GEN-LAST:event_btsuaActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        DAL_BOMON tmp = new DAL_BOMON(txtmabomon.getText(), txttenbomon.getText(), txtphong.getText(), txtdienthoai.getText(), txttruongbomon.getText(), cbbmakhoa.getSelectedItem().toString(), txtngaynhanchuc.getText());
         boolean kq = tmp.Delete(tmp);
         if(kq) JOptionPane.showMessageDialog(null,"Delete success");
         else JOptionPane.showMessageDialog(null,"Delete fail");
    }//GEN-LAST:event_btxoaActionPerformed

    private void tbbomonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbbomonMouseClicked
        click();
    }//GEN-LAST:event_tbbomonMouseClicked

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
            java.util.logging.Logger.getLogger(BOMON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOMON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOMON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOMON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOMON().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdong;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JButton btxem;
    private javax.swing.JButton btxoa;
    private javax.swing.JComboBox<String> cbbmakhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbbomon;
    private javax.swing.JTextField txtdienthoai;
    private javax.swing.JTextField txtmabomon;
    private javax.swing.JTextField txtngaynhanchuc;
    private javax.swing.JTextField txtphong;
    private javax.swing.JTextField txttenbomon;
    private javax.swing.JTextField txttruongbomon;
    // End of variables declaration//GEN-END:variables
}