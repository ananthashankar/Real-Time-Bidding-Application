/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;


/**
 *
 * @author Anantha Shankar
 */
public class ConfigureEcoSystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Person person = new Person();
        system.getPersonDirectory().createPerson("System Admin");
        person.setName("SysAdmin");
       // person.setAge(0);
        UserAccount userAccount = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SysAdminRole());
        return system;
    }
}
