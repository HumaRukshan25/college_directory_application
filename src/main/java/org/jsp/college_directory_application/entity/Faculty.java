package org.jsp.college_directory_application.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @OneToOne
//    @MapsId
//    private User user;
    @OneToOne(cascade = CascadeType.MERGE)  // Use MERGE if the User is already persisted
    @MapsId
    private User user;


    private String photo;

    @ManyToOne
    private Department department;

    private LocalTime officeHours;
}
