package co.edu.cesde.ga.models;

public abstract class Person {
    // Atributos protegidos para que las clases hijas puedan acceder a ellos
    public String documentNumber;
    public String firstName;
    public String lastName;
    public String userId;
    public boolean status;
    public String birthday; // Agregado para el requerimiento del toString

    // Constructor vacío
    public Person() {}

    // Constructor con parámetros
    public Person(String firstName, String lastName, String userId, boolean status, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.status = status;
        this.birthday = birthday;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getUserId() { return userId; }
    public boolean isStatus() { return status; }
    public String getBirthday() { return birthday; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setStatus(boolean status) { this.status = status; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    // Método abstracto que Student y Teacher deberán implementar
    public abstract String getRole();
}


