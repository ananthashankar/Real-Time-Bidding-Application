/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FinancialAccount;

import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class FinancialAccountDirectory {
    
    private ArrayList<FinancialAccount> fa;
    
    public FinancialAccountDirectory(){
        fa = new ArrayList<FinancialAccount>();
    }

    public ArrayList<FinancialAccount> getFa() {
        return fa;
    }
    
    public void addFinancialAccount(){
        FinancialAccount f = new FinancialAccount();
        fa.add(f);
    }
}
