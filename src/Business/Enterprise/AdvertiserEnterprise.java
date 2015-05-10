/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Advertisement;
import Business.BiddingPlatform.DemandSideBiddingPlatform;
import Business.Product.ProductDirectory;
import Business.Purchase.PurchaseHistory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class AdvertiserEnterprise extends Enterprise{
    
    private ArrayList<DemandSideBiddingPlatform> dsp = new ArrayList<DemandSideBiddingPlatform>();
    private ArrayList<Advertisement> ads = new ArrayList<Advertisement>();
    private ProductDirectory prodDir = new ProductDirectory();
    
    
    public AdvertiserEnterprise(String name, Enterprise.EnterpriseType type) {
        super(name, Enterprise.EnterpriseType.Advertiser);
    }

    public ArrayList<DemandSideBiddingPlatform> getDsp() {
        return dsp;
    }

    public ProductDirectory getProdDir() {
        return prodDir;
    }

    public ArrayList<Advertisement> getAds() {
        return ads;
    }
    
    public Advertisement addAdverstisement(){
        Advertisement av = new Advertisement();
        ads.add(av);
        return av;
    }
    
    public DemandSideBiddingPlatform addDsp(){
        DemandSideBiddingPlatform d = new DemandSideBiddingPlatform();
        dsp.add(d);
        return d;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
