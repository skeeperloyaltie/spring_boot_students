package com.students.students.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
// more fore readability
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
//        Optional<Student> studentByID = studentRepository.getDetailByID(student.getStudentid());
//        if(studentByID.isPresent()){
//            throw new IllegalStateException("ID Taken");
//
//        }
        System.out.println(student);

    }
}
