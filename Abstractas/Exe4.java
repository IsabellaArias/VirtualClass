package Abstractas;

public class Exe4 {
    abstract class Helper{
        static void demofun(){
            System.out.println("Geeks for Geeks");
        }
    }
    public class GFG extends Helper{
        public static void main(String[] args) {
            Helper.demofun();
        }
    }
}
