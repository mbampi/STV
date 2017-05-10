/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class User {
    private String username; //Primary Key
    private String email;
    private String password;
    private String name;
    private ArrayList<String> completed_hikes; //Foreign Key of CompletedHike
    private ArrayList<String> want_to_do_hikes; //Foreign Key of Hike
    
    
    /*      CONSTRUCTORS       */
    
    //Necessary for FireBase data retrieving
    private User() {}
    
    //Complete
    public User(String username, String email, String password, String name) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
    }
    
    //Without username
    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    /*      GETTERS AND SETTERS       */
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }
    
}
