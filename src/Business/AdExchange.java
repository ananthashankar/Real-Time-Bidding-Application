/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.BiddingPlatform.DemandSideBiddingPlatform;
import Business.BiddingPlatform.SellSideBiddingPlatform;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.Customer;
import Business.Product.Product;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author AnanthaShankar
 */
public class AdExchange extends Organization {

    private ArrayList<PublisherEnterprise> publisherList;
    private ArrayList<AdvertiserEnterprise> advertiserList;
    private OrganizationDirectory organizationDirectory;

    public AdExchange(String name) {
        super(name);
        organizationDirectory = new OrganizationDirectory();
        publisherList = new ArrayList<PublisherEnterprise>();
        advertiserList = new ArrayList<AdvertiserEnterprise>();
    }

    public ArrayList<PublisherEnterprise> getPublisherList() {
        return publisherList;
    }

    public ArrayList<AdvertiserEnterprise> getAdvertiserList() {
        return advertiserList;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void addPublisher(PublisherEnterprise e) {
        publisherList.add(e);
    }

    public void addAdvertiser(AdvertiserEnterprise e) {
        advertiserList.add(e);
    }

    /* private ArrayList<AdvertiserEnterprise> filterBiddersLocation(String networkLocation){
     // filters bidders who are interested in displaying in that network
     ArrayList<AdvertiserEnterprise> biddersList = new ArrayList<AdvertiserEnterprise>();
     TreeMap<String, DemandSideBiddingPlatform> tm = new TreeMap<String, DemandSideBiddingPlatform>();
     for(AdvertiserEnterprise adEnt : advertiserList){
     for(DemandSideBiddingPlatform dsp : adEnt.getDsp()){
     if(dsp.getLocation().equalsIgnoreCase(networkLocation)){
     if(biddersList.contains(adEnt)){
                        
     } else {biddersList.add(adEnt);}
     }
     }
     } return biddersList;
     } */
    private TreeMap<String, List<DemandSideBiddingPlatform>> filterBiddersByLocationAndCatg(String networkLocation) {
        // filters bidders who are interested in displaying in that network
        TreeMap<String, List<DemandSideBiddingPlatform>> tm = new TreeMap<String, List<DemandSideBiddingPlatform>>();

        for (AdvertiserEnterprise adEnt : advertiserList) {
            System.out.println(adEnt.getDsp().size());
            for (DemandSideBiddingPlatform dsp : adEnt.getDsp()) {
                System.out.println(dsp.getLocation() + dsp.getAdType() + networkLocation);
                if (dsp.getLocation().equalsIgnoreCase(networkLocation)) {
                    System.out.println(dsp.getAdType());
                    if (tm.containsKey(adEnt.getName())) {
                        List<DemandSideBiddingPlatform> lst = tm.get(adEnt.getName());
                        lst.add(dsp);
                        tm.put(adEnt.getName(), lst);

                    } else {
                        List<DemandSideBiddingPlatform> lst = new ArrayList<DemandSideBiddingPlatform>();
                        lst.add(dsp);
                        tm.put(adEnt.getName(), lst);
                    }
                }
            }
        }
        return tm;
    }

    /* private TreeMap<String, DemandSideBiddingPlatform> filterBiddersLocation(String networkLocation) {
     // filters bidders who are interested in displaying in that network
     TreeMap<String, DemandSideBiddingPlatform> tm = new TreeMap<String, DemandSideBiddingPlatform>();
     for (AdvertiserEnterprise adEnt : advertiserList) {
     for (DemandSideBiddingPlatform dsp : adEnt.getDsp()) {
     if (dsp.getLocation().equalsIgnoreCase(networkLocation)) {
     tm.put(adEnt, dsp);
     }
     }
     }
     return tm;
     }   */
    private TreeMap<String, List<DemandSideBiddingPlatform>> filterBiddersUaMinBidIntAge(String uidResult, float minBid, ArrayList<String> interests, String age,
            TreeMap<String, List<DemandSideBiddingPlatform>> tm) {
        System.out.println("Filter by min bid and age");
        TreeMap<String, List<DemandSideBiddingPlatform>> tm1 = new TreeMap<String, List<DemandSideBiddingPlatform>>();
        TreeMap<String, List<DemandSideBiddingPlatform>> tm2 = new TreeMap<String, List<DemandSideBiddingPlatform>>();
        if (!(uidResult.equalsIgnoreCase("Verified"))) {
            for (String ae : tm.keySet()) {
                List<DemandSideBiddingPlatform> lst = tm.get(ae);
                List<DemandSideBiddingPlatform> lst1 = new ArrayList<DemandSideBiddingPlatform>();
                for (DemandSideBiddingPlatform dsp : lst) {
                    if (dsp.getUserUniqueId().equalsIgnoreCase("Not Needed")) {
                        lst1.add(dsp);
                    }
                }
                tm1.put(ae, lst1);

            }
        } else {
            for (String ae : tm.keySet()) {
                tm1.put(ae, tm.get(ae));
            }
        }
        for (String ae : tm1.keySet()) {
            List<DemandSideBiddingPlatform> lst = tm.get(ae);
            List<DemandSideBiddingPlatform> lst1 = new ArrayList<DemandSideBiddingPlatform>();
            for (DemandSideBiddingPlatform d : lst) {
                int flag = 0;
                for (String intr : d.getUserInterest()) {

                    if (interests.contains(intr) && d.getMinBidValue() >= minBid && d.getUserAge().equalsIgnoreCase(age)) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    lst1.add(d);
                }
            }
            tm2.put(ae, lst1);

        }
        return tm2;
    }

    private TreeMap<String, DemandSideBiddingPlatform> realTimeBidding(DemandSideBiddingPlatform biddingInputDetails, String publisherName) {
        TreeMap<String, DemandSideBiddingPlatform> bid_Winner = new TreeMap<String, DemandSideBiddingPlatform>();

        try{
        System.out.println("realtime bidding");
        // ArrayList<AdvertiserEnterprise> biddersList = filterBiddersLocation(biddingInputDetails.getLocation());
       // TreeMap<String, DemandSideBiddingPlatform> bid_Winner = new TreeMap<String, DemandSideBiddingPlatform>();
        System.out.println(biddingInputDetails.getAdType());
        TreeMap<String, List<DemandSideBiddingPlatform>> tm = filterBiddersByLocationAndCatg(biddingInputDetails.getLocation());
        if (tm.size() > 0) {
            TreeMap<String, List<DemandSideBiddingPlatform>> tm1 = filterBiddersUaMinBidIntAge(biddingInputDetails.getUserUniqueId(),
                    biddingInputDetails.getMinBidValue(),
                    biddingInputDetails.getUserInterest(), biddingInputDetails.getUserAge(), tm);
            if (tm1.size() > 0) {

                TreeMap<String, List<DemandSideBiddingPlatform>> tm2 = new TreeMap<String, List<DemandSideBiddingPlatform>>();
                for (String ae : tm1.keySet()) {
                    List<DemandSideBiddingPlatform> lst = tm1.get(ae);
                    List<DemandSideBiddingPlatform> lst1 = tm1.get(ae);
                    for (DemandSideBiddingPlatform dsp : lst) {
                        if (dsp.getNoOfPurchaseAdProductCount() >= biddingInputDetails.getNoOfPurchaseAdProductCount()
                                && dsp.getNoOfClicksCount() >= biddingInputDetails.getNoOfClicksCount()
                                && dsp.getProductBrowseCount() >= biddingInputDetails.getProductBrowseCount()) {
                            lst1.remove(dsp);
                        }
                    }
                    tm2.put(ae, lst1);
                }
                System.out.println(tm2.size() + tm2.firstKey() + tm2.lastKey());
                if (tm2.size() > 0) {
                    TreeMap<String, DemandSideBiddingPlatform> tm3 = new TreeMap<String, DemandSideBiddingPlatform>();
                    TreeMap<String, DemandSideBiddingPlatform> tm4 = new TreeMap<String, DemandSideBiddingPlatform>();
                    for (String ae : tm2.keySet()) {
                        List<DemandSideBiddingPlatform> lst = tm2.get(ae);

                        if (lst.size() > 1) {
                            DemandSideBiddingPlatform d = null;
                            float bidValue = 0;
                            for (DemandSideBiddingPlatform dsp : lst) {
                                if (bidValue < dsp.getMinBidValue()) {
                                    bidValue = dsp.getMinBidValue();
                                    d = dsp;
                                }
                            }
                            tm3.put(ae, d); System.out.println(ae + d);
                            tm4.put(ae, d);
                        } else if (lst.size() == 1) {
                            for (DemandSideBiddingPlatform dsp : lst) {
                                tm3.put(ae, dsp);
                                tm4.put(ae, dsp);
                            }

                        }
                    }
                    // for loop for highest bidder and for multiple winners retrieve max value
                    float win_bid = 0;

                    String winner_bidder = null;
                    TreeMap<String, DemandSideBiddingPlatform> lst = new TreeMap<String, DemandSideBiddingPlatform>();
                    for (String ae : tm3.keySet()) {
                        if (tm3.get(ae).getMinBidValue() == win_bid) {
                            lst.put(ae, tm3.get(ae));
                        } else if (tm3.get(ae).getMinBidValue() > win_bid) {
                            win_bid = tm3.get(ae).getMinBidValue();
                            winner_bidder = ae;
                            lst.put(ae, tm3.get(ae));
                        } else {
                            tm4.remove(ae, tm3.get(ae));
                        }
                    }
                    if (lst.size() > 1) {
                        float win_bid1 = 0;

                        String winner_bidder1 = null;
                        TreeMap<String, DemandSideBiddingPlatform> lst1 = new TreeMap<String, DemandSideBiddingPlatform>();
                        for (String ae : tm4.keySet()) {
                            if (tm4.get(ae).getMaxBidRaise() == win_bid1) {
                                lst1.put(ae, tm4.get(ae));
                            } else if (tm4.get(ae).getMaxBidRaise() > win_bid1) {
                                win_bid1 = tm4.get(ae).getMaxBidRaise();
                                winner_bidder1 = ae;
                                lst1.put(ae, tm4.get(ae));
                            }
                        }
                        if (lst1.size() > 1) {
                            String winner = lst1.firstKey();
                            DemandSideBiddingPlatform win_dsp = lst1.get(winner);
                            win_dsp.setMinBidValue(0);
                            bid_Winner.put(winner, win_dsp);
                            return bid_Winner;
                        }  else if(lst1.size() == 1) {
                            String winner = lst1.firstKey();
                            DemandSideBiddingPlatform win_dsp = lst1.get(winner);
                            win_dsp.setMinBidValue(0);
                            bid_Winner.put(winner, win_dsp);
                            return bid_Winner;
                        }
                    } else if(lst.size() == 1) {
                        String winner = lst.firstKey();
                        DemandSideBiddingPlatform win_dsp = lst.get(winner);
                        win_dsp.setMaxBidRaise(0);
                        bid_Winner.put(winner, win_dsp);
                        return bid_Winner;
                    }

                } else {
                    return bid_Winner;
                }
            } else {
                return bid_Winner;
            }
        } else {
            return bid_Winner;
        }
        return bid_Winner;
    } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Values");
    }
        return bid_Winner;
    }

    public TreeMap<String, DemandSideBiddingPlatform> setSsp(String publisherName, int productBrowseCount, String userAge, int userClickCount, int noOfPurchaseAdProductCount,
            int noOfClicksCount, String location, String accountVerification, ArrayList<String> interests) {
        TreeMap<String, DemandSideBiddingPlatform> bid_Winner = new TreeMap<String, DemandSideBiddingPlatform>();
        DemandSideBiddingPlatform dsp = new DemandSideBiddingPlatform();
        float min_bid = 0;
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<SellSideBiddingPlatform> ssp = new ArrayList<SellSideBiddingPlatform>();
        ArrayList<SellSideBiddingPlatform> ssp1 = new ArrayList<SellSideBiddingPlatform>();
        for (PublisherEnterprise pe : publisherList) {
            if (pe.getName().equalsIgnoreCase(publisherName)) {
                for (SellSideBiddingPlatform ss : pe.getSsp()) {
                    if (ss.getUserAge().equalsIgnoreCase(userAge)) {
                        ssp.add(ss);
                        ssp1.add(ss);
                    }
                }
                for (SellSideBiddingPlatform sp : ssp) {
                    if (sp.getNoOfPurchaseAdProductCount() > noOfPurchaseAdProductCount
                            && sp.getUserClickCount() > userClickCount && sp.getProductBrowseCount() > productBrowseCount
                            && sp.getNoOfClicksCount() > noOfClicksCount) {
                        ssp1.remove(sp);
                    }
                }
                for (SellSideBiddingPlatform sp : ssp1) {
                    if (sp.getMinBidValue() > min_bid) {
                        min_bid = sp.getMinBidValue();
                    }
                }
                dsp.setMinBidValue(min_bid);
                dsp.setLocation(location);
                dsp.setMaxBidRaise(0);
                dsp.setProductBrowseCount(productBrowseCount);
                dsp.setUserAge(userAge);
                dsp.setNoOfClicksCount(noOfClicksCount);
                dsp.setNoOfPurchaseAdProductCount(noOfPurchaseAdProductCount);
                dsp.setUserInterest(interests);
                dsp.setAdType(" ");
                dsp.setUserUniqueId(accountVerification);
                System.out.println(dsp.getLocation() + publisherName + dsp.getMinBidValue());
                bid_Winner = realTimeBidding(dsp, publisherName);
                return bid_Winner;
            }
        }
        return bid_Winner;

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public String toString() {
        return super.getName();
    }

   // comparison logic goes here
}
