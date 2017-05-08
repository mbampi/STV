/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author matheus
 */
public class CompletedHike {
    private Integer hike; // Foreign Key from Hike
    private Date date;
    private Time time;

    public CompletedHike(Integer hike, Date date, Time time) {
        this.hike = hike;
        this.date = date;
        this.time = time;
    }

    public Integer getHike() {
        return hike;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

}
