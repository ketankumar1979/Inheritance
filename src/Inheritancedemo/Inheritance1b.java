package Inheritancedemo;

public class Inheritance1b extends Inheritance1a {
    public static void main ( String [] args ){
        Inheritance1b obj1 = new Inheritance1b();
        obj1.multiplication(20, 30 );
        obj1.addition(30, 50 );
        obj1.string("Sam ", " smith ");
        System.out.println ( 20*30);
        System.out.println ( 30+50 );
        System.out.println ( " sam smith ");

    }

}
