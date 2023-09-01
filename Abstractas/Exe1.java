package Abstractas;

public class Exe1 {
    abstract class Animal{
        //método abstracto
        public abstract void sound();
    }

    public static class Dog extends Animal{
        public void sound(){

            System.out.println("Woof");
        }

        public static void main(String[] args){
            Animal obj=new Dog();
            obj.sound();
        }
    }
}
