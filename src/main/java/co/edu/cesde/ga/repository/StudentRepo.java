package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.models.Student;

import java.util.List;

public interface StudentRepo {

    StudentRepo create(StudentRepo student);
    boolean delete(String userId);
    boolean update(Student studentupdate);
    boolean findById(Long userId);
    boolean findByDocumentNumber(Long documentNumber);
    List<Student> findAll();
    boolean existsById(String userId);

    void setStudentId(long s);

    String getDocumentNumber();

    boolean existsByuserId(String userId);


    //fila final//
}
