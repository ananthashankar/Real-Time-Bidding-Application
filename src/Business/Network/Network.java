/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.FinancialAccount.FinancialAccountDirectory;

/**
 *
 * @author AnanthaShankar
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
  //  private FinancialAccountDirectory fad;
        
    public Network(){
       
        this.enterpriseDirectory = new EnterpriseDirectory();
     //   this.fad = new FinancialAccountDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public FinancialAccountDirectory getFad() {
//        return fad;
//    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
}
