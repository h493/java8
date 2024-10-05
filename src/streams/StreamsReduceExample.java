package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    static int performMultiplication(List<Integer> numbers){
        return numbers.stream()
                .reduce(1,(a,b)->a*b);
    }

    static Optional<Integer> performMultiplicationWithNoInitialValue(List<Integer> numbers){
        return numbers.stream()
                .reduce((a,b)->a*b);  // performs multiplication for each element in the stream and returns a new result fo.
    }

    static String combineStudentNames(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .distinct()
                .reduce("",(a,b)->a.concat(b));
    }

    static Optional<Student> getHighestGradeStudent(){

        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1,s2) -> s1.getGradeLevel() > s2.getGradeLevel() ? s1 : s2); // eliminated one student every time
    }


    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println(performMultiplication(numbers));
        System.out.println(performMultiplicationWithNoInitialValue(numbers).get());

        System.out.println(combineStudentNames());

        System.out.println(getHighestGradeStudent().get());
    }
}
