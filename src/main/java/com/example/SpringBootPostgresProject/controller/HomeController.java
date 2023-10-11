package com.example.SpringBootPostgresProject.controller;

import com.example.SpringBootPostgresProject.entity.Laptop;
import com.example.SpringBootPostgresProject.entity.Student;
import com.example.SpringBootPostgresProject.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class HomeController {
    @Autowired
    private StuService stuService;

    @PostMapping("AddLap")
    public String addLap(@RequestBody Laptop laptop){
        stuService.addLap(laptop);
        return "LapTop Added Successfully";
    }

    @PutMapping("updateLap")
    public String updateLap(@RequestBody Laptop laptop){
        stuService.update(laptop);
        return "Laptop updated Successfully";
    }

    @GetMapping("GetLapById/{id}")
    public Laptop getLapById(@PathVariable ("id") int id){
        return stuService.getLapById(id);
    }

    @DeleteMapping("DeleteLapById/{id}")
    public String deleteLapById(@PathVariable ("id") int id){
        stuService.delLapById(id);
        return "deleted Successfully";
    }

    @GetMapping("GetAllLap")
    public List<Laptop> getALlLap(){
        return stuService.getAllLap();
    }

    //Student COntroller

    @PostMapping("AddStu")
    public Student addStu(@RequestBody Student student){
        return stuService.addStudent(student);
    }

    @GetMapping("GetAllStu")
    public List<Student> getAllStu(){
        return stuService.getAllStu();
    }

    @PutMapping("UpdateStudent")
    public String updateStudent(@RequestBody Student student){
        stuService.updateStudent(student);
        return "updated successfully";
    }

    @GetMapping("GetStuById/{id}")
    public Student getStuById(@PathVariable ("id") int id){
        return stuService.getStuById(id);
    }

    @DeleteMapping("DeleteById/{id}")
    public String deleteById(@PathVariable("id") int id){
        stuService.deleteStuById(id);
        return "deleted Successfully";
    }

}
