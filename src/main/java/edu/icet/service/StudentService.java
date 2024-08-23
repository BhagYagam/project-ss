package edu.icet.service;

import edu.icet.model.Student;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface StudentService {
    List<Student> getStudent();

    void addStudent(Student student);

    void deleteStudentById(Integer id);

    List<Student> findByName(String name);
}
