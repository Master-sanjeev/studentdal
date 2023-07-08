package com.springtut.student.dal.studentdal.entities;

import javax.persistence.*;


/*
* Annotating the class with Entity as this a model class so marking it with JPA
* Annotating the class with Table as the table name is not Student in the db
* */

@Entity
@Table(name = "studenttab")
public class Student {

    /*
    * Annotating id with Id as this is the primary key
    * Annotating other variables with Column as to map them with the actual column name in table
    * if the name had been same then we didn't require this
    * */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "sname")
    private String name;
    @Column(name = "scourse")
    private String course;
    @Column(name = "sfee")
    private Double fees;
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", fees=" + fees +
                '}';
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }
}
