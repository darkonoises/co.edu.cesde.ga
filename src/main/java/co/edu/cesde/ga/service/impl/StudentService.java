package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.models.Student;

import java.util.List;

public interface StudentService {


    Student create (Student student);
    boolean update (Student studentUpdate);
    boolean delete (Long studentId);
    Student findById (Long studentId);
    List<Student> findAll();

}
