package streams;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class StreamsFilterMapReduceExample {

    static Predicate<Student> genderPredicate = s -> s.getGender().equalsIgnoreCase("male");

    static Predicate<Student> gradePredicate = StreamsFilterMapReduceExample::gradeLevel;

    static boolean gradeLevel(Student student){
        return student.getGradeLevel() >= 3;
    }

    static int noOfNoteBooks(){

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(genderPredicate)
                .filter(gradePredicate)
                .map(Student::getNoteBooks)
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("Total No of NoteBooks are : " + noOfNoteBooks());
    }
}
