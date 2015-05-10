/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.FinancialAccount.FinancialAccount;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Purchase.PurchaseHistory;

/**
 *
 * @author AnanthaShankar
 */
public abstract class Enterprise extends Organization {

    private OrganizationDirectory organizationDirectory;
    private FinancialAccount fa;
    private PurchaseHistory purchHist;
    
    
    private EnterpriseType type;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.type = type;
        organizationDirectory = new OrganizationDirectory();
        fa = new FinancialAccount();
        purchHist = new PurchaseHistory();
    }

    public enum EnterpriseType {

        Advertiser("Advertiser"),
        Publisher("Publisher");

        private String value;

        private EnterpriseType(String value) {
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

    public FinancialAccount getFa() {
        return fa;
    }

    public PurchaseHistory getPurchHist() {
        return purchHist;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public EnterpriseType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.getName();
    }

}
