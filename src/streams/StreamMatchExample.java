package streams;

import data.StudentDataBase;

public class StreamMatchExample {

    static boolean allMatch(){

        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(s -> s.getGradeLevel()>=1);
    }

    static boolean anyMatch(){

        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(s -> s.getGradeLevel()>=3);
    }

    public static boolean noneMatch(){

        boolean result = StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=4);

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Result of allMatch : " + allMatch());
        System.out.println("Result of anyMatch : " + anyMatch());
        System.out.println("Result of noneMatch : " + noneMatch());
    }
}
