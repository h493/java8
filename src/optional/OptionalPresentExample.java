package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        Optional<Student> optionalStudent = Optional.of(StudentDataBase.studentSupplier.get());

        System.out.println(optionalStudent.isPresent());

        optionalStudent.ifPresent(s -> System.out.println("Value is :" + s));
    }
}
