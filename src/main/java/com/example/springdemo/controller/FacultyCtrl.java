package com.example.springdemo.controller;

import com.example.springdemo.model.Faculty;
import com.example.springdemo.repo.FacultyRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculty")
public class FacultyCtrl {
    final private FacultyRepo repo;

    public FacultyCtrl(FacultyRepo repo) {
        this.repo = repo;
    }

    @PostMapping
    Faculty save(@RequestBody Faculty st) {
        return repo.save(st);
    }

    @GetMapping()
    List<Faculty> getAll() {
        return repo.findAll();
    }

}
