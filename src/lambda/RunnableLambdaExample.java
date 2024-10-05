package lambda;

import java.util.function.Consumer;

public class RunnableLambdaExample {

    public static void main(String[] args) {


        // prior java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };

        new Thread(runnable).start();

        //Java 8 lambda

        Runnable runnableLambda = () -> {
            System.out.println("Lambda inside runnable");
        };

        Runnable runnableLambda1 = () -> System.out.println("Lambda1");

        new Thread(runnableLambda).start();
        new Thread(runnableLambda1).start();

        new Thread(()-> System.out.println("Directly passed runnable lambda interface")).start();
    }
}
