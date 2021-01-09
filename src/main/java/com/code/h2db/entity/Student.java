package com.code.h2db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student", schema = "testdb")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "country")
    private String country;

}
