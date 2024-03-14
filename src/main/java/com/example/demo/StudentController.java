package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>();

    public StudentController() {
        // Inicializar la lista con datos

        students.add(new Student(1, "Sebastian", 31));
        students.add(new Student(2, "Sebastian Miranda", 32));
        students.add(new Student(3, "Sebastian Peña", 33));
        students.add(new Student(4, "Sebastian Sandoval", 29));
        students.add(new Student(5, "Daniel S", 33));

    }
    
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
    
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

}
