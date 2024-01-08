package com.example.coureservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id){
        return courseRepository.findById(id).orElse(null);
    }

    public Course createCourse(Course course){
        return courseRepository.save(course);
    }

    public Course updateCourse(Long id,Course course){
        if(courseRepository.existsById(id)){
            course.setId(id);
            return courseRepository.save(course);
        }
        else {
            return null;
        }
    }

    public void deleteCourse(Long id){
        courseRepository.deleteById(id);
    }

}
