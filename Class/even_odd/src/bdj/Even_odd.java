package bdj;

import java.util.Scanner;

public class Even_odd {
    
    public static boolean isEven(int n){
        
        return ( n % 2 == 0);
    }
    
    public static boolean isOdd(int n){
        
        return !isEven(n);
    }
    
    public static void main(String[] args) {
        
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("Enter an integer value: ");
        int value = kbd.nextInt();
        
        System.out.printf("isEven(%d) returns %b\n",value,isEven(value));
        System.out.printf("isOdd(%d) returns %b\n",value,isOdd(value));
        
        /*if (isEven(value))
            System.out.printf("%d is even!\n",value);
        else
            System.out.printf("%d is odd!\n",value);*/
    }
    
}
