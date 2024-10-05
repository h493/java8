package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameActivites(){
        BiConsumer<String, List<String>> studentBiConsumer = (name, activies) -> {
            System.out.println(name +" : " + activies);
        };

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> studentBiConsumer.accept(student.getName(), student.getActivities())); //passed consumer
    }

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b) -> {
            System.out.println("a : " + a + " b : " + b);
        };
        biConsumer.accept("java7", "java8");

        BiConsumer<Integer,Integer> mutiply = (a,b) -> {
            System.out.println("Multiply : " + a*b);
        };

        BiConsumer<Integer,Integer> addition = (a,b) -> {
            System.out.println("Addition : " + (a+b));
        };

        BiConsumer<Integer,Integer> divide = (a,b) ->{
            if(b!=0) System.out.println("Division : " + a/b);;
        };

       // mutiply.andThen(addition).andThen(divide).accept(10,5);
        nameActivites();
    }
}
