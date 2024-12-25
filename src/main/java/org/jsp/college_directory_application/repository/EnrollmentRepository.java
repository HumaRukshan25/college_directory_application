package org.jsp.college_directory_application.repository;

import org.jsp.college_directory_application.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

    @Query("SELECT e FROM Enrollment e WHERE e.course.id = :courseId AND e.student.id = :studentId")
    Optional<Enrollment> findByCourseIdAndStudentId(@Param("courseId") int courseId, @Param("studentId") int studentId);

    @Query("SELECT e FROM Enrollment e WHERE e.student.id = :studentId")
    List<Enrollment> findAllByStudentId(@Param("studentId") int studentId);

    @Query("SELECT e FROM Enrollment e WHERE e.course.id = :courseId")
    List<Enrollment> findAllByCourseId(@Param("courseId") int courseId);
}
