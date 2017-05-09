/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author matheus
 */
public class Review {
    private String user; //Foreign Key from User // Primary Key
    private Integer rating;
    private String comment;
    private Date hike_date;

    //Necessary for FireBase data retrieving
    public Review(){}
    
    //Complete
    public Review(String user, Integer rating, String comment, Date hike_date) {
        this.user = user;
        this.rating = rating;
        this.comment = comment;
        this.hike_date = hike_date;
    }
    
    //Without user
    public Review(Integer rating, String comment, Date hike_date) {
        this.rating = rating;
        this.comment = comment;
        this.hike_date = hike_date;
    }

    public String getUser() {
        return user;
    }

    public Integer getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public Date getHike_date() {
        return hike_date;
    }
    
}
