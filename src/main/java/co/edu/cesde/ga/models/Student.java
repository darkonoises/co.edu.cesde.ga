package co.edu.cesde.ga.models;

public class Student extends Person {

    // Constructor vacío
    public Student() {
        super();
    }

    // Constructor con parámetros que hereda de Person
    public Student(String firstName, String lastName, String userId, boolean status, String birthday) {
        super(firstName, lastName, userId, status, birthday);
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getUserId() { return userId; }
    public boolean isStatus() { return status; }
    public String getBirthday() { return birthday; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setStatus(boolean status) { this.status = status; }
    public void setBirthday(String birthday) { this.birthday = birthday; }



    @Override
    public String getRole() {
        return "Student";
    }

    // El Override de toString agregando el birthday
    @Override
    public String toString() {
        return "Role: " + getRole() +
                " | Name: " + this.firstName + " " + this.lastName +
                " | ID: " + this.userId +
                " | Birthday: " + this.birthday +
                " | Status: " + (this.status ? "Active" : "Inactive");
    }

    public Object getDocumentNumber() {
    }
}