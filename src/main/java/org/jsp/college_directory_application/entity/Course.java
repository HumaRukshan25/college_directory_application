package org.jsp.college_directory_application.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;

    @ManyToOne
    private Department department;

    @ManyToOne
    private Faculty faculty;

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
