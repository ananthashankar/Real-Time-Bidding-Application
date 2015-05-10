/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.Role;
import Business.Role.UserRole;
import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class UserOrganization extends Organization{
    
    public UserOrganization(){
        super(Type.User.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new UserRole());
        return roles;
    }
    
}
