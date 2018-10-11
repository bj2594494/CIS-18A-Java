/**
 *
 * This program will create a factorial look up table for all
 * factorials from 0 to 100,000 ( yes, you read this right ONE HUNDRED THOUSAND )
 * using the BigInteger class in Java
 * 
 * We will allow the user to compute things such as: 
 * 
 * C(n,r) which is the number of combinations of n items, taken r at a time, 
 * this is computed as: n!/( r!(n-r)! )
 *
 * P(n,r) which is the number of permutations of n items, taken r at a time,
 * this is computed as: n!/(n-r)!
 *  
 * Depending on the amount of RAM your machine has, you can adjust the
 * named constant MAX_FACT to be a larger number!
 *
 */

// 0. Use the BigInteger class
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialLookupTable {

	public static final int MAX_FACT = 115000; // Maximum factorial 100000
        
	// 1. create a private static array of BigInteger[] named table.
	private static BigInteger[] table;
        
	// 2. create a private static function named C with
	// parameters of (int n, int r), and returns a BigInteger
        private static BigInteger C(int n, int r)
	{
            // 3. return table[n] divided by (table[r] times table[n-r])
            return table[n].divide(table[r].multiply(table[n-r]));
	}
	
	// 4. create a private static function named P with
	// parameters of (int n, int r), and returns a BigInteger
        private static BigInteger P(int n, int r)
	{
		// 5. return table[n] divided by table[n-r]
            return table[n].divide(table[n-r]);
	}
	
	// 6. create a private static function named C_Rep with
	// parameters of (int n, int r), and returns a BigInteger
        private static BigInteger C_Rep(int n, int r)
	{
		// 7. return table[r+n-1] divided by (table[r] times table[n-1])
            return table[r+n-1].divide(table[r].multiply(table[n-1]));
	}
	
	// 8. create a private static function named fact with
	// parameter of (int n), and is a void function
	// (I provided the programming code for the function below)
        private static void fact(int n)
        {           
            int i=0;
            System.out.print("Building big lookup table, please wait ...");

            table = new BigInteger[n+1];

            table[0] = BigInteger.ONE;

                    if (n>0)
                    {
                            for(i=1;i<=n;i++)
                            {         
                                    if ( i%(MAX_FACT/1000)==0 ) System.out.print(".");

                                    table[i]=table[i-1].multiply(BigInteger.valueOf(i));
                            }
                    }

            System.out.println();        
        }
    
	// Main function to run the program - no changes needed below
    public static void main(String[] args) {
                
	// build the big table
	fact(MAX_FACT);
        Scanner kb = new Scanner(System.in);
        
        do
        {
            System.out.println("Combination/Permutation Calculator - C(n,r)/P(n,r)");
            System.out.print("Can compute C(n,r) and P(n,r) with values ");
            System.out.printf("for n and r up to %d!\n\n",MAX_FACT);
            System.out.print("Enter a value for N (-1 to quit): ");
            int n=kb.nextInt();
			if (n==-1) break;
            System.out.print("Enter a value for R (-1 to quit): ");
            int r=kb.nextInt();
			if (r==-1) break;
            
            String result_string = C(n,r).toString();            
            System.out.printf("C(%d,%d)=%s\n\n", n,r,result_string);
			
			result_string = C_Rep(n,r).toString();            
            System.out.printf("C_Rep(%d,%d)=%s\n\n", n,r,result_string);
			
			result_string = P(n,r).toString();            
            System.out.printf("P(%d,%d)=%s\n\n", n,r,result_string);
            
        } while(true);
    }    
}

