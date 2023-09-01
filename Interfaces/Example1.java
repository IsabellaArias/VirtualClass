package Interfaces;

public class Example1 {
    public interface In1{
        final int a=7;
        public void display();
    }
    class TestClass implements In1{
        public void display(){
            System.out.println("Saludos a todos");
        }

        public void main(String[] args) {
            TestClass t= new TestClass();
            t.display();
            System.out.println(a);
        }
    }
}
