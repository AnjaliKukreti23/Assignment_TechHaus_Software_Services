// Problem3: Largest of the two numbers.
import java.util.Scanner;
class LargestNumber{
  public static void main(String...s){
	  Scanner sc=new Scanner(System.in);
	  
	  int number1=sc.nextInt();
	  int number2=sc.nextInt();
	  
	  //using ternary operator and storing the output in result.
	  int result=(number1>number2)?number1:number2;
	  System.out.println(result+" is greatest.");
	  
  }
}