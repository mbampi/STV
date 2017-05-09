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
import model.CompletedHike;

import model.User;

/**
 *
 * @author matheus
 */
public class UserDAO {
    
    public void getUserByUsername(String username, userCallback callback){
        DatabaseReference ref = DataBaseManager.getDataBaseReference();
        DataBaseManager.sleep(40);   // SLEEEEEEEEEEEEEP
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println("datachange");
                DataSnapshot user_data = snapshot.child("users").child(username);
                String email = (String) user_data.child("email").getValue();
                String password = (String) user_data.child("password").getValue();
                String name = (String) user_data.child("name").getValue();
                User user = new User(username, email, password, name);
                //User user = user_data.getValue(User.class);
                if (callback != null) { //if completed
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
        DatabaseReference user_db = DataBaseManager.getDataBaseReference().child("users");
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
    
    public void deleteUser(String username, messageCallback callback){
        DatabaseReference user_db = DataBaseManager.getDataBaseReference().child("users");
        user_db.child(username).removeValue(new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                String message;
                if (databaseError != null) {
                    //Error message error
                   message = "Data could not be deleted " + databaseError.getMessage();
                } else {
                    //User saved successfully
                    message = "Deleted successfully.";
                }
                if (callback != null) { //if completed
                    //send String message
                    callback.done(message);
                }
            }
        }); 
    }
    
    public void addCompletedHike(CompletedHike completed_hike, String user_id, messageCallback callback){
        DatabaseReference user_db = DataBaseManager.getDataBaseReference().child("users").child(user_id).child("completed_hikes");
        System.out.println("enterInsert"); //test
        user_db.child(completed_hike.getHike()).setValue(new CompletedHike(completed_hike.getDate(), completed_hike.getTime()), new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                String message;
                System.out.println("completeInsert");//test
                if (databaseError != null) {
                    //Error message error
                   message = "Data could not be saved " + databaseError.getMessage();
                } else {
                    //Hike saved successfully
                    message = "Data saved successfully.";
                }
                
                if (callback != null) { //if completed
                    //send String message
                    callback.done(message);
                }
            }
        }); 
    }
    
    public void addWantToDoHike(String want_to_do_hike_id, String user_id, messageCallback callback){
        DatabaseReference ref = DataBaseManager.getDataBaseReference().child("users").child(user_id).child("want_to_do_hikes");
        System.out.println("enterInsert"); //test
        ref.setValue(want_to_do_hike_id, true, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                String message;
                System.out.println("onComplete");//test
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
