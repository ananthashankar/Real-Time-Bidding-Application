/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.UserRole;

import Business.CustomerHistory.CustomerBrowsing;
import Business.EcoSystem;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Person.Customer;
import Business.Purchase.CustomerPurchase;
import Business.Purchase.Purchase;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AnanthaShankar
 */
public class UserTransactionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserTransactionJPanel
     */
    private JPanel upc;
    private ArrayList<CustomerPurchase> trans;
    private UserAccount ua;
    private AdvertiserEnterprise ae;
    private PublisherEnterprise pe;
    private EcoSystem system;

    public UserTransactionJPanel(JPanel upc, ArrayList<CustomerPurchase> trans, UserAccount ua,
            AdvertiserEnterprise ae, PublisherEnterprise pe, EcoSystem system) {
        initComponents();
        this.upc = upc;
        this.trans = trans;
        this.ua = ua;
        this.ae = ae;
        this.pe = pe;
        this.system = system;

        acctTypJCmbBx.removeAllItems();
        acctTypJCmbBx.addItem("Consumer");
        acctTypJCmbBx.addItem("Retail");

        cardTypJCmbBx.removeAllItems();
        cardTypJCmbBx.addItem("Mastercard");
        cardTypJCmbBx.addItem("Visa");

        monthJCmbBx.removeAllItems();
        for (int i = 0; i <= 11; i++) {
            monthJCmbBx.addItem(i + 1);
        }

        yearJCmbBx.removeAllItems();
        for (int i = 2014; i < 2030; i++) {
            yearJCmbBx.addItem(i + 1);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cardTypJCmbBx = new javax.swing.JComboBox();
        monthJCmbBx = new javax.swing.JComboBox();
        yearJCmbBx = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        acctTypJCmbBx = new javax.swing.JComboBox();
        bankNmJTxtField = new javax.swing.JTextField();
        acctHldrJTxtField = new javax.swing.JTextField();
        uniqIdJTxtField = new javax.swing.JTextField();
        cardNumJTxtField = new javax.swing.JTextField();
        cardPinJTxtField = new javax.swing.JTextField();
        addrJTxtField = new javax.swing.JTextField();
        transAmtJTxtField = new javax.swing.JTextField();
        paymtJBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        backJBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Bank Name");

        jLabel2.setText("Account Holder Name");

        jLabel3.setText("Account Type");

        jLabel4.setText("Card Number");

        jLabel5.setText("Unique Id");

        jLabel6.setText("Card Pin");

        jLabel7.setText("Billing Address");

        jLabel8.setText("Transaction Amount");

        jLabel9.setText("Card Type");

        jLabel10.setText("Card Expiry Date");

        cardTypJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        monthJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        yearJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("/");

        acctTypJCmbBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bankNmJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankNmJTxtFieldActionPerformed(evt);
            }
        });

        acctHldrJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctHldrJTxtFieldActionPerformed(evt);
            }
        });

        uniqIdJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniqIdJTxtFieldActionPerformed(evt);
            }
        });

        cardNumJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumJTxtFieldActionPerformed(evt);
            }
        });

        cardPinJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardPinJTxtFieldActionPerformed(evt);
            }
        });

        addrJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrJTxtFieldActionPerformed(evt);
            }
        });

        transAmtJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transAmtJTxtFieldActionPerformed(evt);
            }
        });

        paymtJBtn.setText("Proceed To Payment");
        paymtJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymtJBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Account Details");

        backJBtn.setText("<<  Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(backJBtn))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paymtJBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cardTypJCmbBx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acctTypJCmbBx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(monthJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(yearJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bankNmJTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cardNumJTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cardPinJTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addrJTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transAmtJTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(uniqIdJTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(acctHldrJTxtField, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(171, 171, 171))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(bankNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(acctHldrJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(uniqIdJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(acctTypJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cardNumJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cardPinJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cardTypJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(monthJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearJCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addrJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(transAmtJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymtJBtn)
                    .addComponent(backJBtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bankNmJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankNmJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankNmJTxtFieldActionPerformed

    private void acctHldrJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctHldrJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acctHldrJTxtFieldActionPerformed

    private void uniqIdJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniqIdJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uniqIdJTxtFieldActionPerformed

    private void cardNumJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumJTxtFieldActionPerformed

    private void cardPinJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardPinJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardPinJTxtFieldActionPerformed

    private void addrJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addrJTxtFieldActionPerformed

    private void transAmtJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transAmtJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transAmtJTxtFieldActionPerformed

    private void paymtJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymtJBtnActionPerformed
        // TODO add your handling code here:
        try {
            if (bankNmJTxtField.getText().trim().length() > 0
                    && acctHldrJTxtField.getText().trim().length() > 0
                    && uniqIdJTxtField.getText().trim().length() > 0
                    && cardNumJTxtField.getText().trim().length() > 0
                    && cardPinJTxtField.getText().trim().length() > 0
                    && addrJTxtField.getText().trim().length() > 0
                    && transAmtJTxtField.getText().trim().length() > 0) {
                String transaction_result = system.getBankDirectory().purchaseTransactionProcess(bankNmJTxtField.getText().trim(),
                        acctHldrJTxtField.getText(), uniqIdJTxtField.getText(),
                        Long.parseLong(cardNumJTxtField.getText()), Integer.parseInt(cardPinJTxtField.getText()),
                        addrJTxtField.getText().trim(), (String) acctTypJCmbBx.getSelectedItem(),
                        Float.parseFloat(transAmtJTxtField.getText()), (String) cardTypJCmbBx.getSelectedItem(),
                        (String.valueOf(monthJCmbBx.getSelectedItem()) + "/" + (String.valueOf(yearJCmbBx.getSelectedItem()))),
                        ae.getFa().getBankName(), ae.getFa().getAccountHolderName(), ae.getFa().getUniqueId(),
                        ae.getFa().getAccountType());

                if (transaction_result.equals("Transaction Successful")) {
                    for (Purchase p : ae.getPurchHist().getPurchaseList()) {
                        if (p instanceof CustomerPurchase && p.getStatus().equals("Pending")) {
                            CustomerPurchase cp = (CustomerPurchase) p;
                            for (CustomerPurchase custpur : trans) {
                                if(cp.getPurchaseId() == custpur.getPurchaseId() && 
                                        cp.getPurchaseDate().equals(custpur.getPurchaseDate()) && 
                                        cp.getProductPurchased().getProductId() == custpur.getProductPurchased().getProductId() && 
                                        cp.getBuyer_Customer().equals(custpur.getBuyer_Customer()) && 
                                        cp.getPurchaseAmount() == custpur.getPurchaseAmount() && 
                                        cp.getQuantity() == custpur.getQuantity()){
                                    cp.setStatus("Processed");
                                }
                            }
                        }
                    }
                    for (Purchase p : pe.getPurchHist().getPurchaseList()) {
                        if (p instanceof CustomerPurchase && p.getStatus().equals("Pending")) {
                            CustomerPurchase cp = (CustomerPurchase) p;
                            for (CustomerPurchase custpur : trans) {
                                if(cp.getPurchaseId() == custpur.getPurchaseId() && 
                                        cp.getPurchaseDate().equals(custpur.getPurchaseDate()) && 
                                        cp.getProductPurchased().getProductId() == custpur.getProductPurchased().getProductId() && 
                                        cp.getBuyer_Customer().equals(custpur.getBuyer_Customer()) && 
                                        cp.getPurchaseAmount() == custpur.getPurchaseAmount() && 
                                        cp.getQuantity() == custpur.getQuantity()){
                                    cp.setStatus("Processed");
                                }
                            }
                        }
                    }
                    Customer cust = (Customer) ua.getPerson();
                    for (Purchase p : cust.getPurchaseHistory().getPurchaseList()) {
                        if (p instanceof CustomerPurchase && p.getStatus().equals("Pending")) {
                            CustomerPurchase cp = (CustomerPurchase) p;
                            for (CustomerPurchase custpur : trans) {
                                if(cp.getPurchaseId() == custpur.getPurchaseId() && 
                                        cp.getPurchaseDate().equals(custpur.getPurchaseDate()) && 
                                        cp.getProductPurchased().getProductId() == custpur.getProductPurchased().getProductId() && 
                                        cp.getBuyer_Customer().equals(custpur.getBuyer_Customer()) && 
                                        cp.getPurchaseAmount() == custpur.getPurchaseAmount() && 
                                        cp.getQuantity() == custpur.getQuantity()){
                                    cp.setStatus("Processed");
                                }
                            }
                        }
                    }
                    int i = cust.getNoOfPurchaseAdProductCount();
                    cust.setNoOfPurchaseAdProductCount(i + 1);
                    for(CustomerPurchase cp : trans){
                        CustomerBrowsing cb = cust.getCustomerBrowsingHistory().addAdvertiserBrowsingHistory();
                        cb.setInterest(cp.getProductPurchased().getProductType());
                        cb.setPublisher(ae.getName());
                        cb.setProduct(cp.getProductPurchased().getProdName());
                    }
                    JOptionPane.showMessageDialog(null, "Payment Successful. Thanks for Shopping");
                    TransactionSummaryJPanel tsp = new TransactionSummaryJPanel(upc, trans);
                    upc.add("Transaction Summary", tsp);
                    CardLayout layout = (CardLayout) upc.getLayout();
                    layout.next(upc);
                } else {
                    JOptionPane.showMessageDialog(null, transaction_result);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input Values");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input Values");
        }
    }//GEN-LAST:event_paymtJBtnActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acctHldrJTxtField;
    private javax.swing.JComboBox acctTypJCmbBx;
    private javax.swing.JTextField addrJTxtField;
    private javax.swing.JButton backJBtn;
    private javax.swing.JTextField bankNmJTxtField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField cardNumJTxtField;
    private javax.swing.JTextField cardPinJTxtField;
    private javax.swing.JComboBox cardTypJCmbBx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox monthJCmbBx;
    private javax.swing.JButton paymtJBtn;
    private javax.swing.JTextField transAmtJTxtField;
    private javax.swing.JTextField uniqIdJTxtField;
    private javax.swing.JComboBox yearJCmbBx;
    // End of variables declaration//GEN-END:variables
}