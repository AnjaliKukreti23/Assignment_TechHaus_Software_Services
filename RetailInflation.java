//Problem 7: Finding Rate of Compound Inflation at the end of x years.
import java.util.Scanner;
class RetailInflation{
  public static void main(String...s){
    Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the InflationRate in %");
	double rate=sc.nextDouble();
	
	System.out.println("Enter the number of years.");
	int years=sc.nextInt();
	
	System.out.println("The compound inflation after "+years+" years at "+(int)rate+" % rate = "+compoundInflation(rate,years)+" %.");
	
  }
  
  public static int compoundInflation(double rate,double years){
	  double sum=1.0;
	  for(int i=1;i<=years;i++){                                  // iteration for compound interest rate.
		  sum+=sum*(rate/100);
		  
	  }
	  return (int)(Math.round(sum*100));                           // using Math.round() for rounding off to nearest decimal places.
  }
}