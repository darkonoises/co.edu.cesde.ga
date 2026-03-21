package co.edu.cesde.ga.repository.impl;

import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.repository.StudentRepo;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentRepo {

    private List<Student> students;
    private long nextStudentId;

public StudentRepositoryInMemory() {
    this.students = new ArrayList();
    this.nextStudentId = 1L;
}

    @Override
    public StudentRepo create(StudentRepo student) {
        if (student == null){
            return null;
        }
    if (findByDocumentNumber(student.getDocumentNumber())){
        return null;
    }


    student.setStudentId(nextStudentId++);
    students.add((Student)  student);
    return student;
    }


    @Override
    public boolean delete(String userId) {
    if(userId == null) {
        return false;
    }

    return students = findById(String userId);
    if(students == null) {
        return false;
    }
    }

    @Override
    public boolean update(Student studentupdate) {
        return false;
    }

    @Override
    public boolean findById(Long userId) {
        return false;
    }

    @Override
    public boolean findByDocumentNumber(Long documentNumber) {
        return false;
    }

    @Override
    public boolean findById(String userId) {
        return false;
    }

    @Override
    public boolean findByDocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.isBlank()) {
            return false;
        }
        for (Student student : students) {
            if(student.getDocumentNumber().equals(documentNumber)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public ArrayList<Student> existsById(String userId) {
        return new ArrayList<>(students);
    }

    @Override
    public void setStudentId(long s) {

    }

    @Override
    public String getDocumentNumber() {
        return "";
    }


    //Linea Final//
}
