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
public class CompletedHike {
    private String hike; // Foreign Key from Hike
    private Date date;
    private String time;

    public CompletedHike(String hike, Date date, String time) {
        this.hike = hike;
        this.date = date;
        this.time = time;
    }
    
    public CompletedHike(Date date, String time) {
        this.date = date;
        this.time = time;
    }

    public String getHike() {
        return hike;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

}
