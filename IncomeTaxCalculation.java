//Problem 5:Computing Income Tax.
import java.util.Scanner;
class IncomeTaxCalculation{
        public static void main(String...s){
		   
		   Scanner sc=new Scanner(System.in);
		   //inputing income.
		   int income=sc.nextInt();
		   
		   System.out.printf("Your tax is %,d ",yourIncomeTax(income));   //to insert commas at appropriate places in result, using print formating(printf).
		 }
		
	 
	 public static int yourIncomeTax(int income){
		// applying conditional statements.
		int result=0;
		if(income<=250000){
			result=0;                                                               //Tax=0%
		}
		
		else if(income>250000&income<=500000){
			result=(int)(0.1*(income-250000));                                              //Tax=10%
		}
		
		else if(income>500000&income<=1000000){
			result=(int)(0.1*(500000-250000)+0.2*(income-500000));                          //Tax=10% over 250000 & 20% over 500000
		}
		
	    else{
			result=(int)(0.1*(500000-250000)+0.2*(1000000-500000)+0.3*(income-1000000));    //Tax=10% over 250000 & 20% over 500000 &30% over 1000000.
		}
		
		return result;
	}
}