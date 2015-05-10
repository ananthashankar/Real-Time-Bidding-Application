/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.BiddingPlatform.SellSideBiddingPlatform;
import Business.Product.ProductDirectory;
import Business.Purchase.PurchaseHistory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class PublisherEnterprise extends Enterprise{
    // make few methods protected and private at end depending on access to the classes that are using it
    private ArrayList<SellSideBiddingPlatform> ssp = new ArrayList<SellSideBiddingPlatform>();
    private ProductDirectory prodDir = new ProductDirectory();
    
    public PublisherEnterprise(String name, Enterprise.EnterpriseType type) {
        super(name, Enterprise.EnterpriseType.Publisher);
    }

    public ArrayList<SellSideBiddingPlatform> getSsp() {
        return ssp;
    }

    public ProductDirectory getProdDir() {
        return prodDir;
    }
    
    public SellSideBiddingPlatform addSsp(){
        SellSideBiddingPlatform s = new SellSideBiddingPlatform();
        return s;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
