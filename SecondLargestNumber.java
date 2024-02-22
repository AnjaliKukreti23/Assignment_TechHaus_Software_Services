//Problem 10: Second largest number from unsorted array.
import java.util.Scanner;
class SecondLargestNumber{
   public static void main(String...s){
	   Scanner sc=new Scanner(System.in);
	   
	   int [] numbers=new int[6];
	   
	   System.out.println("Enter 6 numbers in an array.");
	    
		for(int i=0;i<numbers.length;i++){
		   System.out.println("numbers[ "+i+" ]=");
		   numbers[i]=sc.nextInt();
		}
		
		int first_max=0,second_max=0,temp=0,index=0;
		first_max=numbers[0];                                  //first greatest number.
		second_max=numbers[0];                                 //second greatest number.
		
		for(int i=0;i<numbers.length;i++){
			if(first_max<numbers[i]){                            
		       first_max=numbers[i];                            // calculating first max number.
			   index=i;                                         // position of the greatest number in array.
			  } 
		}
		   
		   for(int i=0;i<numbers.length;i++){
			     if(i!=index){                                       // leaving out the greatest number from array and then comparing each number with it.
			       if(second_max<first_max & second_max<numbers[i])   // calculating second greatest number.
				     second_max=numbers[i];                         
			     }
		    }
		
	System.out.println("The second largest number is "+second_max);
  
  }
}
		
         