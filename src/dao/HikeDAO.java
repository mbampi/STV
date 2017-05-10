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
import java.util.List;
import model.Hike;
import model.Review;

/**
 *
 * @author matheus
 */
public class HikeDAO {

    /*      HIKES       */
    
    public void allHikes(hikeListCallback callback) {
        System.out.println("enterFind"); //test
        List<Hike> hikeList = new ArrayList<>();
        DatabaseReference ref = DataBaseManager.getDataBaseReference();
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println("completeFind"); //test
                DataSnapshot hike_data = snapshot.child("hikes");
                hikeList.clear();
                for (DataSnapshot postSnapshot : hike_data.getChildren()) {
                    Hike hike = postSnapshot.getValue(Hike.class);
                    hikeList.add(hike);
                }
                if (callback != null) { //if completed
                    callback.done(hikeList);
                }
            }

            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    public void getHikeByHike_id(String hike_id, hikeCallback callback) {
        System.out.println("enterFind"); //test
        DatabaseReference ref = DataBaseManager.getDataBaseReference();
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println("completeFind"); //test
                DataSnapshot hike_data = snapshot.child("hikes").child(hike_id);
                Hike hike = hike_data.getValue(Hike.class);
                if (callback != null) { //if completed
                    //send String message
                    System.out.println("name:" + hike.getName()); //test
                    callback.done(hike);
                }
            }

            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public void insertHike(Hike hike, messageCallback callback) {
        DatabaseReference user_db = DataBaseManager.getDataBaseReference().child("hikes");
        System.out.println("enterInsert");
        user_db.child(hike.getHike_id()).setValue(new Hike(hike.getName(), hike.getDistance(), hike.getTime(), hike.getLevel(), hike.getLocation_name(), hike.getGeo_location(), hike.getRating(), hike.getSeason(), hike.isCamping(), hike.isDog_friendly(), hike.isPublic_transit(), hike.getImage()), new DatabaseReference.CompletionListener() {
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
    
    public void deleteHike (String hike_id, UserDAO.messageCallback callback){
        DatabaseReference ref = DataBaseManager.getDataBaseReference().child("hikes");
        ref.child(hike_id).removeValue(new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                String message;
                if (databaseError != null) {
                   message = "Data could not be deleted " + databaseError.getMessage();
                } else {
                    message = "Deleted successfully.";
                }
                if (callback != null) { //if completed
                    callback.done(message);
                }
            }
        }); 
    }
    
    /*      HIKE REVIEWS       */
    
    public void allReviews(String hike_id, hikeListCallback callback) {
        System.out.println("enterFind"); //test
        List<Hike> hikeList = new ArrayList<>();
        DatabaseReference ref = DataBaseManager.getDataBaseReference();
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println("completeFind"); //test
                DataSnapshot hike_data = snapshot.child("hikes");
                hikeList.clear();
                for (DataSnapshot postSnapshot : hike_data.getChildren()) {
                    Hike hike = postSnapshot.getValue(Hike.class);
                    hikeList.add(hike);
                }
                if (callback != null) { //if completed
                    callback.done(hikeList);
                }
            }

            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    public void insertReview(Review review, String hike_id, messageCallback callback) {
        DatabaseReference user_db = DataBaseManager.getDataBaseReference().child("hikes");
        System.out.println("enterInsert");
        user_db.child(hike_id).child("reviews").setValue(review.getUser(), new Review(review.getRating(), review.getComment(), review.getHike_date()), new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                String message;
                System.out.println("completeInsert");
                if (databaseError != null) {
                    message = "Data could not be saved " + databaseError.getMessage();
                } else {
                    message = "Data saved successfully.";
                }

                if (callback != null) { //if completed
                    callback.done(message);
                }
            }
        });
    }
    
    public void deleteReview(String username, String hike_id, messageCallback callback) {
        DatabaseReference ref = DataBaseManager.getDataBaseReference().child("hikes");
        ref.child(hike_id).child("reviews").child(username).removeValue(new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                String message;
                if (databaseError != null) {
                   message = "Data could not be deleted " + databaseError.getMessage();
                } else {
                    message = "Deleted successfully.";
                }
                if (callback != null) { //if completed
                    callback.done(message);
                }
            }
        }); 
    }

    /*      CALLBACKS       */
    
    public interface hikeCallback {
        void done(Hike hike);
    }
    
    public interface hikeListCallback {
        void done(List<Hike> hikeList);
    }

    public interface messageCallback {
        void done(String string);
    }

}
