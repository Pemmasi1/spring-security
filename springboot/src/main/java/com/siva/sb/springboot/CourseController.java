package com.siva.sb.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class CourseController {


    @GetMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(new Course(1, "Learn Aws", "Siva"),
                new Course(2, "Learn Java", "Siva"));
    }
}
