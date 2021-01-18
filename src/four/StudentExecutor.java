package four;

import java.util.List;
import java.util.function.Consumer;

/**
 * <li>ZAŠTO NISAM KREIRAO STUDENT OBJEKAT NIGJDE??</li>
 * PA KAKO MOGU DA ZAKLJUČIM KLASU "STUDENT" KORISTIM KAO TIP PODAKTA KOJI PROSLIJEDJUJEM KLASI >>LIST<<
 */

public class StudentExecutor {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        List<Student> studentList = studentDAO.readStudenatList();

        System.out.println("SPISAK SVIH STUDENATA NA LISTI na enhanced način:");
        printeEnhancedStudenti(studentList);
        System.out.println("ISPIS PUNOLJETNIH OSOBA NA LISTI:");
        printAdoults(studentList);
        System.out.println("FUNKCIONALNI STIL SA ČEKEROM I KONZUMEROM:");
        processStudent(studentList, student -> student.getAge() >= 18, student -> System.out.println("Punoljetni sa liste: " + System.lineSeparator() + student));


    }

    static void printeEnhancedStudenti(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    static void printAdoults(List<Student> students) {
        for (Student s : students) {
            if (s.getAge() >= 18) {
                System.out.println(s);
            }
        }
    }

    static void processStudent(List<Student> studentsList, StudentChecker studentChecker, Consumer<Student> studentConsumer) {
        for (Student student : studentsList) {
            if (studentChecker.checkStudent(student)) {
                studentConsumer.accept(student);
            }

        }
    }
}
