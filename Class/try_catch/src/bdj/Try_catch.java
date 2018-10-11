package bdj;

public class Try_catch {

    public static void main(String[] args) {
        boolean okay=false;
        int num=0;
        while (!okay)
        {
            try {
            System.out.print("How many number of the type double do you want to store in your array? ");
            num = new java.util.Scanner(System.in).nextInt();
            okay=true;
            }
            catch(Exception e) {
            System.out.println("ERROR: You must enter an integer number for your array size!");
            }
        }
    }
    
}
