/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BiddingPlatform;

import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class DemandSideBiddingPlatform {
    private int productBrowseCount; // publisher productBrowseCount
    private String userAge;  // value dependent on age range
    private float minBidValue;
    private float maxBidRaise;
    private int noOfPurchaseAdProductCount; // count of all product purchase
    private int noOfClicksCount;
    private String adType;  // advertiser ad type for each category there will multiple dsps.
    private String userUniqueId;  // for account validation , set needed or not needed
    private String location; // location based bid setting, network location
    private ArrayList<String> userInterest; // set for what userInterest the bid is set, like if user interest matches ,
                                   // and when not matches what else the interest on which the ad should be displayed.

    public void DemandSideBiddingPlatform(){
        userInterest = new ArrayList<String>();
    }
    
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

    public ArrayList<String> getUserInterest() {
        return userInterest;
    }

    public void setUserInterest(ArrayList<String> userInterest) {
        this.userInterest = userInterest;
    }

    
    public float getMinBidValue() {
        return minBidValue;
    }

    public void setMinBidValue(float minBidValue) {
        this.minBidValue = minBidValue;
    }

    public float getMaxBidRaise() {
        return maxBidRaise;
    }

    public void setMaxBidRaise(float maxBidRaise) {
        this.maxBidRaise = maxBidRaise;
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

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public String getUserUniqueId() {
        return userUniqueId;
    }

    public void setUserUniqueId(String userUniqueId) {
        this.userUniqueId = userUniqueId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    
    
    
}
