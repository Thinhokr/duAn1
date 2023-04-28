/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repository.PhanLoaiHangRepository;
import service.PhanLoaiHangService;
import service.impl.PhanLoaiHangServiceImpl;
import viewModel.KichThuocViewModel;
import viewModel.PhanLoaiHangViewModel;

/**
 *
 * @author Dell
 */
public class FormPhanLoaiHang extends javax.swing.JFrame {

    /**
     * Creates new form FormPhanLoaiHang
     */
    private final PhanLoaiHangService phanLoaiHangSer = new PhanLoaiHangServiceImpl();

    public FormPhanLoaiHang() {
        initComponents();
        setLocationRelativeTo(null);
        loadTb();
        loadTbXoa();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rdOnline.setSelected(true);
        setTitle("Phân loại hàng");
    }

    public void loadTb() {
        ArrayList<PhanLoaiHangViewModel> list = phanLoaiHangSer.getAll();
        DefaultTableModel model = (DefaultTableModel) tblPhanLoai.getModel();
        model.setRowCount(0);
        for (PhanLoaiHangViewModel x : list) {
            model.addRow(new Object[]{x.getMa(), x.getTen(), x.TrangThai2()});
        }
    }

    public void loadTbXoa() {
        ArrayList<PhanLoaiHangViewModel> list = phanLoaiHangSer.getAllXoa();
        DefaultTableModel model = (DefaultTableModel) tblPhanLoai1.getModel();
        model.setRowCount(0);
        for (PhanLoaiHangViewModel x : list) {
            model.addRow(new Object[]{x.getMa(), x.getTen()});
        }
    }

    private boolean validateForm() {
        if (txtMaPL.getText().trim().equals("") || txtTenPL.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Dữ liệu không được để trống");
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhanLoai = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaPL = new javax.swing.JTextField();
        txtTenPL = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtMaDungLuong1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rdOnline = new javax.swing.JRadioButton();
        rdOffline = new javax.swing.JRadioButton();
        rdNgungban = new javax.swing.JRadioButton();
        rdDangchohangve = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhanLoai1 = new javax.swing.JTable();
        btnUpdate1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 400));

        jPanel2.setBackground(new java.awt.Color(158, 195, 192));

        tblPhanLoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã phân loại", "Tên phân loại", "Trạng thái"
            }
        ));
        tblPhanLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhanLoaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhanLoai);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Mã phân loại :");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Tên phân loại :");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add (2).png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update (2).png"))); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delele.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Trạng thái:");

        buttonGroup1.add(rdOnline);
        rdOnline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdOnline.setText("Online");
        rdOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdOnlineActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdOffline);
        rdOffline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdOffline.setText("Offline");
        rdOffline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdOfflineActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdNgungban);
        rdNgungban.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdNgungban.setText("Ngừng bán");
        rdNgungban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNgungbanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdDangchohangve);
        rdDangchohangve.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdDangchohangve.setText("Đang chờ hàng về");
        rdDangchohangve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDangchohangveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtMaPL, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTenPL, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaDungLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdOffline, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(rdDangchohangve, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rdNgungban, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMaDungLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdOnline)
                            .addComponent(rdOffline))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdDangchohangve)
                            .addComponent(rdNgungban))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(14, 14, 14))))
        );

        jTabbedPane1.addTab("Danh sách", jPanel2);

        jPanel3.setBackground(new java.awt.Color(158, 195, 192));

        tblPhanLoai1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã phân loại", "Tên phân loại"
            }
        ));
        tblPhanLoai1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhanLoai1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPhanLoai1);

        btnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update (2).png"))); // NOI18N
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 85, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đã Xóa", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPhanLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhanLoaiMouseClicked
        int row = tblPhanLoai.getSelectedRow();
        txtMaPL.setText(tblPhanLoai.getValueAt(row, 0).toString());
        txtTenPL.setText(tblPhanLoai.getValueAt(row, 1).toString());
        if (tblPhanLoai.getValueAt(row, 2).toString().equals("Online")) {
            rdOnline.setSelected(true);
        } else if (tblPhanLoai.getValueAt(row, 2).toString().equals("Offline")) {
            rdOffline.setSelected(true);
        } else if (tblPhanLoai.getValueAt(row, 2).toString().equals("Đang chờ hàng về")) {
            rdDangchohangve.setSelected(true);
        } else {
            rdNgungban.setSelected(true);
        }
    }//GEN-LAST:event_tblPhanLoaiMouseClicked
    private Integer trangThai() {
        if (rdOnline.isSelected()) {
            return 0;
        } else if (rdOffline.isSelected()) {
            return 1;
        } else if (rdDangchohangve.isSelected()) {
            return 2;
        } else {
            return 3;
        }

    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (validateForm()) {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thêm ?", "Xác nhân thêm.", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                if (phanLoaiHangSer.checkTrungMa(txtMaPL.getText())) {
                    PhanLoaiHangViewModel dl = new PhanLoaiHangViewModel();
                    dl.setMa(txtMaPL.getText().trim());
                    dl.setTen(txtTenPL.getText().trim());
                    dl.setTrangThai(this.trangThai());
                    phanLoaiHangSer.create(dl);
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    loadTb();
                } else {
                    JOptionPane.showMessageDialog(this, "Trùng mã phân loại");
                }
            } else {
                return;
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (validateForm()) {
            String ma = txtMaPL.getText().toUpperCase().trim();
            String ten = txtTenPL.getText().toUpperCase().trim();

            if (ma.isEmpty() || ten.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không để trống dữ liệu");
                return;
            }
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn sửa ?", "Xác nhân sửa.", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                PhanLoaiHangViewModel dl = new PhanLoaiHangViewModel();
                dl.setMa(txtMaPL.getText().trim());
                dl.setTen(txtTenPL.getText().trim());
                dl.setTrangThai(this.trangThai());
                phanLoaiHangSer.update(dl);
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                loadTb();
            } else {
                return;
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtMaPL.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mời chọn mã phân loại");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa ?", "Xác nhân xóa.", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            PhanLoaiHangViewModel dl = new PhanLoaiHangViewModel();
            dl.setMa(txtMaPL.getText().trim());
            phanLoaiHangSer.updateTT(dl);
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadTb();
            loadTbXoa();
        } else {
            return;
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblPhanLoai1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhanLoai1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPhanLoai1MouseClicked

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn hoàn tác ?", "Xác nhân hoàn tác.", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            PhanLoaiHangViewModel dl = new PhanLoaiHangViewModel();
            dl.setMa(tblPhanLoai1.getValueAt(tblPhanLoai1.getSelectedRow(), 0).toString());
            phanLoaiHangSer.updateTT3(dl);
            JOptionPane.showMessageDialog(this, "Hoàn tác thành công");
            loadTb();
            loadTbXoa();
        } else {
            return;
        }

    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void rdOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdOnlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdOnlineActionPerformed

    private void rdOfflineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdOfflineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdOfflineActionPerformed

    private void rdNgungbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNgungbanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNgungbanActionPerformed

    private void rdDangchohangveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDangchohangveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdDangchohangveActionPerformed

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
            java.util.logging.Logger.getLogger(FormPhanLoaiHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPhanLoaiHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPhanLoaiHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPhanLoaiHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPhanLoaiHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdDangchohangve;
    private javax.swing.JRadioButton rdNgungban;
    private javax.swing.JRadioButton rdOffline;
    private javax.swing.JRadioButton rdOnline;
    private javax.swing.JTable tblPhanLoai;
    private javax.swing.JTable tblPhanLoai1;
    private javax.swing.JTextField txtMaDungLuong1;
    private javax.swing.JTextField txtMaPL;
    private javax.swing.JTextField txtTenPL;
    // End of variables declaration//GEN-END:variables

}
