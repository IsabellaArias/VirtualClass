package Interfaces;

public class Example4 {
    public interface A{
        void method1();
        void method2();
    }
    interface B extends A{
        void method3();
    }
    class gfg implements B{
        @Override
        public void method1() {
            System.out.println("Method 1");
        }

        @Override
        public void method2() {
            System.out.println("Method 2");
        }

        @Override
        public void method3() {
            System.out.println("Method 3");
        }
    }
}
