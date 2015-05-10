/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author AnanthaShankar
 */
public abstract class WorkRequest {
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String paymentRequestDate;
    private Date date;
    private String paymentResolveDate;
    
    SimpleDateFormat sf =  new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
    public WorkRequest(){
        date = Calendar.getInstance().getTime();
        paymentRequestDate = sf.format(date);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentRequestDate() {
        return paymentRequestDate;
    }

    
    public String getPaymentResolveDate() {
        return paymentResolveDate;
    }

    public void setPaymentResolveDate(String paymentResolveDate) {
        this.paymentResolveDate = paymentResolveDate;
    }

    @Override
    public String toString() {
        return message;
    }

    
}
