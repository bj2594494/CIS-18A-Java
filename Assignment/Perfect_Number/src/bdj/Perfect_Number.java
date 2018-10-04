package bdj;

import java.util.Scanner;

public class Perfect_Number {
    
    public static String isPerfect(int n){
        int sum=0;
        String s="";
        for(int i=1;i<=(n-1);i++){
            if((n%i)==0){
                sum+=i;
                s+=i;
                s+=" ";
            }
        }
        if(sum !=n)
            s=null;
        return s;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("Enter the largest number to display: ");
        int value = kbd.nextInt();
        
        for(int k=1;k<=value;k++){
            if (isPerfect(k)!=null){
                System.out.println(k+" is perfect.");
                System.out.printf("        Factors: %s\n",isPerfect(k));
            }
        }
    }
    
}
