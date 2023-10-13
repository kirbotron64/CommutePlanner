package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service /*This tells Autowired this is the spring bean to use*/
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L, "Mariam", "her@email.com", LocalDate.of(2000, Month.JANUARY, 5), 21)
        );
    }
}
