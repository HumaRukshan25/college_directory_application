package org.jsp.college_directory_application.dao;

import org.jsp.college_directory_application.entity.Student;
import org.jsp.college_directory_application.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentDao {

    @Autowired
    private StudentRepository repository;

    // Save a Student
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // Get Student by ID
    public Optional<Student> getStudentById(int id) {
        return repository.findById(id);
    }

    // Get All Students
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    // Delete Student by ID
    public void deleteStudentById(int id) {
        repository.deleteById(id);
    }

    // Update Student
    public Student updateStudent(Student student) {
        return repository.save(student);
    }
}
