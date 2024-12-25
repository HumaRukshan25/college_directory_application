package org.jsp.college_directory_application.service;

import org.jsp.college_directory_application.dao.DepartmentDao;
import org.jsp.college_directory_application.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    public Department saveDepartment(Department department) {
        return departmentDao.saveDepartment(department);
    }

    public Optional<Department> getDepartmentById(int id) {
        return departmentDao.getDepartmentById(id);
    }

    public List<Department> findAllDepartments() {
        return departmentDao.findAllDepartments();
    }

    public void deleteDepartmentById(int id) {
        departmentDao.deleteDepartmentById(id);
    }
}
