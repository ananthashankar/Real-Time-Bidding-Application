/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.FinancialAccountManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class FinanceAccountManageOrganization extends Organization{
    
    public FinanceAccountManageOrganization(){
        super(Type.FinanceAccountManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FinancialAccountManagerRole());
        return roles;
    }
    
}
