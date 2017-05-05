/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.net.URL;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class Hike {
    private String name;
    private ArrayList<URL> images;
    private Double distance;
    private Time time;
    private CourseMap location;
    private int rating;
    private ArrayList<Review> reviews;
    private String season;
    private boolean camping;
    private boolean dog_friendly;
    private boolean public_transit;
    //toilet deleted

    public Hike(String name, ArrayList<URL> images, Double distance, Time time, CourseMap location, String season, boolean camping, boolean dog_friendly, boolean public_transit) {
        this.name = name;
        this.images = images;
        this.distance = distance;
        this.time = time;
        this.location = location;
        this.season = season;
        this.camping = camping;
        this.dog_friendly = dog_friendly;
        this.public_transit = public_transit;
    }
    
    public void addReview(Review new_review){
        this.rating = ( (this.rating*this.reviews.size()) + new_review.getRating() ) / (this.reviews.size()+1);
        this.reviews.add(new_review);
    }
}
