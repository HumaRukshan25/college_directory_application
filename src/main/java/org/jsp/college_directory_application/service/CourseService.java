package org.jsp.college_directory_application.service;

import org.jsp.college_directory_application.dao.CourseDao;
import org.jsp.college_directory_application.entity.Course;
import org.jsp.college_directory_application.entity.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    public Course saveCourse(Course course) {
        return courseDao.saveCourse(course);
    }

    public Optional<Course> getCourseById(int id) {
        return courseDao.getCourseById(id);
    }

    public List<Course> findAllCourses() {
        return courseDao.findAllCourses();
    }

    public void deleteCourseById(int id) {
        courseDao.deleteCourseById(id);
    }

    public Course assignFacultyToCourse(int courseId, Faculty facultyId) {
        Optional<Course> optionalCourse = courseDao.getCourseById(courseId);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            course.setFaculty(facultyId);
            return courseDao.updateCourse(course);
        }
        throw new RuntimeException("Course not found with id: " + courseId);
    }
}
