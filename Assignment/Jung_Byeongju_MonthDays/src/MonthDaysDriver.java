import java.util.Scanner;

public class MonthDaysDriver {

    
    public static void main(String[] args) {        
        Scanner keybrd = new Scanner(System.in);
        System.out.print("Enter the month (1=January, 2=February, ..., 12=December): ");
        int month=keybrd.nextInt();
        //date.setMonth(keybrd.nextInt());
        System.out.print("Enter the year: ");
        int year=keybrd.nextInt();
        //date.setYears(keybrd.nextInt());
        MonthDays date = new MonthDays(month,year);
        System.out.println();
        System.out.println(date.getMonth()+"/"+date.getYears()+" has "+date.getNumberOfDays()+" days.");
    }
    
}
