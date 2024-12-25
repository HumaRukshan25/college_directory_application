package org.jsp.college_directory_application.service;

import org.jsp.college_directory_application.dao.StudentDao;
import org.jsp.college_directory_application.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    // Save Student
    public Student saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    // Get Student by ID
    public Optional<Student> getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    // Get All Students
    public List<Student> findAllStudents() {
        return studentDao.findAllStudents();
    }

    // Delete Student by ID
    public void deleteStudentById(int id) {
        studentDao.deleteStudentById(id);
    }

    // Update Student
    public Student updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }
}
