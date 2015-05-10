/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Purchase;

import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class PurchaseHistory {
    
    private ArrayList<Purchase> purchaseList; // both advertiser and cu
    
    public PurchaseHistory(){
        purchaseList = new ArrayList<Purchase>();
    }

    public ArrayList<Purchase> getPurchaseList() {
        return purchaseList;
    }
    
    public Purchase addPurchase(Purchase p){
       purchaseList.add(p);
        return p;
    }
    
     // create a method to provide invoice and bills to advertisers and publishers
}
