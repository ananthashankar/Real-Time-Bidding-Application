/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CustomerHistory;

import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class CustomerBrowsingHistory {
    private ArrayList<CustomerBrowsing> custPublsiherBrowsingHist;
    private ArrayList<CustomerBrowsing> custAdvertiserAdClickHistoryHist;
    
    public CustomerBrowsingHistory(){
        custPublsiherBrowsingHist = new ArrayList<CustomerBrowsing>();
        custAdvertiserAdClickHistoryHist = new ArrayList<CustomerBrowsing>();
    }

    public ArrayList<CustomerBrowsing> getCustAdvertiserAdClickHistoryHist() {
        return custAdvertiserAdClickHistoryHist;
    }

    public ArrayList<CustomerBrowsing> getCustPublsiherBrowsingHist() {
        return custPublsiherBrowsingHist;
    }
    public CustomerBrowsing addPublisherBrowsingHistory(){
        CustomerBrowsing cb = new CustomerBrowsing();
        custPublsiherBrowsingHist.add(cb);
        return cb;
    }
    public CustomerBrowsing addAdvertiserBrowsingHistory(){
        CustomerBrowsing cb = new CustomerBrowsing();
        custAdvertiserAdClickHistoryHist.add(cb);
        return cb;
    }
    
}
