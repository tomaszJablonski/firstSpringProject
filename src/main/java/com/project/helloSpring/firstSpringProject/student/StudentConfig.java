package com.project.helloSpring.firstSpringProject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//bean

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student andżelika = new Student(
                    1L,
                    "Andżelika",
                    "angelika@gmail.com",
                    LocalDate.of(1990, Month.DECEMBER, 5)

            );

            Student alexa = new Student(
                    2L,
                    "alexa",
                    "alexa@gmail.com",
                    LocalDate.of(1995, Month.APRIL, 1)

            );

            repository.saveAll(List.of(andżelika, alexa)
            );
        };
    }

}
