package org.jsp.college_directory_application.controller;

import org.jsp.college_directory_application.entity.Faculty;
import org.jsp.college_directory_application.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

  
    @PostMapping
    public ResponseEntity<Faculty> saveFaculty(@RequestBody Faculty faculty) {
        Faculty savedFaculty = facultyService.saveFaculty(faculty);
        return ResponseEntity.ok(savedFaculty);
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Faculty> getFacultyById(@PathVariable int id) {
        Optional<Faculty> faculty = facultyService.getFacultyById(id);
        return faculty.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

   
    @GetMapping
    public ResponseEntity<List<Faculty>> findAllFaculties() {
        return ResponseEntity.ok(facultyService.findAllFaculties());
    }

   
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFacultyById(@PathVariable int id) {
        facultyService.deleteFacultyById(id);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/{id}")
    public ResponseEntity<Faculty> updateFaculty(@PathVariable int id, @RequestBody Faculty faculty) {
        faculty.setId(id);  // Ensure the ID is set for the update
        Faculty updatedFaculty = facultyService.updateFaculty(faculty);
        return ResponseEntity.ok(updatedFaculty);
    }
}
