package four;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    List<Student> studentList = new ArrayList<>();

   public List<Student> readStudenatList(){
       studentList.add(new Student("Borislav", "Domazet", Gender.MALE, LocalDate.of(1988, 5, 11)));
       studentList.add(new Student("Almir", "Brkić", Gender.MALE, LocalDate.of(1991, 8, 18)));
       studentList.add(new Student("Elma", "Đido", Gender.FEMALE, LocalDate.of(2000, 1, 1)));
       studentList.add(new Student("Vejsil", "Sarajlić", Gender.MALE, LocalDate.of(1991, 7, 8)));
       studentList.add(new Student("Melisa", "Herović", Gender.FEMALE, LocalDate.of(1988, 5, 11)));
       studentList.add(new Student("Nevena", "Pandurević", Gender.FEMALE, LocalDate.of(2006, 5, 11)));
       studentList.add(new Student("Harun", "Bucalović", Gender.MALE, LocalDate.of(2003, 3, 1)));
       studentList.add(new Student("Damir", "Fejzić", Gender.MALE, LocalDate.of(2001, 2, 28)));
       studentList.add(new Student("Albin", "Fehrić", Gender.MALE, LocalDate.of(2005, 5, 11)));
       studentList.add(new Student("Adna", "Kuduzović", Gender.FEMALE, LocalDate.of(2008, 4, 1)));
       studentList.add(new Student("Emir", "Puška", Gender.UNKNOWN, LocalDate.of(1988, 8, 8)));
       return studentList;
    }

}
