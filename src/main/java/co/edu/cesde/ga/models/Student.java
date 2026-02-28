package co.edu.cesde.ga.models;

public class Student extends Person {

    private String birthDate;

    public Student(long l, String number, String id, String nombre, String apellido, boolean b){
        super();
    }

    public Student(Long user_id, String code, String document_number, String first_name, String last_name, Boolean status, String birthDate) {
        super(user_id, code, document_number, first_name, last_name, status);
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        return "Student =" + super.toString();
    }





    //ultima fila
}
