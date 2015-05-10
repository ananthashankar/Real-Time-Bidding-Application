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
public class AdvertiserProduct extends Product{
    
    private int price;
    private int availability;
    private int total_sold ;
    
    public AdvertiserProduct(){
        total_sold = 0;
    }

    public void setTotal_sold(int total_sold) {
        this.total_sold = total_sold;
    }

    public int getTotal_sold() {
        return total_sold;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
}
