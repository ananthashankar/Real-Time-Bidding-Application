/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Role.FinancialAccountManagerRole;
import Business.Role.PlatformManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class PlatformManagerOrganization extends Organization{
    
    public PlatformManagerOrganization(){
        super(Type.PlatformManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PlatformManagerRole());
        return roles;
    }
    
}
