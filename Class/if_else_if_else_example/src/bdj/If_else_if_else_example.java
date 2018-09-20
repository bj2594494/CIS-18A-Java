package bdj;

import java.util.Scanner;

public class If_else_if_else_example {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        // promt the user for an integer number
        System.out.print("Enter an course score: ");
        float score = kb.nextFloat();
        
        // output the letter grade based on coursescore
        if(score>=90){
            System.out.println("The course grade is A!!!");
            System.out.println("This is excellent.");
        }
        else if(score>=80){
            System.out.println("The course grade is B!!!");
            System.out.println("This is very good.");
        }
        else if(score>=70){
            System.out.println("The course grade is C!!!");
            System.out.println("This is good.");
        }
        else if(score>=60){
            System.out.println("The course grade is D!!!");
            System.out.println("This is not passing.");
        }
        else if(score>=0){
            System.out.println("The course grade is F!!!");
            System.out.println("This is not passing.");
        }
        else{
            System.out.println("Score is not in range.");
        }
    }
    
}
