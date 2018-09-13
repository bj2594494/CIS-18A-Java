/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdj;

import java.util.Scanner;
public class BasicInputOutputDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declare integer variables
        int value1, value2, sum, diff, product, quotnt, rmaindr;
        
        // create scanner object called keyboard to read in characters user types
        Scanner keybrd = new Scanner(System.in);
        
        // promt the user to enter a value for value1
        System.out.print("Enter a value for value 1: ");
        value1 = keybrd.nextInt();
        
        // promt the user to enter a value for value2
        System.out.print("Enter a value for value 2: ");
        value2 = keybrd.nextInt();
        
        // let's do some basic computations
        sum = value1+value2;
        diff = value1-value2;
        product = value1*value2;
        quotnt = value1/value2;
        rmaindr = value1%value2;
        
        // output our results using printf
        /*System.out.printf("The sum of %d and %d is %d.%n",value1,value2,sum);
        System.out.printf("The difference of %d and %d is %d.%n",value1,value2,diff);
        System.out.printf("The product of %d and %d is %d.%n",value1,value2,product);
        System.out.printf("The quotient of %d and %d is %d.%n",value1,value2,quotnt);
        System.out.printf("The remainder of %d and %d is %d.%n",value1,value2,rmaindr);*/
        
        // output our results using println
        System.out.println("The sum of "+value1+" and " +value2+" is "+sum);
        System.out.println("The difference of "+value1+" and " +value2+" is "+diff);
        System.out.println("The product of "+value1+" and " +value2+" is "+product);
        System.out.println("The quotient of "+value1+" and " +value2+" is "+quotnt);
        System.out.println("The remainder of "+value1+" and " +value2+" is "+rmaindr);
    }
    
}
