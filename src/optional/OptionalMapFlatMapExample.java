package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    static void optionalFilter(){

        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        optionalStudent
                .filter(s -> s.getGpa()>3)
                .ifPresent(System.out::println);
    }

    static void optionalMap(){

        Optional<Student> studentOptional =  StudentDataBase.getOptionalStudent();

        Optional<String> namePresent = studentOptional.map(Student::getName);
        System.out.println(namePresent.get());
    }

    static void optionalFlatMap(){
        Optional<Student> studentOptional =  StudentDataBase.getOptionalStudent();

        if(studentOptional.isPresent()){
            Optional<Bike> bikeOptional = studentOptional
                    .flatMap(Student::getBike);

            System.out.println("Bike optional : " + bikeOptional);

        }
    }
    public static void main(String[] args) {
//        optionalFilter();
//        optionalMap();
        optionalFlatMap();
    }
}
