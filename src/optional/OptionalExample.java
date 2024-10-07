package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    static String getStudentName(){

        Student student = null;
        if(student != null){
            return student.getName();
        }

        return null;
    }

    static Optional<String> getStudentNameOptional(){

        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());

       if(student.isPresent()){
           return student.map(Student::getName); // don't get confused this with streams map method. Both are different.
       }

       return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(getStudentName());

        if(getStudentNameOptional().isPresent()){
            System.out.println(getStudentNameOptional().get());
        }else{
            System.out.println("Name is returned as empty.");
        }
    }
}
