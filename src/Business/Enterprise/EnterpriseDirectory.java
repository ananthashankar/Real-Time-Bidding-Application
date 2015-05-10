/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
       Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Advertiser || type == Enterprise.EnterpriseType.Publisher ){
            if(type == Enterprise.EnterpriseType.Advertiser){
                    Enterprise enterp = new AdvertiserEnterprise(name, type);
                    enterpriseList.add(enterp);
            } else if(type == Enterprise.EnterpriseType.Publisher){
                    Enterprise enterp = new PublisherEnterprise(name, type);
                    enterpriseList.add(enterp);
            }
        return enterprise;
    }
    return enterprise;
    }
    
    
}
