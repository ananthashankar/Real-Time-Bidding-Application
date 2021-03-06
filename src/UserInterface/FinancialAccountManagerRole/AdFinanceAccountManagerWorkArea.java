/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FinancialAccountManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FinanceAccountManageOrganization;
import Business.Organization.Organization;
import Business.Purchase.AdvertiserPurchase;
import Business.Purchase.Purchase;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PaymentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AnanthaShankar
 */
public class AdFinanceAccountManagerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AdFinanceAccountManagerWorkArea
     */
    private JPanel upc;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount ua;
    private FinanceAccountManageOrganization organization;
    private PaymentWorkRequest request;
    private Date date;
    private String paymentResolveDate;

    public AdFinanceAccountManagerWorkArea(JPanel upc, UserAccount ua, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.upc = upc;
        this.enterprise = enterprise;
        this.system = system;
        this.ua = ua;
        this.organization = (FinanceAccountManageOrganization) organization;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        date = Calendar.getInstance().getTime();
        paymentResolveDate = sf.format(date);
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) pendingPaytJTbl.getModel();
        dtm.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getName();
            row[3] = request.getStatus();
            float amount = ((PaymentWorkRequest) request).getPaymentAmount();
            row[4] = amount;
            dtm.addRow(row);
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
        pendingPaytJTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        assgnToMeJBtn = new javax.swing.JButton();
        verifyPaytJBtn = new javax.swing.JButton();
        processPaytJBtn = new javax.swing.JButton();
        adAcctHldNmJTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adBnkNmJTxtField = new javax.swing.JTextField();
        uniqueIdJTxtField = new javax.swing.JTextField();
        adAcctTypJTxtField = new javax.swing.JTextField();
        pubBnkNmJTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pubAccountHldrNmJTxtField = new javax.swing.JTextField();
        pubAcctUniqueIdJTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pubAcctTypJTxtField = new javax.swing.JTextField();
        tranAmtJTxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        transSubmitJBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        pendingPaytJTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Payment Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pendingPaytJTbl);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Payment Dues");

        assgnToMeJBtn.setText("Assign To Me");
        assgnToMeJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assgnToMeJBtnActionPerformed(evt);
            }
        });

        verifyPaytJBtn.setText("Verify Payment Request");
        verifyPaytJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyPaytJBtnActionPerformed(evt);
            }
        });

        processPaytJBtn.setText("Process Payment");
        processPaytJBtn.setEnabled(false);
        processPaytJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processPaytJBtnActionPerformed(evt);
            }
        });

        adAcctHldNmJTxtField.setEnabled(false);
        adAcctHldNmJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adAcctHldNmJTxtFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Advertiser Bank Name");

        jLabel3.setText("Advertiser Account Holder Name");

        jLabel4.setText("Account Unique ID");

        jLabel5.setText("Advertiser Account Type");

        jLabel6.setText("Publisher Bank Name");

        adBnkNmJTxtField.setEnabled(false);
        adBnkNmJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adBnkNmJTxtFieldActionPerformed(evt);
            }
        });

        uniqueIdJTxtField.setEnabled(false);
        uniqueIdJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniqueIdJTxtFieldActionPerformed(evt);
            }
        });

        adAcctTypJTxtField.setEnabled(false);
        adAcctTypJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adAcctTypJTxtFieldActionPerformed(evt);
            }
        });

        pubBnkNmJTxtField.setEnabled(false);
        pubBnkNmJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubBnkNmJTxtFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Publisher Account Holder Name");

        pubAccountHldrNmJTxtField.setEnabled(false);
        pubAccountHldrNmJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubAccountHldrNmJTxtFieldActionPerformed(evt);
            }
        });

        pubAcctUniqueIdJTxtField.setEnabled(false);
        pubAcctUniqueIdJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubAcctUniqueIdJTxtFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Publisher Account Unique ID");

        jLabel9.setText("Publisher Account Type");

        pubAcctTypJTxtField.setEnabled(false);
        pubAcctTypJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubAcctTypJTxtFieldActionPerformed(evt);
            }
        });

        tranAmtJTxtField.setEnabled(false);
        tranAmtJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranAmtJTxtFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Transaction Amount");

        transSubmitJBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        transSubmitJBtn.setText("Submit");
        transSubmitJBtn.setEnabled(false);
        transSubmitJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transSubmitJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assgnToMeJBtn)
                                .addGap(18, 18, 18)
                                .addComponent(verifyPaytJBtn)
                                .addGap(18, 18, 18)
                                .addComponent(processPaytJBtn))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adAcctTypJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pubBnkNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uniqueIdJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adBnkNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adAcctHldNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pubAcctUniqueIdJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pubAccountHldrNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pubAcctTypJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tranAmtJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transSubmitJBtn))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assgnToMeJBtn)
                    .addComponent(verifyPaytJBtn)
                    .addComponent(processPaytJBtn))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(adBnkNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(adAcctHldNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(uniqueIdJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adAcctTypJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pubBnkNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pubAccountHldrNmJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pubAcctUniqueIdJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pubAcctTypJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tranAmtJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transSubmitJBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assgnToMeJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assgnToMeJBtnActionPerformed
        int selectedRow = pendingPaytJTbl.getSelectedRow();
        if (selectedRow >= 0) {
            PaymentWorkRequest request = (PaymentWorkRequest) pendingPaytJTbl.getValueAt(selectedRow, 0);
            request.setReceiver(ua);
            request.setStatus("Processing");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request first");

        }


    }//GEN-LAST:event_assgnToMeJBtnActionPerformed

    private void verifyPaytJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyPaytJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = pendingPaytJTbl.getSelectedRow();
        
        if (selectedRow >= 0) {
            request = (PaymentWorkRequest) pendingPaytJTbl.getValueAt(selectedRow, 0);
            
        String publisher = request.getSending_Enterprise().getName();
        
        float amount = (Float) pendingPaytJTbl.getValueAt(selectedRow, 4);
            TreeMap<String, List<AdvertiserPurchase>> tm = new TreeMap<String, List<AdvertiserPurchase>>();
            TreeMap<String, Float> tm1 = new TreeMap<String, Float>();
            for (Purchase p : enterprise.getPurchHist().getPurchaseList()) {
                if (p instanceof AdvertiserPurchase) {
                    
                    AdvertiserPurchase ap = (AdvertiserPurchase) p;
                    System.out.println(ap.getSeller_Enterprise() + ap.getStatus());
                    if (ap.getStatus().equalsIgnoreCase("Pending")
                            && ap.getSeller_Enterprise().equalsIgnoreCase(publisher)) {
                        
                       // ap.setStatus("Processing");
                        if (tm.containsKey(ap.getSeller_Enterprise())) {
                            List<AdvertiserPurchase> lst = tm.get(ap.getSeller_Enterprise());
                            lst.add(ap);
                            tm.put(ap.getSeller_Enterprise(), lst);
                        } else {
                            List<AdvertiserPurchase> lst = new ArrayList<AdvertiserPurchase>();
                            lst.add(ap);
                            tm.put(ap.getSeller_Enterprise(), lst);
                        }
                    }
                }
            }

            for (String publishr : tm.keySet()) {
                float total_amount = 0;
                for (AdvertiserPurchase ap : tm.get(publishr)) {
                    total_amount = total_amount + ap.getPurchaseAmount();
                }
                tm1.put(publishr, total_amount); 
            }
            if (tm1.get(tm1.firstKey()) == amount) {
                processPaytJBtn.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Amount requested not matching with purchase history");
                request.setStatus("Declined");
                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e.getName().equalsIgnoreCase(request.getSending_Enterprise().getName())) {
                            for (Organization organization : e.getOrganizationDirectory().getOrgList()) {
                                if (organization instanceof FinanceAccountManageOrganization) {
                                    for (UserAccount acct : organization.getUserAccountDirectory().getUserAccountList()) {
                                        if (acct.getUserName().equals(request.getSender().getUserName())) {
                                            for (WorkRequest wr : acct.getWorkQueue().getWorkRequestList()) {
                                                if (wr.getPaymentRequestDate().equals(request.getPaymentRequestDate())) {
                                                    wr.setStatus("Declined");
                                                    wr.setPaymentResolveDate(paymentResolveDate);
                                                    wr.setReceiver(ua);
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }

                for (Purchase p : enterprise.getPurchHist().getPurchaseList()) {
                    if (p instanceof AdvertiserPurchase) {
                        AdvertiserPurchase ap = (AdvertiserPurchase) p;
                        if (ap.getStatus().equalsIgnoreCase("Processing")
                                && ap.getSeller_Enterprise().equalsIgnoreCase((String) pendingPaytJTbl.getValueAt(selectedRow, 1))) {
                            ap.setStatus("Pending");
                        }
                    }
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request first");

        }

    }//GEN-LAST:event_verifyPaytJBtnActionPerformed

    private void processPaytJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processPaytJBtnActionPerformed
        // TODO add your handling code here:
        processPaytJBtn.setEnabled(false);
        adAcctHldNmJTxtField.setText(enterprise.getFa().getAccountHolderName());
        adBnkNmJTxtField.setText(enterprise.getFa().getBankName());
        adAcctTypJTxtField.setText(enterprise.getFa().getAccountType());
        uniqueIdJTxtField.setText(enterprise.getFa().getUniqueId());
        pubAccountHldrNmJTxtField.setText(request.getSending_Enterprise().getFa().getAccountHolderName());
        pubAcctTypJTxtField.setText(request.getSending_Enterprise().getFa().getAccountType());
        pubAcctUniqueIdJTxtField.setText(request.getSending_Enterprise().getFa().getUniqueId());
        pubBnkNmJTxtField.setText(request.getSending_Enterprise().getFa().getBankName());
        tranAmtJTxtField.setEnabled(true);
        transSubmitJBtn.setEnabled(true);

    }//GEN-LAST:event_processPaytJBtnActionPerformed

    private void adAcctHldNmJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adAcctHldNmJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adAcctHldNmJTxtFieldActionPerformed

    private void adBnkNmJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adBnkNmJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adBnkNmJTxtFieldActionPerformed

    private void uniqueIdJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniqueIdJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uniqueIdJTxtFieldActionPerformed

    private void adAcctTypJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adAcctTypJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adAcctTypJTxtFieldActionPerformed

    private void pubBnkNmJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubBnkNmJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pubBnkNmJTxtFieldActionPerformed

    private void pubAccountHldrNmJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubAccountHldrNmJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pubAccountHldrNmJTxtFieldActionPerformed

    private void pubAcctUniqueIdJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubAcctUniqueIdJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pubAcctUniqueIdJTxtFieldActionPerformed

    private void pubAcctTypJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubAcctTypJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pubAcctTypJTxtFieldActionPerformed

    private void tranAmtJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranAmtJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tranAmtJTxtFieldActionPerformed

    private void transSubmitJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transSubmitJBtnActionPerformed
        // TODO add your handling code here:
        try{
        if (adAcctHldNmJTxtField.getText().trim().length() > 0
                && adBnkNmJTxtField.getText().trim().length() > 0
                && adAcctTypJTxtField.getText().trim().length() > 0
                && uniqueIdJTxtField.getText().trim().length() > 0
                && pubAccountHldrNmJTxtField.getText().trim().length() > 0
                && pubAcctTypJTxtField.getText().trim().length() > 0
                && pubAcctUniqueIdJTxtField.getText().trim().length() > 0
                && pubBnkNmJTxtField.getText().trim().length() > 0
                && transSubmitJBtn.getText().trim().length() > 0) {

            String result = system.getBankDirectory().retailerTransactionProcess(adBnkNmJTxtField.getText().trim(),
                    adAcctHldNmJTxtField.getText().trim(), uniqueIdJTxtField.getText().trim(), adAcctTypJTxtField.getText().trim(),
                    Float.parseFloat(transSubmitJBtn.getText().trim()), pubBnkNmJTxtField.getText().trim(),
                    pubAccountHldrNmJTxtField.getText().trim(), pubAcctUniqueIdJTxtField.getText().trim(),
                    pubAcctTypJTxtField.getText().trim());
            if (result.equals("Transaction Successful")) {
                processPaytJBtn.setEnabled(true);
                adAcctHldNmJTxtField.setText("");
                adBnkNmJTxtField.setText("");
                adAcctTypJTxtField.setText("");
                uniqueIdJTxtField.setText("");
                pubAccountHldrNmJTxtField.setText("");
                pubAcctTypJTxtField.setText("");
                pubAcctUniqueIdJTxtField.setText("");
                pubBnkNmJTxtField.setText("");
                request.setStatus("Processed");

                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e.getName().equalsIgnoreCase(request.getSending_Enterprise().getName())) {
                            for (Organization organization : e.getOrganizationDirectory().getOrgList()) {
                                if (organization instanceof FinanceAccountManageOrganization) {
                                    for (UserAccount acct : organization.getUserAccountDirectory().getUserAccountList()) {
                                        if (acct.getUserName().equals(request.getSender().getUserName())) {
                                            for (WorkRequest wr : acct.getWorkQueue().getWorkRequestList()) {
                                                if (wr.getPaymentRequestDate().equals(request.getPaymentRequestDate())) {
                                                    wr.setStatus("Processed");
                                                    wr.setPaymentResolveDate(paymentResolveDate);
                                                    wr.setReceiver(ua);
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
                for (Purchase p : enterprise.getPurchHist().getPurchaseList()) {
                    if (p instanceof AdvertiserPurchase) {
                        AdvertiserPurchase ap = (AdvertiserPurchase) p;
                        if (ap.getStatus().equalsIgnoreCase("Pending")
                                && ap.getSeller_Enterprise().equalsIgnoreCase(request.getSending_Enterprise().getName())) {
                            ap.setStatus("Processed");
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, result);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Inputs");
        }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Number Input Value");
        }
    }//GEN-LAST:event_transSubmitJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adAcctHldNmJTxtField;
    private javax.swing.JTextField adAcctTypJTxtField;
    private javax.swing.JTextField adBnkNmJTxtField;
    private javax.swing.JButton assgnToMeJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pendingPaytJTbl;
    private javax.swing.JButton processPaytJBtn;
    private javax.swing.JTextField pubAccountHldrNmJTxtField;
    private javax.swing.JTextField pubAcctTypJTxtField;
    private javax.swing.JTextField pubAcctUniqueIdJTxtField;
    private javax.swing.JTextField pubBnkNmJTxtField;
    private javax.swing.JTextField tranAmtJTxtField;
    private javax.swing.JButton transSubmitJBtn;
    private javax.swing.JTextField uniqueIdJTxtField;
    private javax.swing.JButton verifyPaytJBtn;
    // End of variables declaration//GEN-END:variables
}
