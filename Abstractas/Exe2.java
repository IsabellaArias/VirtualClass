package Abstractas;

public class Exe2 {
    abstract class AbstractDemo{
        public void myMethod(){
            System.out.println("hello");
        }
        final public void myMethod2(){
            System.out.println("to say hello to");}
        abstract public void anotherMethod();
    }
    public class Demo extends AbstractDemo{
        public void anotherMethod(){
            System.out.println("Abstract method");
        }
        //No esta permititdo
        public static void main(String[] args){
            AbstractDemo obj= new AbstractDemo();
            obj.anotherMethod();
        }
    }
}