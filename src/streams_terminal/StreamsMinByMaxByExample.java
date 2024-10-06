package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    static Optional<Student> minBy(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getName)));
    }

    static Optional<Student> maxBy(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getName)));
    }

    public static void main(String[] args) {
        System.out.println(minBy());
        System.out.println(maxBy());
    }
}
