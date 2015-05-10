/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> orgList;
    
    public OrganizationDirectory(){
        orgList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization org = null;
        if(type.getValue().equals(Organization.Type.Admin.getValue())){
            org = new AdminOrganization();
            orgList.add(org);
        }
        if(type.getValue().equals(Organization.Type.User.getValue())){
            org = new UserOrganization();
            orgList.add(org);
        }
        if(type.getValue().equals(Organization.Type.FinanceAccountManager.getValue())){
            org = new FinanceAccountManageOrganization();
            orgList.add(org);
        }
        if(type.getValue().equals(Organization.Type.PlatformManager.getValue())){
            org = new PlatformManagerOrganization();
            orgList.add(org);
        }
        if(type.getValue().equals(Organization.Type.ProductManager.getValue())){
            org = new ProductManagerOrganization();
            orgList.add(org);
        }
        if(type.getValue().equals(Organization.Type.BankAccountManager.getValue())){
            org = new BankAccountManageOrganization();
            orgList.add(org);
        }
        return org;
    }
    
}
