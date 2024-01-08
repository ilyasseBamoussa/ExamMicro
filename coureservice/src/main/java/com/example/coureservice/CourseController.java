package com.example.coureservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    private List<Course> getCourses(){return courseService.getAllCourses();}

    @GetMapping("/{id}")
    private Course getCourseById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }

    @PostMapping
    private Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    @PostMapping("/{id}")
    private Course updateCourse(@PathVariable Long id,@RequestBody Course course){
        return courseService.updateCourse(id,course);
    }

    @DeleteMapping("/{id}")
    private void deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
    }


}
