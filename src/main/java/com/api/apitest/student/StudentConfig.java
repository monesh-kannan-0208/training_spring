package com.api.apitest.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student monesh = new Student(
                    "monesh",
                    "moneshkannan02@gmail.com",
                    LocalDate.of(2000, AUGUST, 02)

            );
            Student rio = new Student(
                    "Rio",
                    "Rio@gmail.com",
                    LocalDate.of(2004, AUGUST, 02)

            );
            repository.saveAll(
                    List.of(monesh,rio)
            );
        };
    }
}
