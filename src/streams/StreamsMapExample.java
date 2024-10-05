package streams;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class StreamsMapExample {

    private static List<String> namesUpperCase(List<Student> names){
        List<String> namesUpperCase = names.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());
        return namesUpperCase;
    }

    private static Set<String> namesUpperCaseSet(List<Student> names){
       return names.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }


    private static Map<String,Integer> namesLengthMap(ArrayList<String> names){
        return names.stream()
                .collect(toMap(String::toString, String::length));
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("dan");
        names.add("jenny");


        System.out.println(namesUpperCase(StudentDataBase.getAllStudents()));
        System.out.println(namesUpperCaseSet(StudentDataBase.getAllStudents()));
        System.out.println(namesLengthMap(names));
    }
}
