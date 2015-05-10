/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.AdExchange;
import Business.Bank;
import Business.EcoSystem;
import Business.Enterprise.AdvertiserEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PlatformManagerRole.AdExPlatformManagerWorkAreaJPanel;
import UserInterface.PlatformManagerRole.AdvertiserPlatFormManagerWorkAreaJPanel;
import UserInterface.PlatformManagerRole.PlatformManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author AnanthaShankar
 */
public class PlatformManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem system, AdExchange adEx, Bank bank) {
        JPanel jp = null;
        
            if(enterprise instanceof PublisherEnterprise){
        jp =  new PlatformManagerWorkAreaJPanel(userProcessContainer, enterprise, system);
            } else if(enterprise instanceof AdvertiserEnterprise){
        jp =  new AdvertiserPlatFormManagerWorkAreaJPanel(userProcessContainer, enterprise, system);        
            }
        else {
        jp =  new AdExPlatformManagerWorkAreaJPanel(userProcessContainer, adEx, enterprise, system);    
        }
        return jp;
    } 
    
}
