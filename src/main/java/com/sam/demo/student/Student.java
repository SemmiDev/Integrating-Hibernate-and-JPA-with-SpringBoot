package com.sam.demo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String nisn;

    public Student(String name, String nisn) {
        super();
        this.name = name;
        this.nisn = nisn;
    }
}
