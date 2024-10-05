package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> studentSupplier = () -> {
        return new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
    };

    static Supplier<List<Student>> studentsSupplier = () ->  StudentDataBase.getAllStudents();

    public static void main(String[] args) {

        Student student = studentSupplier.get();
        System.out.println(student);

        System.out.println(studentsSupplier.get());
    }
}
