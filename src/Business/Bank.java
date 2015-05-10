/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class Bank extends Organization{
   
    private ArrayList<BankAccount> bankAccountList;
    private OrganizationDirectory organizationDirectory;
    
    public Bank(String name){
        super(name);
        bankAccountList = new ArrayList<BankAccount>();
        organizationDirectory = new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    
    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }
    
    public BankAccount addBankAccount(){
        BankAccount ba = new BankAccount();
        bankAccountList.add(ba);
        return ba;
    }
    
 /*   @Override
    public String toString(){
        return super.getName();
    } */

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
