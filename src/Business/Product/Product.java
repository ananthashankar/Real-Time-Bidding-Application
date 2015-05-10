/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

/**
 *
 * @author AnanthaShankar
 */
public class Product {
    
    
    private String prodName;
    private int productId;
    private String productType; // product category sport, education
    private int productViewsCount; // count of number of times viewed by user both advertiser's and publisher's
    private String product_Content;

    public Product() {
        productViewsCount = 0;
        
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProduct_Content() {
        return product_Content;
    }

    public void setProduct_Content(String product_Content) {
        this.product_Content = product_Content;
    }

    public int getProductViewsCount() {
        return productViewsCount;
    }

    public void setProductViewsCount(int productViewsCount) {
        this.productViewsCount = productViewsCount;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return prodName;
    }
    
    
}
