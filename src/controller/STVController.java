/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Hiking;
import model.User;

/**
 *
 * @author matheus
 */
public class STVController {
    private ArrayList<User> users;
    private ArrayList<Hiking> hikings;
    private User login_user;
    
    public boolean login(String email, String password){
        User tempUser = this.getUserByEmail(email);
        if(tempUser!=null && tempUser.getPassword().equals(password)){
            this.login_user = tempUser;
            return true;
        }
        return false;
    }
    
    public void logout(){
        this.login_user = null;
    }
    
    private User getUserByEmail(String email){
        for(User user : users){
            if(user.getEmail().equals(email))
                return user;
        }
        return null;
    }
    
    public boolean isLogin(){
        return !(login_user==null);
    }
    
}
