package Interfaces;

public class Example2 {
    interface In2{
        final int a=6;
        default void display(){
            System.out.println("Hello");
        }
        class TestClass implements In2{
            public static void main(String[] args) {
                TestClass t=new TestClass();
                t.display();
            }
        }
    }
}
