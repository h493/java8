package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {

    static List<String> printStudentActivities(){

        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());

        return studentActivities;
    }

    static List<String> printUniqueStudentActivities(){

        List<String> studentActivites = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();

        return studentActivites;
    }

    static long getStudentActivitiesCount(){

        long totalActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        return totalActivities;
    }
    public static void main(String[] args) {
      //  System.out.println(printStudentActivities());
        System.out.println(printUniqueStudentActivities());
        System.out.println(getStudentActivitiesCount());
    }
}
