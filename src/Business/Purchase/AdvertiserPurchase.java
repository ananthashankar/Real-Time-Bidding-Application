/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Purchase;

import Business.Enterprise.Enterprise;
import Business.Person.Customer;

/**
 *
 * @author AnanthaShankar
 */
public class AdvertiserPurchase extends Purchase{
    
    private String buyer_Enterprise; // ad buyer - advertiser
    private String seller_Enterprise;  // ad seller - publisher

    public String getBuyer_Enterprise() {
        return buyer_Enterprise;
    }

    public void setBuyer_Enterprise(String buyer_Enterprise) {
        this.buyer_Enterprise = buyer_Enterprise;
    }

    public String getSeller_Enterprise() {
        return seller_Enterprise;
    }

    public void setSeller_Enterprise(String seller_Enterprise) {
        this.seller_Enterprise = seller_Enterprise;
    }

    
    
    
}
