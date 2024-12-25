package org.jsp.college_directory_application.dao;

import org.jsp.college_directory_application.entity.Course;
import org.jsp.college_directory_application.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CourseDao {

    @Autowired
    private CourseRepository repository;

    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    public Optional<Course> getCourseById(int id) {
        return repository.findById(id);
    }

    public List<Course> findAllCourses() {
        return repository.findAll();
    }

    public void deleteCourseById(int id) {
        repository.deleteById(id);
    }

    public Course updateCourse(Course course) {
        return repository.save(course);
    }
}
