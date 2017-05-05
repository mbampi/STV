/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import java.io.FileNotFoundException;
import model.User;

/**
 *
 * @author matheus
 */
public class UserDAO {
    
//    List<User> findAll();
    
    public User findByUsername(String username){
        User user;
        DatabaseReference user_db = DataBaseManager.getDataBaseReference();
        System.out.println("sout: " + user_db.child(username).child("name").toString());

        return null;            
    }
    
    public void insertUser(User user){
        DatabaseReference user_db = DataBaseManager.getDataBaseReference().child("user");
        user_db.child(user.getUsername()).child("email").setValue(user.getEmail());
        user_db.child(user.getUsername()).child("name").setValue(user.getName());
        user_db.child(user.getUsername()).child("password").setValue(user.getPassword());
        //user_db.child(user.getEmail()).child("completed_trails");
        //user_db.child(user.getEmail()).child("want_to_do_trails");
        
        DataBaseManager.sleep();
    }
    
//    boolean updateUser(User user);
//    boolean deleteUser(User user);
    
}
