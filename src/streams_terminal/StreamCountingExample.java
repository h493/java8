package streams_terminal;

import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamCountingExample {

    static long count(){

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGradeLevel()>=3)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
