package org.jsp.college_directory_application.controller;

import org.jsp.college_directory_application.entity.Administrator;
import org.jsp.college_directory_application.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/administrators")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    // Save
    @PostMapping
    public ResponseEntity<Administrator> saveAdministrator(@RequestBody Administrator administrator) {
        Administrator savedAdministrator = administratorService.saveAdministrator(administrator);
        return ResponseEntity.ok(savedAdministrator);
    }

    // Get 
    @GetMapping("/{id}")
    public ResponseEntity<Administrator> getAdministratorById(@PathVariable int id) {
        Optional<Administrator> administrator = administratorService.getAdministratorById(id);
        return administrator.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Find All A
    @GetMapping
    public ResponseEntity<List<Administrator>> findAllAdministrators() {
        return ResponseEntity.ok(administratorService.findAllAdministrators());
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdministratorById(@PathVariable int id) {
        administratorService.deleteAdministratorById(id);
        return ResponseEntity.noContent().build();
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Administrator> updateAdministrator(@PathVariable int id, @RequestBody Administrator administrator) {
        administrator.setId(id);
        Administrator updatedAdministrator = administratorService.updateAdministrator(administrator);
        return ResponseEntity.ok(updatedAdministrator);
    }
}

