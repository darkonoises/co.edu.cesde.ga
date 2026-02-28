package co.edu.cesde.ga.app;

//Impotar el constructor
import co.edu.cesde.ga.models.Person;
import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.models.Teacher;

public class main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        //Crea el constructor
        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        //Le da un valor a la variable
        person.setFirst_name("John");
        person.getFirst_name();
        person2.setFirst_name("Juan");
        person2.getFirst_name();
        person3.setFirst_name("Erica");
        person3.getFirst_name();

        Student student1 = new Student();
        student1.setFirst_name("Carlos");
        student1.setBirthDate("2001-01-01");
        System.out.println(student1.toString());

        Teacher teacher1 = new Teacher();
        teacher1.setFirst_name("Ana");
        System.out.println(teacher1.toString());

        Student student2 = new Student(4L,"444","1036953097","Laura","Mejia", true);

        Teacher teacher2 = new Teacher(5L,"555","1036953098","Sara", "Lopez", true);




    }
}