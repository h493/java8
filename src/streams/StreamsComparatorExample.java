package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamsComparatorExample {

    static List<Student> sortStudentsByName(){

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }

    static List<Student> sortStudentByGpa(){

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .toList();
    }

    public static void main(String[] args) {

        System.out.println("Sorted student on basis of name : ");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Sorted Student on basis of GPA in reversed way");
        sortStudentByGpa().forEach(System.out::println);
    }
}
