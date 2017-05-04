/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author matheus
 */
public class UserDAO {

    private DatabaseReference getDataBaseReference() throws FileNotFoundException{
        FileInputStream serviceAccount = new FileInputStream("/Users/matheus/NetBeansProjects/FirebaseTest/src/firebasetest/Unknown");
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
                .setDatabaseUrl("https://stock-trail-vancouver-d8d38.firebaseio.com/")
                .build();

        FirebaseApp app = FirebaseApp.initializeApp(options);
        FirebaseDatabase database = FirebaseDatabase.getInstance(app);
        return database.getReference();
    }
//    List<User> findAll();
//    List<User> findByEmail();
    
    public boolean insertUser(User user){
        try{
        DatabaseReference user_db = this.getDataBaseReference().child("user");
        
        user_db.child(user.getEmail()).child("name").setValue(user.getName());
        user_db.child(user.getEmail()).child("password").setValue(user.getPassword());
        user_db.child(user.getEmail()).child("completed_trails");
        user_db.child(user.getEmail()).child("want_to_do_trails");
        Thread.sleep(14);
        return true;
        
        }catch(FileNotFoundException | InterruptedException ex){ return false; }
    }
    
//    boolean updateUser(User user);
//    boolean deleteUser(User user);
    
}
