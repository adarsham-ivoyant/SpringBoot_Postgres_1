package com.example.SpringBootPostgresProject.repository;

import com.example.SpringBootPostgresProject.entity.Laptop;
import com.example.SpringBootPostgresProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LapRepo extends JpaRepository<Laptop,Integer> {
}
