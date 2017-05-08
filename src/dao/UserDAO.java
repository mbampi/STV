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

import model.User;

/**
 *
 * @author matheus
 */
public class UserDAO {
//    List<User> findAll();

    public void findByUsername(String username, userCallback callback){
        DatabaseReference ref = DataBaseManager.getDataBaseReference();
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                DataSnapshot user_data = snapshot.child("user").child(username);
                String email = (String) user_data.child("email").getValue();
                String password = (String) user_data.child("password").getValue();
                String name = (String) user_data.child("name").getValue();
                User user = new User(username, email, password, name);
                
                if (callback != null) { //if completed
                    //send String message
                    callback.done(user);
                }
            }
            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    public void insertUser(User user, messageCallback callback){
        DatabaseReference user_db = DataBaseManager.getDataBaseReference().child("user");
        user_db.child(user.getUsername()).setValue(new User(user.getEmail(), user.getPassword(), user.getName()), new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                String message;
                if (databaseError != null) {
                    //Error message error
                   message = "Data could not be saved " + databaseError.getMessage();
                } else {
                    //User saved successfully
                    message = "Data saved successfully.";
                }
                
                if (callback != null) { //if completed
                    //send String message
                    callback.done(message);
                }
            }
        });
        
        
    }
    
    
    public interface userCallback {
        void done(User user);
    }
    
    public interface messageCallback {
        void done(String string);
    }
}
