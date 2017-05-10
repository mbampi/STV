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
    public Hike(String hike_id, String name, String distance, String time, String level, String location_name, String geo_location, Integer rating, String season, boolean camping, boolean dog_friendly, boolean public_transit, String image, ArrayList<String> reviews) {
        this.hike_id = hike_id;
        this.name = name;
        this.distance = distance;
        this.time = time;
        this.level = level;
        this.location_name = location_name;
        this.geo_location = geo_location;
        this.rating = rating;
        this.season = season;
        this.camping = camping;
        this.dog_friendly = dog_friendly;
        this.public_transit = public_transit;
        this.image = image;
        this.reviews = reviews;
    }
    

    // Without ArrayList<String> reviews;
    public Hike(String hike_id, String name, String distance, String time, String level, String location_name, String geo_location, Integer rating, String season, boolean camping, boolean dog_friendly, boolean public_transit, String image) {
        this.hike_id = hike_id;
        this.name = name;
        this.distance = distance;
        this.time = time;
        this.level = level;
        this.location_name = location_name;
        this.geo_location = geo_location;
        this.rating = rating;
        this.season = season;
        this.camping = camping;
        this.dog_friendly = dog_friendly;
        this.public_transit = public_transit;
        this.image = image;
    }

    // Without String hike_id and ArrayList<String> reviews;

    public Hike(String name, String distance, String time, String level, String location_name, String geo_location, Integer rating, String season, boolean camping, boolean dog_friendly, boolean public_transit, String image) {
        this.name = name;
        this.distance = distance;
        this.time = time;
        this.level = level;
        this.location_name = location_name;
        this.geo_location = geo_location;
        this.rating = rating;
        this.season = season;
        this.camping = camping;
        this.dog_friendly = dog_friendly;
        this.public_transit = public_transit;
        this.image = image;
    }
    
    
    /*      GETTERS       */
    
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

    public String getLocation_name() {
        return location_name;
    }

    public String getGeo_location() {
        return geo_location;
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
