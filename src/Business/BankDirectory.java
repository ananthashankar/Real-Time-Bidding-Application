/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AnanthaShankar
 */
public class BankDirectory {

    private ArrayList<Bank> bankList;

    public BankDirectory() {
        bankList = new ArrayList<Bank>();
    }

    public ArrayList<Bank> getBankList() {
        return bankList;
    }

    public Bank addBank(String name) {
        Bank b = new Bank(name);
        bankList.add(b);
        return b;
    }

    public String userAccountAuthentication(String bankName, String uniqueId) {
        // Fake traffic control resolution method
        for (Bank b : bankList) {
            if (b.getName().trim().toUpperCase().equals(bankName.trim().toUpperCase())) {
                for (BankAccount ba : b.getBankAccountList()) {
                    if (ba.getUniqueId().equals(uniqueId)) {
                        return "Verified";
                    }
                }
            }
        }
        return "Invalid User Account";
    }

    public String retailerTransactionProcess(String bankName, String acctHldrNm, String uniqueId,
            String acctTyp, float transactionAmount, String recBankName, String recAcctHldrNm, String recUniqueId,
            String recAcctTyp) {

        for (Bank b : bankList) {
            if (b.getName().trim().toUpperCase().equals(bankName.trim().toUpperCase())) {
                for (BankAccount ba : b.getBankAccountList()) {
                    if (ba.getAccountType().trim().toUpperCase().equals(acctTyp)
                            && ba.getUniqueId().equals(uniqueId)
                            && ba.getAccountHolderName().trim().toUpperCase().equals(acctHldrNm.trim().toUpperCase())) {
                         float currentBalanceAmount = ba.getBalanceAmount();
                        float newBalanceAmount = currentBalanceAmount - transactionAmount;
                        ba.setBalanceAmount(newBalanceAmount);
                        for (Bank bnk : bankList) {
                            if (b.getName().trim().toUpperCase().equals(recBankName.trim().toUpperCase())) {
                                for (BankAccount bnkAcc : b.getBankAccountList()) {
                                    if (bnkAcc.getAccountHolderName().trim().toUpperCase().equals(recAcctHldrNm.trim().toUpperCase())
                                            && bnkAcc.getUniqueId().equals(recUniqueId)
                                            && bnkAcc.getAccountType().trim().toUpperCase().equals(recAcctTyp.trim().toUpperCase())) {
                                        float currBal = bnkAcc.getBalanceAmount();
                                        float newBal = transactionAmount + currBal;
                                        bnkAcc.setBalanceAmount(newBal);
                                        return "Transaction Successful";
                                    }
                                }
                            }
                        }
                        
                    }
                }
            }
        } return "Transaction Failed Due to Invalid Inputs. Please Check and Try Again.";
    }

    public String purchaseTransactionProcess(String bankName, String acctHldrNm, String uniqueId,
            long cardNo, int cardPin, String address, String acctTyp, float transactionAmount,
            String cardType, String cardExpDate, String recBankName, String recAcctHldrNm, String recUniqueId,
            String recAcctTyp) {

        for (Bank b : bankList) {
            if (b.getName().trim().toUpperCase().equals(bankName.trim().toUpperCase())) {
                for (BankAccount ba : b.getBankAccountList()) {
                    if (ba.getUniqueId().equals(uniqueId)
                            && ba.getAccountHolderName().trim().toUpperCase().equals(acctHldrNm.trim().toUpperCase())
                            && ba.getCardNumber() == cardNo && ba.getCardPin().equals(cardPin)
                            && ba.getAddress().trim().toUpperCase().equals(address.trim().toUpperCase())
                            && ba.getAccountType().trim().toUpperCase().equals(acctTyp.trim().toUpperCase())
                            && ba.getCardType().trim().toUpperCase().equals(cardType.trim().toUpperCase())
                            && ba.getCardExpireDate().trim().equals(cardExpDate.trim())
                            && ba.getBalanceAmount() >= transactionAmount) {
                        float currentBalanceAmount = ba.getBalanceAmount();
                        float newBalanceAmount = currentBalanceAmount - transactionAmount;
                        ba.setBalanceAmount(newBalanceAmount);
                        for (Bank bnk : bankList) {
                            if (b.getName().trim().toUpperCase().equals(recBankName.trim().toUpperCase())) {
                                for (BankAccount bnkAcc : b.getBankAccountList()) {
                                    if (bnkAcc.getAccountHolderName().trim().toUpperCase().equals(recAcctHldrNm.trim().toUpperCase())
                                            && bnkAcc.getUniqueId().equals(recUniqueId)
                                            && bnkAcc.getAccountType().trim().toUpperCase().equals(recAcctTyp.trim().toUpperCase())) {
                                        float currBal = bnkAcc.getBalanceAmount();
                                        float newBal = transactionAmount + currBal;
                                        bnkAcc.setBalanceAmount(newBal);
                                        return "Transaction Successful";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return "Transaction Failed Due to Invalid Inputs. Please Check and Try Again.";

    }

}
