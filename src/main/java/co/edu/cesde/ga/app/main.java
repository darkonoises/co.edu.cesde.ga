package co.edu.cesde.app;

import models.persons;
import models.students;
import models.teachers

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello ma world yeah");

        persons persona1 = new persons();
        persons persona2 = new persons();
        persons persona3 = new persons();
        persons persona4 = new persons();

        persona1.setfirstname("Nick");
        persona1.setlastname("Smith");
        persona1.setuser_id("111");
        persona1.setstatus(true);
        System.out.println(persona1.getfirstname());
        System.out.println(persona1.getlastname());
        System.out.println(persona1.getuser_id());
        System.out.println(persona1.getstatus());

        persona2.setfirstname("John");
        persona2.setlastname("Wick");
        persona2.setuser_id("222");
        persona2.setstatus(true);
        System.out.println(persona2.getfirstname());
        System.out.println(persona2.getlastname());
        System.out.println(persona2.getuser_id());
        System.out.println(persona2.getstatus());

        students stud1 = new students();


    }
}