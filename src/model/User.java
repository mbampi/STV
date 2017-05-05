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
    private final String username;
    private String email;
    private String password;
    private String name;
    private ArrayList<Hike> want_to_do_hikes;
    private ArrayList<CompletedHike> completed_hikes;

    public User(String username, String email, String password, String name) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
    }

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
    
    public void addWantToDoTrail(Hike hike){
        this.want_to_do_hikes.add(hike);
    }
    
    public void addCompletedHike(CompletedHike hike){
        this.completed_hikes.add(hike);
    }

    public String getUsername() {
        return username;
    }
    
}
