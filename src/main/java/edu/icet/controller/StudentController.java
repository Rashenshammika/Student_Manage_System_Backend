package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class StudentController {
    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @GetMapping
    public List<Student> getStudent(){
        return service.getStudent();
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id){
      service.deleteStudentById(id);
    }

    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student){
        service.updateStudent(student);
    }

    @GetMapping("/find-by-id/{id}")
    public Optional<Student> searchById(@PathVariable Integer id){
        return service.findById(id);
    }

    @GetMapping("/find-by-name/{name}")
    public List<Student> findByName(@PathVariable String name){
        return service.findByName(name);
    }

    @GetMapping("/find-by-dob/{dob}")
    public List<Student> findByDob(@PathVariable String dob){
        return service.findByDob(dob);
    }

    @GetMapping("/find-by-address/{address}")
    public List<Student> findByAddress(@PathVariable String address){
        return service.findByAddress(address);
    }

    @GetMapping("/find-by-email/{email}")
    public List<Student> findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }
}

