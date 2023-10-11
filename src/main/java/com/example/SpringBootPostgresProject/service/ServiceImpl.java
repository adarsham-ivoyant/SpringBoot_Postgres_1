package com.example.SpringBootPostgresProject.service;

import com.example.SpringBootPostgresProject.entity.Laptop;
import com.example.SpringBootPostgresProject.entity.Student;
import com.example.SpringBootPostgresProject.repository.LapRepo;
import com.example.SpringBootPostgresProject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.util.List;

@Service
public class ServiceImpl implements StuService {

    @Autowired
    private LapRepo lapRepo;

    @Override
    public Laptop addLap(Laptop laptop) {
        return lapRepo.save(laptop);
    }

    @Override
    public Laptop update(Laptop laptop) {
        return lapRepo.save(laptop);
    }

    @Override
    public Laptop getLapById(int id) {
        return lapRepo.findById(id).get();
    }

    @Override
    public String delLapById(int id) {
         lapRepo.deleteById(id);
         return null;
    }

    @Override
    public List<Laptop> getAllLap() {
        return lapRepo.findAll();
    }

    //Student entity

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStu() {
        return studentRepo.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStuById(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public String deleteStuById(int id) {
        studentRepo.deleteById(id);
        return null;
    }
}
