package com.softeal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by SOFTWARE02 on 29.09.2018.
 */
@Entity
@Table(name="vehicles")
public class Vehicles {

    @Id
    @Column(name="label")
    private String label;


    @Column(name = "lat")
    private double latitude;

    @Column(name = "lon")
    private double longitude;


    @Column(name = "location")
    private String location;

    @Column(name = "locationtime")
    private String locationtime;

    @Column(name = "observer")
    private String observer;


    public Vehicles(String label, double latitude, double longitude, String location, String locationtime, String observer) {
        this.label = label;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location = location;
        this.locationtime = locationtime;
        this.observer = observer;
    }

    public Vehicles(){

    }



    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationtime() {
        return locationtime;
    }

    public void setLocationtime(String locationtime) {
        this.locationtime = locationtime;
    }

    public String getObserver() {
        return observer;
    }

    public void setObserver(String observer) {
        this.observer = observer;
    }
}
