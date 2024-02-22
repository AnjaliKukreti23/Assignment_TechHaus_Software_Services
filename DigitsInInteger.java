//Problem 1: Counting the number of digits in an integer.
import java.util.Scanner;
class DigitsInInteger{
   public static void main(String...s){
      Scanner sc=new Scanner(System.in);
	  int number=sc.nextInt();
	  
	  // Declaring variable count to stores the number of digits.
	   int count=0,temp=0;
	  
	  temp=number;
	  
	  while(temp!=0){
		  // The last digit will be omitted on dividing by 10 since it is integer. The number of times of omission is stored in count which is the number of digits in integer.
		  temp/=10;
		  count++;
	  }
	  System.out.println("The number of digits in "+ number+" are "+count);
   }
}
	     