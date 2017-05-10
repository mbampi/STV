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
public class Hike {
    private String hike_id; // Primary Key
    private String name;
    private String distance;
    private String time;
    private String level;
    private String location_name;
    private String geo_location;
    private Integer rating;
    private String season;
    private boolean camping;
    private boolean dog_friendly;
    private boolean public_transit;
    private String image;
    private ArrayList<String> reviews; // Foreign Key from Review (user_id)
    
    /*      CONSTRUCTORS       */
    
    //Necessary for FireBase data retrieving
    private Hike(){}
    
    //Complete 
    

    // Without ArrayList<String> reviews;


    // Without String hike_id and ArrayList<String> reviews;

    
    /*      GETTERS AND SETTERS       */

    public String getHike_id() {
        return hike_id;
    }

    public String getName() {
        return name;
    }

    public String getDistance() {
        return distance;
    }

    public String getTime() {
        return time;
    }

    public String getLevel() {
        return level;
    }

    public String getLocation() {
        return location;
    }

    public Integer getRating() {
        return rating;
    }

    public String getSeason() {
        return season;
    }

    public boolean isCamping() {
        return camping;
    }

    public boolean isDog_friendly() {
        return dog_friendly;
    }

    public boolean isPublic_transit() {
        return public_transit;
    }

    public String getImage() {
        return image;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }
    
}
