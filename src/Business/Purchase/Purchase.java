/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Purchase;

import Business.Product.Product;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author AnanthaShankar
 */
public class Purchase {
    private static int count = 0;
    private int purchaseId;
       // publisher product for customer , advertiser content or product for publisher
    private int quantity;  // customer purchase quantity >= 1 , publisher bid purchase quantity = 1
    private String purchaseDate;
    private float purchaseAmount;  // quantity * productPurchased.getPrice() , bidAmount for publisher 
    private Date date;
    private String status;  // completed for customer , "Payment Pending" "Payment Paid"
    
    
    SimpleDateFormat sf =  new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
    
    public Purchase(){
        count++;
        purchaseId = count;
        date = Calendar.getInstance().getTime();
        purchaseDate = sf.format(date);
    }

    public float getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(float purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    

    public int getPurchaseId() {
        return purchaseId;
    }

    

    @Override
    public String toString() {
        return status; //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
