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
import model.Hike;
import model.User;

/**
 *
 * @author matheus
 */
public class HikeDAO {
        public void findByHike_id(String hike_id, hikeCallback callback){
        System.out.println("enterFind"); //test
        DatabaseReference ref = DataBaseManager.getDataBaseReference();
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println("completeFind"); //test
                DataSnapshot hike_data = snapshot.child("hikes").child(hike_id);
                Hike hike = hike_data.getValue(Hike.class);
                
                if (callback != null) { //if completed
                    //send String message
                    System.out.println("name:"+hike.getName()); //test
                    callback.done(hike);
                }
            }
            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    public void insertHike(Hike hike, messageCallback callback){
        DatabaseReference user_db = DataBaseManager.getDataBaseReference().child("hikes");
        System.out.println("enterInsert");
        user_db.child(hike.getHike_id()).setValue(new Hike(hike.getName(), hike.getDistance(), hike.getTime(), hike.getLocation(), hike.getRating(), hike.getSeason(), hike.isCamping(), hike.isDog_friendly(), hike.isPublic_transit(), hike.getImage()), new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                String message;
                System.out.println("completeInsert");
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
    
    public interface hikeCallback {
        void done(Hike hike);
    }
    
    public interface messageCallback {
        void done(String string);
    }
    
}
