package com.example.coureservice;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseTitle;

    public Course(){}

    public Course(String courseTitle) {
        this.setCourseTitle(courseTitle);
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
}
