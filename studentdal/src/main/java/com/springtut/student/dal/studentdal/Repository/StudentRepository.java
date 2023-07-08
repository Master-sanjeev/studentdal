package com.springtut.student.dal.studentdal.Repository;

import com.springtut.student.dal.studentdal.entities.Student;
import org.springframework.data.repository.CrudRepository;

/*
* Repository extends crud repository for doing crud operations
* */
public interface StudentRepository extends CrudRepository<Student, Integer> {
    /*
    * CrudRepository takes two args
    * 1) Entity type / Model => Tuple of the table;
    * 2) Primary key type of the table
    * */
}
