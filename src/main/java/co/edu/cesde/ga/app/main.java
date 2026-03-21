package co.edu.cesde.ga.app;

// Importamos las clases del paquete models
import models.Person;
import models.Student;
import models.Teacher;

public class main {
    public static void main(String[] args) {

        System.out.println("Hello ma world yeah");

        // Creación de objetos tipo Person
        Person persona1 = new Person() {
            @Override
            public String getRole() {
                return "";
            }
        };
        Person persona2 = new Person() {
            @Override
            public String getRole() {
                return "";
            }
        };

        // Configuración de persona1
        persona1.setFirstName("Nick");
        persona1.setLastName("Smith");
        persona1.setUserId("111");
        persona1.setStatus(true);

        System.out.println("Nombre: " + persona1.getFirstName());
        System.out.println("Apellido: " + persona1.getLastName());
        System.out.println("ID: " + persona1.getUserId());
        System.out.println("Estado: " + persona1.isStatus());

        System.out.println("--------------------");

        // Configuración de persona2
        persona2.setFirstName("John");
        persona2.setLastName("Wick");
        persona2.setUserId("222");
        persona2.setStatus(true);

        System.out.println("Nombre: " + persona2.getFirstName());
        System.out.println("Apellido: " + persona2.getLastName());

        System.out.println("--------------------");

        // Creación de estudiante (aquí usaremos el toString después)
        Student stud1 = new Student();
        stud1.setFirstName("Milan");
        stud1.setLastName("Doe");
        stud1.setBirthday("2024-05-20");

        System.out.println(stud1.toString());
    }
}