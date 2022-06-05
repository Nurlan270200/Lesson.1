import java.awt.*;
import java.util.Scanner;

public class Retry {
    public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                System.out.println(func1(getRandomAge(),getRandomTemp()));
                System.out.println();
           }
    }

    public static String func1(int age, int t) {
        System.out.println("Age:"+age);
        System.out.println("Temprature:"+t);
        if(age>= 20 && age<45 && t>=-20 && t<30) return  "May to go";
        else if(age<20 && t>0 && t<28) return  "May to go";
        else if(age>45 && t>-10 && t<25) return  "May to go";
        else return  "Stay at home";
    }
    public static int getRandomAge(){
        return (int) (Math.round(Math.random() * ( 60 - 10 )) + 10);
    }
    public static int getRandomTemp(){
        return (int) (Math.round(Math.random() * ( 45 + 30 )) - 30);
    }
}