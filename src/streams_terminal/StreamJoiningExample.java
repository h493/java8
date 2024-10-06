package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamJoiningExample {

    static String joining(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    static String joiningWithDelimeter(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    static String joiningWithDelimeterAndPrefix(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }

    public static void main(String[] args) {

        System.out.println(joining() + "\n" + joiningWithDelimeter() + "\n" + joiningWithDelimeterAndPrefix());
    }
}
