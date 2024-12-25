//package org.jsp.college_directory_application.service;
//
//
//import org.jsp.college_directory_application.entity.Enrollment;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EnrollmentService {
//
//    @Autowired
//    private EnrollmentDao dao;
//
//    // Save Enrollment
//    public Enrollment saveEnrollment(Enrollment enrollment) {
//        return dao.saveEnrollment(enrollment);
//    }
//
//    // Get Enrollment by ID
//    public Optional<Enrollment> getEnrollmentById(int id) {
//        return dao.getEnrollmentById(id);
//    }
//
//    // Find All Enrollments
//    public List<Enrollment> findAllEnrollments() {
//        return dao.findAllEnrollments();
//    }
//
//    // Delete Enrollment by ID
//    public void deleteEnrollmentById(int id) {
//        dao.deleteEnrollmentById(id);
//    }
//
//    // Update Enrollment
//    public Enrollment updateEnrollment(Enrollment enrollment) {
//        return dao.updateEnrollment(enrollment);
//    }
//
//    // Get Enrollment by Course ID and Student ID
//    public Optional<Enrollment> getEnrollmentByCourseAndStudent(int cid, int sid) {
//        return dao.getEnrollmentByCourseAndStudent(cid, sid);
//    }
//
//    // Get All Enrollments for a Specific Student
//    public List<Enrollment> getEnrollmentsByStudentId(int sid) {
//        return dao.getEnrollmentsByStudentId(sid);
//    }
//
//    // Get All Enrollments for a Specific Course
//    public List<Enrollment> getEnrollmentsByCourseId(int cid) {
//        return dao.getEnrollmentsByCourseId(cid);
//    }
//}


package org.jsp.college_directory_application.service;

import org.jsp.college_directory_application.entity.Enrollment;
import org.jsp.college_directory_application.dao.EnrollmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentDao dao;

    public Enrollment saveEnrollment(Enrollment enrollment) {
        return dao.saveEnrollment(enrollment);
    }

    public Optional<Enrollment> getEnrollmentById(int id) {
        return dao.getEnrollmentById(id);
    }

    public List<Enrollment> findAllEnrollments() {
        return dao.findAllEnrollments();
    }

    public void deleteEnrollmentById(int id) {
        dao.deleteEnrollmentById(id);
    }

    public Enrollment updateEnrollment(Enrollment enrollment) {
        return dao.updateEnrollment(enrollment);
    }

    public Optional<Enrollment> getEnrollmentByCourseAndStudent(int cid, int sid) {
        return dao.getEnrollmentByCourseAndStudent(cid, sid);
    }

    public List<Enrollment> getEnrollmentsByStudentId(int sid) {
        return dao.getEnrollmentsByStudentId(sid);
    }

    public List<Enrollment> getEnrollmentsByCourseId(int cid) {
        return dao.getEnrollmentsByCourseId(cid);
    }
}
