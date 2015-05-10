/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.BiddingPlatform.DemandSideBiddingPlatform;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.PublisherEnterprise;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author AnanthaShankar
 */
public class AdExchangeDirectory {
 
    private ArrayList<AdExchange> adExchangeList;
    
    public AdExchangeDirectory(){
        adExchangeList = new ArrayList<AdExchange>();
    }

    public ArrayList<AdExchange> getAdExchangeList() {
        return adExchangeList;
    }
    
    public AdExchange addAdExchange(String name){
        AdExchange adEx = new AdExchange(name);
        adExchangeList.add(adEx);
        return adEx;
    }
    
    public TreeMap<String, DemandSideBiddingPlatform> bidRequest(String publisherName, int productBrowseCount, String userAge, int userClickCount, int noOfPurchaseAdProductCount,
            int noOfClicksCount, String location, String accountVerification, ArrayList<String> interests){
        TreeMap<String, DemandSideBiddingPlatform> bid_Winner= new TreeMap<String, DemandSideBiddingPlatform>();
        // while giving dsp a in put to this method give the values required for dsp analysis only set rest to 0 or null
        for(AdExchange ae : adExchangeList){
            for(PublisherEnterprise pubEnt : ae.getPublisherList()){
                if(pubEnt.getName().equalsIgnoreCase(publisherName)){ 
                   // Enterprise name has to be unique across network
                    System.out.println("AdEx Dir");
                   bid_Winner = ae.setSsp(publisherName, productBrowseCount,  userAge, userClickCount, noOfPurchaseAdProductCount, 
                                            noOfClicksCount, location, accountVerification, interests);
                   return bid_Winner;
                }
            }
        }
        return bid_Winner; // write strategy to check no winner in ui
    }
}
