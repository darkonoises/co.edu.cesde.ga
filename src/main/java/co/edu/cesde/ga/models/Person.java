package models;

import co.edu.cesde.app.Main;

public class persons extends Main{

    protected String firstname;
    protected String lastname;
    protected String user_id;
    protected Boolean status;

    protected persons(){}

    public persons(String firstname, String lastname, String user_id, boolean status) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.user_id = user_id;
        this.status = status;
    }

    public String getfirstname() {
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }

    public String getuser_id(){
        return user_id;
    }
    public boolean getstatus(){
        return status;
    }







    public void setfirstname(String firstname) {
        this.firstname = firstname;}

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }
    public void setuser_id(String user_id) {
        this.user_id = user_id;
    }
    public void setstatus(boolean status) {
        this.status = status;
    }

}



public abstract String getRole();

    }


