package com.example.codeclan.CourseBookingLabTry2.models;

public class Course {


    private String name;
    private String location;
    private StarRating starRating;

    public Course(String name, String location, StarRating starRating) {
        this.name = name;
        this.location = location;
        this.starRating = starRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public void setStarRating(StarRating starRating) {
        this.starRating = starRating;
    }
}
