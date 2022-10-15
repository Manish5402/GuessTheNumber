// import java.util.Random;
// import java.util.Scanner;
// import java.util.random.RandomGenerator;

import java.util.*;
public class GuessTheNumber {
    
    public static void main(String[] args) {
        Random random=new Random();
        int computerinput = random.nextInt(500);
        int count =0;
        System.out.println("Guess The Number From 0 To 500 -");
        getCheck(computerinput,count);
    }
    private static void getCheck(int computerinput , int count) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The Number Is :");
            int input =sc.nextInt();
            if(input>computerinput){
                System.out.println("your input is grater than random number");
                count+=1;
                getCheck(computerinput,count);
            }
            else if(input==computerinput){
                System.out.println("your input is correct \n the number is : "+computerinput);
                System.out.println("your attempt : "+count);
                greeting(count);
                return;
            }
            else{         
                System.out.println("your input is less than random number");
                              count+=1;
                getCheck(computerinput,count);
            }
            // sc.close();
    }
    private static void greeting(int count) {
        if(count<= 5){
            System.out.println("Excilent");
        }
        else if(count<15){
            System.out.println("Good ");
        }
        else{
            System.out.println("Improve your Thought Process");
        }
    }      
}