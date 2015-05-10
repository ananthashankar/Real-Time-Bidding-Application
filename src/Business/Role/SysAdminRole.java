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
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SysAdminRole.SysAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author AnanthaShankar
 */
public class SysAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem system, AdExchange adEx, Bank bank) {
        return new SysAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
