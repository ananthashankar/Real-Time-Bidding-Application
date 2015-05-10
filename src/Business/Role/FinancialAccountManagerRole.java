/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.AdExchange;
import Business.Bank;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.FinancialAccountManagerRole.AdFinanceAccountManagerWorkArea;
import UserInterface.FinancialAccountManagerRole.FinancialAccountManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author AnanthaShankar
 */
public class FinancialAccountManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem system, AdExchange adEx, Bank bank) {
        if(enterprise instanceof PublisherEnterprise){
       return new FinancialAccountManagerWorkAreaJPanel(userProcessContainer, account, enterprise, system);}
        else {
            return new AdFinanceAccountManagerWorkArea(userProcessContainer, account, organization, enterprise, system);
        }
    }
    
}
