package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,Integer> strLength = (name) -> name.length();

    static Function<String,String> upperCase = (name) -> name.toUpperCase();

    static Function<String,String> addSomeString  = (name) -> name.concat("default");


    public static void main(String[] args) {

        System.out.println("Upper Case : " + upperCase.apply("java8"));

        System.out.println("Result of addThen : " + upperCase.andThen(addSomeString).apply("java8"));

        System.out.println("Result of compose : " + upperCase.compose(addSomeString).apply("java8"));


        System.out.println("Result of addThen chaining: " + upperCase.andThen(addSomeString).andThen(strLength).apply("java8"));

        System.out.println("Result of compose chaining: " + upperCase.compose(addSomeString).andThen(strLength).apply("java8"));
    }
}
