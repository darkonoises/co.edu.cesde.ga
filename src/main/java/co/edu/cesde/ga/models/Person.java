package co.edu.cesde.ga.models;

public class Person {

    Long user_id;
    String code;
    String document_number;
    String first_name;
    String last_name;
    Boolean status;

    public Person() {
    }

    public Person(Long user_id, String code, String document_number, String first_name, String last_name, Boolean status) {
        this.user_id = user_id;
        this.code = code;
        this.document_number = document_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.status = status;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDocument_number() {
        return document_number;
    }

    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}


