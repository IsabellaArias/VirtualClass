package Interfaces;

public class Example3 {
    public interface In4{
        final int a=3;
        static void display(){
            System.out.println("hello");
        }
        class TestClass implements In4{
            public static void main(String[] args) {
                In4.display();
            }
        }
    }
}
