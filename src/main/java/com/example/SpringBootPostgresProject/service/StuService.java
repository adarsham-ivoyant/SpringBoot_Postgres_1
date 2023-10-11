package com.example.SpringBootPostgresProject.service;

import com.example.SpringBootPostgresProject.entity.Laptop;
import com.example.SpringBootPostgresProject.entity.Student;

import java.util.List;

public interface StuService {

    public Laptop addLap(Laptop laptop);

    public Laptop update(Laptop laptop);

    public Laptop getLapById(int id);

    public String delLapById(int id);

    public List<Laptop> getAllLap();

    public Student addStudent(Student student);

    public List<Student> getAllStu();

    public Student updateStudent(Student student);

    public Student getStuById(int id);

    public String deleteStuById(int id);


}
