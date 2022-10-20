package com.students.students.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
//    @Query("Select s from student s where s.studentid = ?1")
//    Optional<Student> getDetailByID(Long studentid);
}
