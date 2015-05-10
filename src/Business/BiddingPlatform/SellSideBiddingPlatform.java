/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BiddingPlatform;

import Business.Product.Product;
import Business.UserAccount.UserAccount;

/**
 *
 * @author AnanthaShankar
 */
public class SellSideBiddingPlatform {
    private int productBrowseCount; // total view count of publisher product
    private String userAge;  // value dependent on age range set adoloscent, adult, middle aged, old set in UI
    private float minBidValue; 
    private int userClickCount; // customer class count of ad clicks
    private int noOfPurchaseAdProductCount; // customer clas
    private int noOfClicksCount; // customer class count publisherBrowseCount
  //  private String adType; // category use this later to set if adtype is video 
                            //then one price or if adtype is image then one price

    public int getProductBrowseCount() {
        return productBrowseCount;
    }

    public void setProductBrowseCount(int productBrowseCount) {
        this.productBrowseCount = productBrowseCount;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public float getMinBidValue() {
        return minBidValue;
    }

    public void setMinBidValue(float minBidValue) {
        this.minBidValue = minBidValue;
    }

    public int getUserClickCount() {
        return userClickCount;
    }

    public void setUserClickCount(int userClickCount) {
        this.userClickCount = userClickCount;
    }
    
    public int getNoOfPurchaseAdProductCount() {
        return noOfPurchaseAdProductCount;
    }

    public void setNoOfPurchaseAdProductCount(int noOfPurchaseAdProductCount) {
        this.noOfPurchaseAdProductCount = noOfPurchaseAdProductCount;
    }

    public int getNoOfClicksCount() {
        return noOfClicksCount;
    }

    public void setNoOfClicksCount(int noOfClicksCount) {
        this.noOfClicksCount = noOfClicksCount;
    }


}
