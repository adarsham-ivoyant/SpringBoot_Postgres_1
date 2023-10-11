package com.example.SpringBootPostgresProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student_info")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stuId;
    private String stuName;
    @OneToOne
    @JoinColumn(name="lapId")
    private Laptop laptop;
}
