package co.edu.cesde.ga.models;

                    // Usar el extends me manda toda la informacion de dicha pestaña//
public class Teacher extends Person{

    private String birthDate;

    public Teacher(long l, String number, String id, String sara, String lopez, boolean b){
        super();
    }

    public Teacher(Long user_id, String code, String document_number, String first_name, String last_name, Boolean status, String birthDate) {
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
                            return "Teacher =" + super.toString();
                        }








                        // Ultima linea
}
