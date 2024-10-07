package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    static String optionalOrElse(){

        //Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        String name = optionalStudent.map(Student::getName).orElse("Defualt");
        return name;
    }

    static String optionalOrElseGet(){

        //Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        String name = optionalStudent.map(Student::getName).orElseGet(() -> "Default");

        return name;
    }

    static String optionOrElseThrow(){

//        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        String name = optionalStudent.map(Student::getName).orElseThrow(()-> new RuntimeException("No Data"));

        return name;
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionOrElseThrow());
    }
}
