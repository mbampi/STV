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
    private User user;
    private int rating;
    private String comment;
    private Date hike_date;

    public Review(User user, int rating, String comment, Date hike_date) {
        this.user = user;
        this.rating = rating;
        this.comment = comment;
        this.hike_date = hike_date;
    }

    public int getRating() {
        return rating;
    }
    
}
