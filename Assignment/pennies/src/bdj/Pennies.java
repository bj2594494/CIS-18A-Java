package bdj;

import java.util.Scanner;

public class Pennies {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double pay=.01;
        double totPay=0;
        
        System.out.println("For how many days will the pay double?");
        double x = kbd.nextInt();
        
        for(int i=0;i<x;i++){
            System.out.println(pay);
            totPay+=pay;
            pay*=2;
        }
        System.out.println(totPay);
    }
    
}
