package org.jsp.college_directory_application.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private User user;

    private String photo;

    @ManyToOne
    private Department department;

    private String year; // FIRST YEAR, SECOND YEAR, THIRD YEAR, FINAL YEAR
}

