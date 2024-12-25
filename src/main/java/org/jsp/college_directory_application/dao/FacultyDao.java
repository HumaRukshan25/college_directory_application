package org.jsp.college_directory_application.dao;

import org.jsp.college_directory_application.entity.Faculty;

import org.jsp.college_directory_application.repository.FacultyRepository;
import org.jsp.college_directory_application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FacultyDao {

    @Autowired
    private FacultyRepository repository;
    
    @Autowired
    private UserRepository userRepository;

    // Save a Faculty
    public Faculty saveFaculty(Faculty faculty) {
        // Save the User entity if it's not already persisted
    	if (faculty.getUser() != null && faculty.getUser().getId() == 0) {
    	    userRepository.save(faculty.getUser());  // Save the User if not persisted yet
    	}

        // Then save the Faculty
        return repository.save(faculty);
    }

    // Get Faculty by ID
    public Optional<Faculty> getFacultyById(int id) {
        return repository.findById(id);
    }

    // Find All Faculties
    public List<Faculty> findAllFaculties() {
        return repository.findAll();
    }

    // Delete Faculty by ID
    public void deleteFacultyById(int id) {
        repository.deleteById(id);
    }

    // Update Faculty
    public Faculty updateFaculty(Faculty faculty) {
        return repository.save(faculty);
    }
}
