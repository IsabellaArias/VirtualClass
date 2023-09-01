package Abstractas;

public class ExeC {
    abstract class Bank {
        abstract int getRateOfInterest();
        }
        static class SBI extends Bank{
        int getRateOfInterest(){
            return 7;
        }
        static class PNB extends Bank{
            int getRateOfInterest(){
                return 8;
            }
        }
        class TestBank{
            public static void main(String[] args) {
                Bank b;
                b=new SBI();
                System.out.println("Rate if Interest is: "+ b.getRateOfInterest()+"%");
                b=new PNB();
                System.out.println("Rate if Interest is: "+ b.getRateOfInterest()+"%");
            }
        }
        }
    }
