package co.edu.cesde.ga.repository;

import java.util.List;
import co.edu.cesde.ga.models.*;

public interface TeacherRepo {

    TeacherRepo create(TeacherRepo teacher);
    boolean delete(String userId);
    boolean update(Teacher studentupdate);
    boolean findById(String userId);
    boolean findByDocumentNumber(String documentNumber);
    List<Teacher> findAll();
    boolean existsById(String userId);







}
