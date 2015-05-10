/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SysAdminRole;
//import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem system;
    //private OrganizationDirectory organizationDirectory;
    private ArrayList<Network> networkList;
    private BankDirectory bankDirectory;
    private AdExchangeDirectory adExDir;
    
    public static EcoSystem getInstance(){
        if (system == null){
            system = new EcoSystem();
        }
        return system;
    } 
    
    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        bankDirectory = new BankDirectory();
        adExDir = new AdExchangeDirectory();
    } 

    public BankDirectory getBankDirectory() {
        return bankDirectory;
    }

    public AdExchangeDirectory getAdExDir() {
        return adExDir;
    }
       
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network addNetwork(String name){
        Network network = new Network();
        network.setName(name);
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new SysAdminRole());
        return roles;
    }
    
}
