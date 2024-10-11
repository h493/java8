package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;

public class DefaultMethodSort {

    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
    static Comparator<Student> genderComparator = Comparator.comparing(Student::getGender);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
    static Consumer<Student> studentConsumer = System.out::println;


    static void sortByName(List<Student> studentList){

        studentList.sort(Comparator.comparing(Student::getName)); // inline
        studentList.sort(nameComparator); // Using the reference

        System.out.println("After sort by Name : ");
        studentList.forEach(studentConsumer);

    }

    public static void sortByGPA(List<Student> studentList){

        studentList.sort(gpaComparator);
        System.out.println("After Sort BY GPA : ");
        studentList.forEach(studentConsumer);
    }

    public static void sortByGender(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        Comparator<Student> nullLast = Comparator.nullsFirst(genderComparator);
        studentList.sort(nullLast);
        System.out.println("After Sort By Gender : ");
        studentList.forEach(studentConsumer);

    }

    static void comparatorChaining(List<Student> studentList){

        studentList.sort(gradeComparator.thenComparing(nameComparator));

    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Original List");
        studentList.forEach(studentConsumer);

        System.out.println();
       // sortByName(studentList);
        comparatorChaining(studentList);
    }
}
