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
import java.util.ArrayList;
import model.User;

/**
 *
 * @author matheus
 */
public class UserDAO {
    
//    List<User> findAll();
    
    public User findByUsername(String username){
        DatabaseReference ref = DataBaseManager.getDataBaseReference();
        final ArrayList<User> users = new ArrayList<>();
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                DataSnapshot user_data = snapshot.child("user").child(username);
                String email = (String) user_data.child("email").getValue();
                String password = (String) user_data.child("password").getValue();
                String name = (String) user_data.child("name").getValue();
                users.add(new User(username, email, password, name));
                //User from database - Need to return it!
                System.out.println("user "+users.get(0).getName());
            }
            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        return users.get(0);  
    }
    
    public void insertUser(User user){
        DatabaseReference user_db = DataBaseManager.getDataBaseReference().child("user");
        user_db.child(user.getUsername()).setValue(new User(user.getEmail(), user.getPassword(), user.getName()));
        DataBaseManager.sleep();
    }
    
//    boolean updateUser(User user);
//    boolean deleteUser(User user);
    
}
