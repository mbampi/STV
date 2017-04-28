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
    private Hike hike;
    private Date date;
    private Time time;

    public CompletedHike(Hike hike, Date date, Time time) {
        this.hike = hike;
        this.date = date;
        this.time = time;
    }
    
}
