package com.codeclan.courses_service.models;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "course_town")
    private String courseTown;
    @Column(name = "course_rating")
    private int rating;

    public Course(String courseName, String courseTown, int rating) {
        this.courseName = courseName;
        this.courseTown = courseTown;
        this.rating = rating;
    }

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTown() {
        return courseTown;
    }

    public void setCourseTown(String courseTown) {
        this.courseTown = courseTown;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
