package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void addStudent(Student student);

    List<Student> getStudent();

    void deleteStudentById(Integer id);

    Optional<Student> findById(Integer id);

    void updateStudent(Student student);

    List<Student> findByName(String name);

    List<Student> findByDob(String dob);

    List<Student> findByAddress(String address);

    List<Student> findByEmail(String email);
}
