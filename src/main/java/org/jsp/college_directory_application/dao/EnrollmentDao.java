//package org.jsp.college_directory_application.dao;
//
//import org.jsp.college_directory_application.entity.Enrollment;
//import org.jsp.college_directory_application.repository.EnrollmentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class EnrollmentDao {
//
//    @Autowired
//    private EnrollmentRepository repository;
//    
//    @PersistenceContext
//    private EntityManager entityManager;
//
//
//    // Save Enrollment
//    public Enrollment saveEnrollment(Enrollment enrollment) {
//        return repository.save(enrollment);
//    }
//
//    // Get Enrollment by ID
//    public Optional<Enrollment> getEnrollmentById(int id) {
//        return repository.findById(id);
//    }
//
//    // Find All Enrollments
//    public List<Enrollment> findAllEnrollments() {
//        return repository.findAll();
//    }
//
//    // Delete Enrollment by ID
//    public void deleteEnrollmentById(int id) {
//        repository.deleteById(id);
//    }
//
//    // Update Enrollment
//    public Enrollment updateEnrollment(Enrollment enrollment) {
//        return repository.save(enrollment);
//    }
//    
//    // Get Enrollment by Course ID and Student ID
//    public Optional<Enrollment> getEnrollmentByCourseAndStudent(int cid, int sid) {
//        Query<Enrollment> query = entityManager.createQuery(
//            "SELECT e FROM Enrollment e WHERE e.course.id = :courseId AND e.student.id = :studentId",
//            Enrollment.class
//        );
//        query.setParameter("courseId", cid);
//        query.setParameter("studentId", sid);
//        return query.getResultList().stream().findFirst();
//    }
//
//    // Get All Enrollments for a Specific Student
//    public List<Enrollment> getEnrollmentsByStudentId(int sid) {
//        Query<Enrollment> query = entityManager.createQuery(
//            "SELECT e FROM Enrollment e WHERE e.student.id = :studentId",
//            Enrollment.class
//        );
//        query.setParameter("studentId", sid);
//        return query.getResultList();
//    }
//
//    // Get All Enrollments for a Specific Course
//    public List<Enrollment> getEnrollmentsByCourseId(int cid) {
//       Query <Enrollment> query = entityManager.createQuery(
//            "SELECT e FROM Enrollment e WHERE e.course.id = :courseId",
//            Enrollment.class
//        );
//        query.setParameter("courseId", cid);
//        return query.getResultList();
//    }
//}

package org.jsp.college_directory_application.dao;

import org.jsp.college_directory_application.entity.Enrollment;
import org.jsp.college_directory_application.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;
import java.util.Optional;

@Repository
public class EnrollmentDao {

    @Autowired
    private EnrollmentRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public Enrollment saveEnrollment(Enrollment enrollment) {
        return repository.save(enrollment);
    }

    public Optional<Enrollment> getEnrollmentById(int id) {
        return repository.findById(id);
    }

    public List<Enrollment> findAllEnrollments() {
        return repository.findAll();
    }

    public void deleteEnrollmentById(int id) {
        repository.deleteById(id);
    }

    public Enrollment updateEnrollment(Enrollment enrollment) {
        return repository.save(enrollment);
    }

    public Optional<Enrollment> getEnrollmentByCourseAndStudent(int cid, int sid) {
        return repository.findByCourseIdAndStudentId(cid, sid);
    }

    public List<Enrollment> getEnrollmentsByStudentId(int sid) {
        return repository.findAllByStudentId(sid);
    }

    public List<Enrollment> getEnrollmentsByCourseId(int cid) {
        return repository.findAllByCourseId(cid);
    }
}



