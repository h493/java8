package defaults;

public class Client14 implements Interface4,Interface1{

    public static void main(String[] args) {
         new Client14().methodA();
    }

    @Override
    public void methodA() {
       Interface4.super.methodA();
       // or can implements new methodA implementations
    }
}
