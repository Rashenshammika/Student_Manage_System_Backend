package edu.icet.repository;

import edu.icet.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByName(String name);

    List<Student> findByDob(String dob);

    List<Student> findByAddress(String address);

    List<Student> findByEmail(String email);
}
