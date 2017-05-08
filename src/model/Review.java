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
    private Integer review_id;
    private User user;
    private Integer rating;
    private String comment;
    private Date hike_date;

    public Review(Integer review_id, User user, Integer rating, String comment, Date hike_date) {
        this.review_id = review_id;
        this.user = user;
        this.rating = rating;
        this.comment = comment;
        this.hike_date = hike_date;
    }

    public int getRating() {
        return rating;
    }
    
}
