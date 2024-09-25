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
public class CONGVIEC extends javax.swing.JFrame {

    DAL_CONGVIEC cv = new DAL_CONGVIEC();
    DAL_DETAI dt = new DAL_DETAI();
    
    public String sttcu;
    
    public CONGVIEC() {
        initComponents();
        tbcv.setModel(cv.Select());
        for(int i=0; i< dt.Select().getRowCount(); i++){
            cbbmadt.addItem(dt.Select().getValueAt(i, 0).toString());
        }
    }
    public void click(){
        int row = tbcv.getSelectedRow();
        String madt = tbcv.getValueAt(row, 0).toString();
        String stt = tbcv.getValueAt(row, 1).toString();
        String tencv= tbcv.getValueAt(row, 2).toString();
        String ngaybd = tbcv.getValueAt(row, 3).toString();
        String ngaykt = tbcv.getValueAt(row, 4).toString();
        cbbmadt.setSelectedItem(madt);
        txtstt.setText(stt);
        txttencv.setText(tencv);
        txtngaybd.setText(ngaybd);
        txtngaykt.setText(ngaykt);
        sttcu = stt;
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
        cbbmadt = new javax.swing.JComboBox<>();
        txtstt = new javax.swing.JTextField();
        txttencv = new javax.swing.JTextField();
        txtngaybd = new javax.swing.JTextField();
        txtngaykt = new javax.swing.JTextField();
        btxem = new javax.swing.JButton();
        btthem = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btdong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcv = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã Đề tài ");

        jLabel2.setText("Số thứ tự");

        jLabel3.setText("Tên Công việc");

        jLabel4.setText("Ngày bắt đầu (dd/mm/yyyy)");

        jLabel5.setText("Ngày kết thức (dd/mm/yyyy)");

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

        tbcv.setModel(new javax.swing.table.DefaultTableModel(
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
        tbcv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btxem)
                                .addGap(64, 64, 64)
                                .addComponent(btthem)
                                .addGap(73, 73, 73)
                                .addComponent(btsua)
                                .addGap(71, 71, 71)
                                .addComponent(btxoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(btdong))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbbmadt, 0, 439, Short.MAX_VALUE)
                                    .addComponent(txtstt)
                                    .addComponent(txttencv)
                                    .addComponent(txtngaybd)
                                    .addComponent(txtngaykt)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbmadt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtstt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txttencv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtngaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btxem)
                    .addComponent(btthem)
                    .addComponent(btsua)
                    .addComponent(btxoa)
                    .addComponent(btdong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btxemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxemActionPerformed
         tbcv.setModel(cv.Select());
    }//GEN-LAST:event_btxemActionPerformed

    private void btdongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btdongActionPerformed

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        DAL_CONGVIEC tmp = new DAL_CONGVIEC(cbbmadt.getSelectedItem().toString(), txtstt.getText(),txttencv.getText(), txtngaybd.getText(), txtngaykt.getText());
        int a = 0;
        for(int i=0; i<tbcv.getRowCount(); i++){
            if(tmp.getMadt().equalsIgnoreCase(tbcv.getValueAt(i,0).toString()) && tmp.getSTT().equalsIgnoreCase(tbcv.getValueAt(i, 1).toString())) a++;
        }
        if(a == 0){
            boolean kq = tmp.Insert(tmp);
            if(kq) JOptionPane.showMessageDialog(null,"Insert success");
            else JOptionPane.showMessageDialog(null,"Insert fail");
        }
        else JOptionPane.showMessageDialog(null,"ĐÃ TỒN TẠI");
    }//GEN-LAST:event_btthemActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        DAL_CONGVIEC tmp = new DAL_CONGVIEC(cbbmadt.getSelectedItem().toString(), txtstt.getText(),txttencv.getText(), txtngaybd.getText(), txtngaykt.getText());
        boolean kq = tmp.Update(tmp,sttcu);
        if(kq) JOptionPane.showMessageDialog(null,"Update success");
        else JOptionPane.showMessageDialog(null,"Update fail");
    }//GEN-LAST:event_btsuaActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        DAL_CONGVIEC tmp = new DAL_CONGVIEC(cbbmadt.getSelectedItem().toString(), txtstt.getText(),txttencv.getText(), txtngaybd.getText(), txtngaykt.getText());
        boolean kq = tmp.Delete(tmp);
        if(kq) JOptionPane.showMessageDialog(null,"Delete success");
        else JOptionPane.showMessageDialog(null,"Delete fail");
    }//GEN-LAST:event_btxoaActionPerformed

    private void tbcvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcvMouseClicked
        click();
    }//GEN-LAST:event_tbcvMouseClicked

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
            java.util.logging.Logger.getLogger(CONGVIEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONGVIEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONGVIEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONGVIEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CONGVIEC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdong;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JButton btxem;
    private javax.swing.JButton btxoa;
    private javax.swing.JComboBox<String> cbbmadt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbcv;
    private javax.swing.JTextField txtngaybd;
    private javax.swing.JTextField txtngaykt;
    private javax.swing.JTextField txtstt;
    private javax.swing.JTextField txttencv;
    // End of variables declaration//GEN-END:variables
}
