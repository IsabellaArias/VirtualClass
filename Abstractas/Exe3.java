package Abstractas;

public class Exe3 {
    abstract class Base{
        Base(){
            System.out.println("Base constructor called");
        }
        abstract void fun();
    }
    static class Derived extends Base{
        Derived(){
            System.out.println("Derived constructor called");
        }
        void fun(){
            System.out.println("Derived fun() called");
        }
    }
    class GPG{
        public static void main(String[] args) {
            Derived d=  new Derived();
            d.fun();
        }
    }
}
