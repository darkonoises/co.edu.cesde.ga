package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.models.Student;
import java.util.List;
import co.edu.cesde.ga.repository.StudentRepo;

public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepository;
    public StudentServiceImpl(StudentRepo SR {
        this.studentRepository = SR;
    }

    @Override
        public Student create (Student student){
            if (isInvalidStudent(student) || studentRepository.existsByuserId(student.getUserId())) ;
            return null;
        }

    @Override
    public boolean update(Student studentUpdate) {
        return false;
    }

    @Override
    public boolean delete(Long studentId) {
        return false;
    }

    @Override
    public Student findById(Long studentId) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    private boolean isInvalidStudent(Student student){
        return student == null
                || !isNotBlank(student.getUserId())
                || !isNotBlank(student.getFirstName())
                || !isNotBlank(student.getLastName())
                || !isNotBlank(student.getStatus())
                || !isNotBlank(student.getBirthday());

    }

    private boolean isNotBlank(String value){
        return value != null && !value.isBlank();
    }


}
