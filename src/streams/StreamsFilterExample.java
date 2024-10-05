package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamsFilterExample {

    static List<Student> filterStudents(){

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .toList();
    }
    public static void main(String[] args) {

        filterStudents().forEach(System.out::println);
    }
}
