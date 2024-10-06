package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    static int sum(){

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    static double avg(){

        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println(sum() + "\n" + avg());
    }
}
