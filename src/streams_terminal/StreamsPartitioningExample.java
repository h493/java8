package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toMap;

public class StreamsPartitioningExample {

    static void partitioningBy_1(){

        Predicate<Student> p1 = s -> s.getGpa()>=3.9;
        Map<Boolean, List<Student>> studentMap =  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(p1));

        studentMap.forEach((b,s) -> {
            System.out.println(b);
            s.forEach(System.out::println);
            System.out.println();
        });
    }

    static void partitioningBy_2(){

        Predicate<Student> p1 = s -> s.getGpa()>=3.9;
        Map<Boolean, Set<Student>> studentMap =  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(p1, Collectors.toSet()));

        studentMap.forEach((b,s) -> {
            System.out.println(b);
            s.forEach(System.out::println);
            System.out.println();
        });
    }

    public static void partitioningBy_3(){

        Predicate<Student> gpaPredicate = (student) -> student.getGpa()>=3.8;

        Map<Boolean,Map<String, List<String>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate,toMap(Student::getName,Student::getActivities)));

        System.out.println("studentMap : " + studentMap);

    }
    public static void main(String[] args) {
        //partitioningBy_1();
        partitioningBy_2();
    }
}
