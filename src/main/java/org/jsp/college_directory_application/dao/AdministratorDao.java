package org.jsp.college_directory_application.dao;

import org.jsp.college_directory_application.entity.Administrator;
import org.jsp.college_directory_application.repository.AdministratorRepository;
import org.jsp.college_directory_application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministratorDao {

    @Autowired
    private AdministratorRepository administratorRepository;

    @Autowired
    private UserRepository userRepository;

    // Save Administrator
    public Administrator saveAdministrator(Administrator administrator) {
        if (administrator.getUser() != null && administrator.getUser().getId() == 0) {
            userRepository.save(administrator.getUser());
        }
        return administratorRepository.save(administrator);
    }

    // Get Administrator by ID
    public Optional<Administrator> getAdministratorById(int id) {
        return administratorRepository.findById(id);
    }

    // Find All Administrators
    public List<Administrator> findAllAdministrators() {
        return administratorRepository.findAll();
    }

    // Delete Administrator by ID
    public void deleteAdministratorById(int id) {
        administratorRepository.deleteById(id);
    }

    // Update Administrator
    public Administrator updateAdministrator(Administrator administrator) {
        return administratorRepository.save(administrator);
    }
}
