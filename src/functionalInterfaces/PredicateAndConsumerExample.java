package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

     Predicate<Student> p1 = s -> s.getGpa()>=3.9;
     Predicate<Student> p2 = s -> s.getGradeLevel()>=3;

    BiConsumer<String, List<String>> biConsumer = (name, activites) -> System.out.println(name + " : " + activites);

    Consumer<Student> studentConsumer = (student) -> {
        if(p1.and(p2).test(student)){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        new PredicateAndConsumerExample().printNameAndActivities();
    }

}
