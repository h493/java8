package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    static void groupingByGender(){

        Map<String, List<Student>> studentGenderMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        Stream.of(studentGenderMap).forEach(System.out::println);
    }

    static void customizedGroupingBy(){

       Map<String, List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(s -> s.getGpa() >= 3.8 ? "OUTSTANDING" : "AVG"));

       Stream.of(studentMap).forEach(System.out::println);
    }

    /**
     * Grouping by Two parameters
     */
    static void twoLevelGrouping(){

        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(s -> s.getGpa() >= 3.8 ? "OUTSTANDING" : "AVG")));

        System.out.println(studentMap);
    }

    public  static void twoLevelGrouping_2() {

        Map<String, Integer> nameNotebookMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks))); // second argument can be of any type of collector

        Stream.of(nameNotebookMap).forEach(System.out::println);
    }

    public  static void twoLevelGrouping_3(){

        Map<String, Set<Student>> nameNoteBooksMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,
                        toSet()));// second argument can be of any type of collector

        System.out.println(nameNoteBooksMap);
    }

    static void threeArgumentGroupingBy(){

        LinkedHashMap<String, Set<Student>> studentSetMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));

        studentSetMap.forEach((name, studentSet) -> {
            System.out.println("Name: " + name); // Print the name
            studentSet.forEach(student -> System.out.println(student)); // Print each student in the set
            System.out.println(); // Add an extra line for readability between different sets
        });
    }

    public  static void calculteleastGpaStudentinEachGrade(){

        Map<Integer, Optional<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, minBy(Comparator.comparing(Student::getGpa))));

        studentMap.forEach((grade, student) -> {
            System.out.println(grade + "\n"  + student.get());
        });

        Map<Integer, Student> studentMapWithOutOptional = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));

        System.out.println(studentMapWithOutOptional);
    }

    public static void main(String[] args) {
       // groupingByGender();
       // customizedGroupingBy();
      //  twoLevelGrouping();
       // twoLevelGrouping_2();
      //  threeArgumentGroupingBy();
        calculteleastGpaStudentinEachGrade();
    }
}
