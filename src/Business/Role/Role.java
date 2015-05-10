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
import javax.swing.JPanel;

/**
 *
 * @author AnanthaShankar
 */
public abstract class Role {
    
    public enum RoleType{
        
        Admin("Admin"),
        AdExAdmin("Ad Exchange Admin"),
        BankAdmin("Bank Admin"),
        SysAdmin("System Admin"),
        FinancialAccountManager("Finance Account Manager"),
        PlatformManager("Platform Manager"),
        ProductManager("ProductManager"),
        User("User");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
                    UserAccount account, Organization organization, 
                    Enterprise enterprise, EcoSystem system, AdExchange adEx, Bank bank);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
}
