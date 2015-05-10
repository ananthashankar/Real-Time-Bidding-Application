/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Purchase;

import Business.Enterprise.Enterprise;
import Business.Person.Customer;
import Business.Product.AdvertiserProduct;
import Business.Product.Product;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class CustomerPurchase extends Purchase{
    private String buyer_Customer;
    private String publisher_enterprise; //  publisher customer belong to
    private String seller_enterprise; // advertiser
    private AdvertiserProduct productPurchased;

    

    public String getBuyer_Customer() {
        return buyer_Customer;
    }

    public void setBuyer_Customer(String buyer_Customer) {
        this.buyer_Customer = buyer_Customer;
    }

    public String getPublisher_enterprise() {
        return publisher_enterprise;
    }

    public AdvertiserProduct getProductPurchased() {
        return productPurchased;
    }

    public void setProductPurchased(AdvertiserProduct productPurchased) {
        this.productPurchased = productPurchased;
    }

    
    public void setPublisher_enterprise(String publisher_enterprise) {
        this.publisher_enterprise = publisher_enterprise;
    }

    public String getSeller_enterprise() {
        return seller_enterprise;
    }

    public void setSeller_enterprise(String seller_enterprise) {
        this.seller_enterprise = seller_enterprise;
    }

    
    
    
}
