package amalitech;

import java.util.Scanner;

public class FizBuzzChallengeSolution {

    public static void main(String...args){

        Scanner scanner= new Scanner(System.in);
        //Example #1: What specific problem are in this code?
        System.out.println("Number:");
        int number=scanner.nextInt();

        boolean condition_a = number%5==0 && number%3==0;
        boolean condition_b = number%5==0;
        boolean condition_c = number%3==0;

        if(condition_a)
            System.out.println("FizzBuzz");
        else if(condition_b)
            System.out.println("Fizz");
        else if(condition_c)
            System.out.println("Buzz");
        else
            System.out.println(number);



        //Example #2: How Can we improve this code?
        //By placing most specific on top and most generic on bottom
        //This block of code has a bit of repletion?
        //Does this block of code has a flat structure without nesting? T
        //This code is cleaner and easier to read?

        System.out.println("Number:");
        int numberTwo=scanner.nextInt();

        boolean condition_1 = (numberTwo%5==0) && (numberTwo%3==0);
        boolean condition_2 = (numberTwo%5==0);
        boolean condition_3 = (numberTwo%3==0);

        if(condition_1)
            System.out.println("FizzBuzz");
        else if(condition_2)
            System.out.println("Fizz");
        else if(condition_3)
            System.out.println("Buzz");
        else
            System.out.println(numberTwo);

//
//        //Can we apply DRY- don’t repeat yourself principle??
        System.out.println("Number:");
        int numberThree=scanner.nextInt();
            boolean condition_x = (numberThree%5==0);
            boolean condition_y = (numberThree%3==0);
//        if(condition_x){
//            if(condition_y){
//                System.out.println("FizzBuzz");
//            }else
//                System.out.println("Fizz");
//        }
        String result = condition_x ? (condition_y ? "FizzBuzz":  "Fizz") :
                                      (condition_y ?  "Buzz": ""+numberThree);
        System.out.println(result);

//        /*
//        We can remove this for to adhere to DRY principle
//        else if(numberThree%5==0){
//        System.out.println("Fizz");
//        */
//        else if(numberThree%3==0){
//            System.out.println("Buzz");
//
//        }else
//            System.out.println(numberThree);
    }
}
