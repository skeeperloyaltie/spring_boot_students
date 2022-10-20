package com.students.students.student;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long studentid;
    private String studentname;
    private String studentemail;
    public Student() {
    }
    public Student(Long studentid, String studentname, String studentemail) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentemail = studentemail;
    }
    public Student(String studentname, String studentemail) {
        this.studentname = studentname;
        this.studentemail = studentemail;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", studentemail='" + studentemail + '\'' +
                '}';
    }
}
