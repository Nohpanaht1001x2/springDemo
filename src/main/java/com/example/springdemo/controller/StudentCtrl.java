package com.example.springdemo.controller;

import com.example.springdemo.model.Student;
import com.example.springdemo.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentCtrl {
    private final StudentRepo studentRepo;

    public StudentCtrl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    //    @PostMapping()
//    Student save(Student st){
//        return studentRepo.save(st);
//    }
    @PostMapping()
    Student save(@RequestBody Student st) {
        return studentRepo.save(st);
    }

    @GetMapping()
    List<Student> getAll() {
        return studentRepo.findAll();
    }
    @GetMapping("{id}")
    Optional<Student> get(@PathVariable Integer id) {
        return studentRepo.findById(id);
    }
    @DeleteMapping("{id}")
    void delete(@PathVariable Integer id)
    {
        studentRepo.deleteById(id);
    }
}
