package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    static Optional<Student> findAnyNoCondition(){

        return StudentDataBase.getAllStudents()
                .stream()
                .findAny();
    }

    static Optional<Student> findAny(){

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGradeLevel()>=2)
                .findAny();
    }

    static Optional<Student> findFirst(){

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGradeLevel()>=2)
                .findFirst();
    }


    public static void main(String[] args) {

       // System.out.println(findAnyNoCondition());
        System.out.println(findAny());
        System.out.println(findFirst());
    }
}