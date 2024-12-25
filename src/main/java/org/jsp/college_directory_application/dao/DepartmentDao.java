
package org.jsp.college_directory_application.dao;

import org.jsp.college_directory_application.entity.Department;
import org.jsp.college_directory_application.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DepartmentDao {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    public Optional<Department> getDepartmentById(int id) {
        return repository.findById(id);
    }

    public List<Department> findAllDepartments() {
        return repository.findAll();
    }

    public void deleteDepartmentById(int id) {
        repository.deleteById(id);
    }
}
