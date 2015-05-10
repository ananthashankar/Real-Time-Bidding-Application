/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author AnanthaShankar
 */
public class Person {
    private String name;
  //  private int age;
    private int id;
    private static int counter=1;
    
    public Person(){
        id = counter;
        counter++;
    }

    public int getId() {
        return id;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public String toString() {
        return name;
    }
    
    
            
}
