package models;

public class Teacher extends models.Person {

    // Constructor vacío
    public Teacher() {
        super();
    }

    // Constructor con parámetros que invoca al constructor de Person
    public Teacher(String firstName, String lastName, String userId, boolean status, String birthday) {
        super(firstName, lastName, userId, status, birthday);
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    // Override de toString incluyendo birthday para Teacher
    @Override
    public String toString() {
        return "Role: " + getRole() +
                " | Name: " + this.firstName + " " + this.lastName +
                " | ID: " + this.userId +
                " | Birthday: " + this.birthday +
                " | Status: " + (this.status ? "Active" : "Inactive");
    }
}