package com.students.students.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
             Student skeeper = new Student(
                            "skeeper",
                            "skeeper@gmail.com"
                    );
             Student loyal = new Student(
                            "loyal",
                            "loyal@mail.com"
                    );
             repository.saveAll(
                     List.of(skeeper, loyal)
             );
        };
    }
}
