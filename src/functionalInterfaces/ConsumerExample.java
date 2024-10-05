package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c1 = p -> System.out.println(p);

    static Consumer<Student> c2 = p -> System.out.println(p.getName().toUpperCase());

    static Consumer<Student> c3 = p -> System.out.println(p.getActivities());
    //static Consumer<Integer> c3 = p -> System.out.println(p);
    static List<Student> personList = StudentDataBase.getAllStudents();

    public static void printStudent(){
        personList.forEach(s-> c1.accept(s));
        personList.forEach(c1);
    }

    public static void printNameAndActivities(){
        System.out.println("printNameAndActivities : ");
        personList.forEach(c2.andThen(c3));
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("printNameAndActivitiesUsingCondition : ");

        personList.forEach((s) ->{
            if(s.getGradeLevel()>=3 && s.getGpa()>3.9){
                c2.andThen(c3).accept(s);
            //    c1.accept(s);
            }
        });
    }

    public static void main(String[] args) {
            printNameAndActivitiesUsingCondition();
          //  printNameAndActivities();
        //printStudent();
    }
}
