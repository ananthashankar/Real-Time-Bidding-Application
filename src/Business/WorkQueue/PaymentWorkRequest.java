/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;

/**
 *
 * @author AnanthaShankar
 */
public class PaymentWorkRequest extends WorkRequest{
    private float paymentAmount;
    private Enterprise sending_Enterprise;
    private String receiving_Enterprise;

    public String getReceiving_Enterprise() {
        return receiving_Enterprise;
    }

    public void setReceiving_Enterprise(String receiving_Enterprise) {
        this.receiving_Enterprise = receiving_Enterprise;
    }

    public float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    

    

    public Enterprise getSending_Enterprise() {
        return sending_Enterprise;
    }

    public void setSending_Enterprise(Enterprise sending_Enterprise) {
        this.sending_Enterprise = sending_Enterprise;
    }
    
}
