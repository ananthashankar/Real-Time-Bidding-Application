/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;


import Business.CustomerHistory.CustomerBrowsingHistory;
import Business.FinancialAccount.FinancialAccount;
import Business.Organization.FinanceAccountManageOrganization;
import Business.Purchase.PurchaseHistory;
import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class Customer extends Person{
    private FinancialAccount account;
    private ArrayList<String> interests; // interests will be loaded in combo box
    private PurchaseHistory purchaseHistory;
    private CustomerBrowsingHistory customerBrowsingHistory;
    private int noOfPublisherBrowseCount;
    private int noOfPurchaseAdProductCount;
    private int noOfClicksCount;
    private int age;
    private String location;
    
    public Customer(){
        account = new FinancialAccount();
        interests = new ArrayList<String>();
        purchaseHistory = new PurchaseHistory();
        customerBrowsingHistory = new CustomerBrowsingHistory();
        noOfPublisherBrowseCount = 0;
        noOfPurchaseAdProductCount = 0;
        noOfClicksCount = 0;
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public CustomerBrowsingHistory getCustomerBrowsingHistory() {
        return customerBrowsingHistory;
    }
    
    public FinancialAccount getAccount() {
        return account;
    }

    public void setAccount(FinancialAccount account) {
        this.account = account;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public PurchaseHistory getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(PurchaseHistory purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public int getNoOfPublisherBrowseCount() {
        return noOfPublisherBrowseCount;
    }

    public void setNoOfPublisherBrowseCount(int noOfPublisherBrowseCount) {
        this.noOfPublisherBrowseCount = noOfPublisherBrowseCount;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void incrementPublisherBrowseCount(){
        noOfPublisherBrowseCount++;
    }

    public void incrementPurchaseAdProductCount(){
        noOfPurchaseAdProductCount++;
    }
    
    public void incrementClickCount(){
        noOfClicksCount++;
    }
    
    @Override
    public String toString() {
        return super.getName();
    }
    
    
    
}
