package org.jsp.college_directory_application.service;

import org.jsp.college_directory_application.dao.AdministratorDao;
import org.jsp.college_directory_application.entity.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorDao administratorDao;

    // Save Administrator
    public Administrator saveAdministrator(Administrator administrator) {
        return administratorDao.saveAdministrator(administrator);
    }

    // Get Administrator by ID
    public Optional<Administrator> getAdministratorById(int id) {
        return administratorDao.getAdministratorById(id);
    }

    // Find All Administrators
    public List<Administrator> findAllAdministrators() {
        return administratorDao.findAllAdministrators();
    }

    // Delete Administrator by ID
    public void deleteAdministratorById(int id) {
        administratorDao.deleteAdministratorById(id);
    }

    // Update Administrator
    public Administrator updateAdministrator(Administrator administrator) {
        return administratorDao.updateAdministrator(administrator);
    }
}
