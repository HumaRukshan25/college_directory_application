package org.jsp.college_directory_application.controller;

import org.jsp.college_directory_application.entity.Course;
import org.jsp.college_directory_application.entity.Faculty;
import org.jsp.college_directory_application.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

  
    @PostMapping
    public ResponseEntity<Course> saveCourse(@RequestBody Course course) {
        Course savedCourse = courseService.saveCourse(course);
        return ResponseEntity.ok(savedCourse);
    }

   
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable int id) {
        Optional<Course> course = courseService.getCourseById(id);
        return course.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Course>> findAllCourses() {
        return ResponseEntity.ok(courseService.findAllCourses());
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourseById(@PathVariable int id) {
        courseService.deleteCourseById(id);
        return ResponseEntity.noContent().build();
    }

 
    @PatchMapping("/{courseId}/assign-faculty/{facultyId}")
    public ResponseEntity<Course> assignFacultyToCourse(@PathVariable int courseId, @PathVariable Faculty facultyId) {
        Course updatedCourse = courseService.assignFacultyToCourse(courseId, facultyId);
        return ResponseEntity.ok(updatedCourse);
    }
}
