package org.jsp.college_directory_application.service;

import org.jsp.college_directory_application.dao.FacultyDao;
import org.jsp.college_directory_application.entity.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyService {

    @Autowired
    private FacultyDao facultyDao;

    // Save a Faculty
    public Faculty saveFaculty(Faculty faculty) {
    	
        return facultyDao.saveFaculty(faculty);
    }

    // Get Faculty by ID
    public Optional<Faculty> getFacultyById(int id) {
        return facultyDao.getFacultyById(id);
    }

    // Find All Faculties
    public List<Faculty> findAllFaculties() {
        return facultyDao.findAllFaculties();
    }

    // Delete Faculty by ID
    public void deleteFacultyById(int id) {
        facultyDao.deleteFacultyById(id);
    }

    // Update Faculty
    public Faculty updateFaculty(Faculty faculty) {
        return facultyDao.updateFaculty(faculty);
    }
}
