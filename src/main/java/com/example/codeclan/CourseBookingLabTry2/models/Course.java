package com.example.codeclan.CourseBookingLabTry2.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name ="location")
    private String location;

    @Column(name="starRating")
    private StarRating starRating;

    @JsonIgnoreProperties({"course"})
    @OneToMany(mappedBy = "course")
    private List<Booking> bookings;


    public Course(String name, String location, StarRating starRating) {
        this.name = name;
        this.location = location;
        this.starRating = starRating;
        this.bookings = new ArrayList<>();
    }

    public Course(){}

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBookings(Booking booking) {
        this.bookings.add(booking);
    }
}
