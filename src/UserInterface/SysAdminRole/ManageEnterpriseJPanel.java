/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SysAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AnanthaShankar
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel upc;
    private EcoSystem system;
    private SysAdminWorkAreaJPanel sa;

    public ManageEnterpriseJPanel(JPanel upc, EcoSystem system, SysAdminWorkAreaJPanel sa) {
        initComponents();
        this.upc = upc;
        this.system = system;
        this.sa = sa;
        topNetworkCombo();
        networkCombo();
        enterpriseCombo();
    }

    public void populateTable(Network n) {
        DefaultTableModel dtm = (DefaultTableModel) enterpriseJTbl.getModel();
        dtm.setRowCount(0);
        for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
            Object row[] = new Object[3];
            row[0] = e;
            row[1] = e.getType();
            row[2] = n;
            dtm.addRow(row);
        }
    }

    protected void topNetworkCombo() {
        netwTypSelJCmbBx.removeAllItems();
        for (Network n : system.getNetworkList()) {
            netwTypSelJCmbBx.addItem(n);
        }
    }

    protected void networkCombo() {
        netwTypJCmbBx.removeAllItems();
        for (Network n : system.getNetworkList()) {
            netwTypJCmbBx.addItem(n);
        }
    }

    protected void enterpriseCombo() {
        enterpriseJCmbBx.removeAllItems();
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseJCmbBx.addItem(type);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTbl = new javax.swing.JTable();
        netwTypJCmbBx = new javax.swing.JComboBox();
        enterpriseJCmbBx = new javax.swing.JComboBox();
        nmJTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        createJBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        netwTypSelJCmbBx = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseJTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Network"
            }
        ));
        jScrollPane1.setViewportView(enterpriseJTbl);

        netwTypJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        netwTypJCmbBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netwTypJCmbBxActionPerformed(evt);
            }
        });

        enterpriseJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJCmbBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJCmbBxActionPerformed(evt);
            }
        });

        jLabel1.setText("Network");

        jLabel2.setText("Enterprise Type");

        jLabel3.setText("Name");

        createJBtn.setText("Create");
        createJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Network");

        netwTypSelJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        netwTypSelJCmbBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netwTypSelJCmbBxActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(netwTypSelJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(netwTypJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createJBtn))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netwTypSelJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netwTypJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createJBtn)
                    .addComponent(backJButton))
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJBtnActionPerformed
        // TODO add your handling code here:
        int i = 0;
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseJCmbBx.getSelectedItem();
        if (nmJTxtField.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Name");
        } else {
            String name = nmJTxtField.getText().trim();
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getName().equalsIgnoreCase(name)) {
                        i = 1;
                        JOptionPane.showMessageDialog(null, "Enterprise Name Already Exists. Please Use Different Name");
                    }
                }
            }
            if (i == 0) {
                Network n = (Network) netwTypJCmbBx.getSelectedItem();
                n.getEnterpriseDirectory().createAndAddEnterprise(name, type);
                populateTable(n);
            }
        }

    }//GEN-LAST:event_createJBtnActionPerformed

    private void netwTypSelJCmbBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netwTypSelJCmbBxActionPerformed
        // TODO add your handling code here:
        Network n = (Network) netwTypSelJCmbBx.getSelectedItem();
        if (n != null) {
            populateTable(n);
        }

    }//GEN-LAST:event_netwTypSelJCmbBxActionPerformed

    private void netwTypJCmbBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netwTypJCmbBxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_netwTypJCmbBxActionPerformed

    private void enterpriseJCmbBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJCmbBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJCmbBxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        sa.populateNetworkTree();
        layout.previous(upc);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createJBtn;
    private javax.swing.JComboBox enterpriseJCmbBx;
    private javax.swing.JTable enterpriseJTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox netwTypJCmbBx;
    private javax.swing.JComboBox netwTypSelJCmbBx;
    private javax.swing.JTextField nmJTxtField;
    // End of variables declaration//GEN-END:variables
}
