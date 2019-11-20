package com.example.android.quakereport;

public class Earthquake {
   private double magnitude;
   private String place;
   private  String time;
   //default constructor
   public Earthquake(){
    }
    public Earthquake(double magnitude,String place,String time ){
       this.magnitude=magnitude;
       this.place=place;
       this.time=time;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }
}
