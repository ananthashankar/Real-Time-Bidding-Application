/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class ProductDirectory {
    
    private ArrayList<Product> productCatalog;
    
    
    public ProductDirectory() {
        productCatalog = new ArrayList<Product>();
    }

       
    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
    
    public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    
    public Product searchProduct(int id) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Product p : productCatalog) {
            if(p.getProductId() == id) {
                return p;
            }
        }
        return null;
    }
    
}
