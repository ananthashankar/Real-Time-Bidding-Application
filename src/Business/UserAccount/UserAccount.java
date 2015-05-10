/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author AnanthaShankar
 */
public class UserAccount {
    
    private String userName;
    private String password;
    private Role role;
    private Person person;
    private WorkQueue workQueue;
   // private String createdDate;

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
    @Override
    public String toString(){
        return userName;
    }
    
}