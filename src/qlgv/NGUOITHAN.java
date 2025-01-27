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
public class NGUOITHAN extends javax.swing.JFrame {

    DAL_NGUOITHAN nt = new DAL_NGUOITHAN();
    DAL_GIAOVIEN gv = new DAL_GIAOVIEN();
    
    public String tencu;
    
    public NGUOITHAN() {
        initComponents();
        tbnguoithan.setModel(nt.Select());
        for(int i=0; i<gv.Select().getRowCount();i++){
            cbbmagv.addItem(gv.Select().getValueAt(i,0).toString());
        }
    }
    public void click(){
        int row = tbnguoithan.getSelectedRow();
        String magv = tbnguoithan.getValueAt(row, 0).toString();
        String ten = tbnguoithan.getValueAt(row, 1).toString();
        String ngaysinh = tbnguoithan.getValueAt(row, 2).toString();
        String gt = tbnguoithan.getValueAt(row, 3).toString();
        cbbmagv.setSelectedItem(magv);
        txtten.setText(ten);
        txtngaysinh.setText(ngaysinh);
        cbbgioitinh.setSelectedItem(gt);
        tencu = ten;
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
        cbbmagv = new javax.swing.JComboBox<>();
        txtten = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        cbbgioitinh = new javax.swing.JComboBox<>();
        btxem = new javax.swing.JButton();
        btthem = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btdong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnguoithan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã Giáo Viên");

        jLabel2.setText("Tên Người Thân");

        jLabel3.setText("Ngày Sinh(dd/mm/yyyy)");

        jLabel4.setText("Giới Tính");

        cbbgioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác ?!" }));

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

        tbnguoithan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbnguoithan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnguoithanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbnguoithan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btxem)
                        .addGap(69, 69, 69)
                        .addComponent(btthem)
                        .addGap(69, 69, 69)
                        .addComponent(btsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btxoa)
                        .addGap(57, 57, 57)
                        .addComponent(btdong))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbmagv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtten)
                            .addComponent(txtngaysinh)
                            .addComponent(cbbgioitinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbmagv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btxem)
                    .addComponent(btthem)
                    .addComponent(btsua)
                    .addComponent(btxoa)
                    .addComponent(btdong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btxemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxemActionPerformed
       tbnguoithan.setModel(nt.Select());
    }//GEN-LAST:event_btxemActionPerformed

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        DAL_NGUOITHAN nt = new DAL_NGUOITHAN(cbbmagv.getSelectedItem().toString(),txtten.getText(),txtngaysinh.getText(),cbbgioitinh.getSelectedItem().toString());
        int a = 0;
        for(int i = 0; i< tbnguoithan.getRowCount(); i++){
            if(nt.getMagv().equalsIgnoreCase(tbnguoithan.getValueAt(i, 0).toString()) && nt.getTen_nguoithan().equalsIgnoreCase(tbnguoithan.getValueAt(i, 1).toString())) a++;
        }
        if(a==0){
            boolean kq = nt.Insert(nt);
            if(kq) JOptionPane.showMessageDialog(null,"Insert success");
            else JOptionPane.showMessageDialog(null,"Insert fail");
        }
        else JOptionPane.showMessageDialog(null,"Đã tồn tại");
    }//GEN-LAST:event_btthemActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        DAL_NGUOITHAN nt = new DAL_NGUOITHAN(cbbmagv.getSelectedItem().toString(),txtten.getText(),txtngaysinh.getText(),cbbgioitinh.getSelectedItem().toString());
        boolean kq = nt.Update(nt,tencu);
        if(kq) JOptionPane.showMessageDialog(null,"Update success");
        else JOptionPane.showMessageDialog(null,"Update fail");
    }//GEN-LAST:event_btsuaActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        DAL_NGUOITHAN nt = new DAL_NGUOITHAN(cbbmagv.getSelectedItem().toString(),txtten.getText(),txtngaysinh.getText(),cbbgioitinh.getSelectedItem().toString());
        boolean kq = nt.Delete(nt);
        if(kq) JOptionPane.showMessageDialog(null,"delete success");
        else JOptionPane.showMessageDialog(null,"delete fail");
    }//GEN-LAST:event_btxoaActionPerformed

    private void tbnguoithanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnguoithanMouseClicked
        click();
    }//GEN-LAST:event_tbnguoithanMouseClicked

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
            java.util.logging.Logger.getLogger(NGUOITHAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NGUOITHAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NGUOITHAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NGUOITHAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NGUOITHAN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdong;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JButton btxem;
    private javax.swing.JButton btxoa;
    private javax.swing.JComboBox<String> cbbgioitinh;
    private javax.swing.JComboBox<String> cbbmagv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbnguoithan;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables
}
