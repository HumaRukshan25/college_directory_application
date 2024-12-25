package org.jsp.college_directory_application.controller;

import org.jsp.college_directory_application.entity.Enrollment;
import org.jsp.college_directory_application.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService service;

    @PostMapping
    public ResponseEntity<Enrollment> saveEnrollment(@RequestBody Enrollment enrollment) {
        Enrollment savedEnrollment = service.saveEnrollment(enrollment);
        return ResponseEntity.ok(savedEnrollment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enrollment> getEnrollmentById(@PathVariable int id) {
        Optional<Enrollment> enrollment = service.getEnrollmentById(id);
        return enrollment.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Enrollment>> findAllEnrollments() {
        List<Enrollment> enrollments = service.findAllEnrollments();
        return ResponseEntity.ok(enrollments);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnrollmentById(@PathVariable int id) {
        service.deleteEnrollmentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Enrollment> updateEnrollment(@PathVariable int id, @RequestBody Enrollment enrollment) {
        enrollment.setId(id);
        Enrollment updatedEnrollment = service.updateEnrollment(enrollment);
        return ResponseEntity.ok(updatedEnrollment);
    }

    @GetMapping("/{cid}/{sid}")
    public ResponseEntity<Enrollment> getEnrollmentByCourseAndStudent(@PathVariable int cid, @PathVariable int sid) {
        Optional<Enrollment> enrollment = service.getEnrollmentByCourseAndStudent(cid, sid);
        return enrollment.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/student/{sid}")
    public ResponseEntity<List<Enrollment>> getEnrollmentsByStudentId(@PathVariable int sid) {
        List<Enrollment> enrollments = service.getEnrollmentsByStudentId(sid);
        return ResponseEntity.ok(enrollments);
    }

    @GetMapping("/course/{cid}")
    public ResponseEntity<List<Enrollment>> getEnrollmentsByCourseId(@PathVariable int cid) {
        List<Enrollment> enrollments = service.getEnrollmentsByCourseId(cid);
        return ResponseEntity.ok(enrollments);
    }
}

