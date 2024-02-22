//Problem 9: 2 digit Special Integer.
import java.util.Scanner;
class SpecialInteger{
   public static void main(String...s){
	 Scanner sc=new Scanner(System.in);

     System.out.println("Enter any 2 digit integer.");
     int number=sc.nextInt();
     
	 specialInteger(number);
 }

  public static void specialInteger(int x){
      int rem=0,temp=0,sum=0,product=1,special_int=0,num_of_digits=0;
      temp=x;
       
	   while(temp!=0){
		  rem=temp%10;
		  sum+=rem;
		  product*=rem;
		  temp/=10;
	      
		  num_of_digits++;
	   }
	   
	   special_int=sum+product;                                        // property of specialInteger : sum of digit+product of digit.
	  
	  if(x==special_int && num_of_digits==2){                          // checking if it is a 2 digit integer only. 
		  
		 System.out.println(x +" is a 2 Digit Special Integer. ");
	  }
	  
	  else{
		  System.out.println(x +" is not a 2 Digit Special Integer.");
	  }
	  
  }
}
	   
	   
   