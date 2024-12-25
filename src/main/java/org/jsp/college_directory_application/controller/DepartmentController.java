package org.jsp.college_directory_application.controller;

import org.jsp.college_directory_application.entity.Department;
import org.jsp.college_directory_application.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

  
    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
        Department savedDepartment = service.saveDepartment(department);
        return ResponseEntity.ok(savedDepartment);
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable int id) {
        Optional<Department> department = service.getDepartmentById(id);
        return department.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

 
    @GetMapping
    public ResponseEntity<List<Department>> findAllDepartments() {
        return ResponseEntity.ok(service.findAllDepartments());
    }

  
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartmentById(@PathVariable int id) {
        service.deleteDepartmentById(id);
        return ResponseEntity.noContent().build();
    }
}
