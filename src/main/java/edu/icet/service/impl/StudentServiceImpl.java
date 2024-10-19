package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> getStudent() {
        return repository.findAll();
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Student> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void updateStudent(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Student> findByDob(String dob) {
        return repository.findByDob(dob);
    }

    @Override
    public List<Student> findByAddress(String address) {
        return repository.findByAddress(address);
    }

    @Override
    public List<Student> findByEmail(String email) {
        return repository.findByEmail(email);
    }
}

