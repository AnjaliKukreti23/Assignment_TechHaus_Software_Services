//Problem 8: Returing seconds to its equivalent days,hours,minutes and seconds.
import java.util.Scanner;
import java.math.BigDecimal;
class SecondsEquivalent{
    public static void main(String...s){
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the number of seconds.");
	 int second=sc.nextInt();
	 secondEquivalent(second);
	 
    }
	
 public static void secondEquivalent(int second){
	 double days=0.0,minutes=0.0,seconds=0.0,result=0.0,decimal=0.0,conversion_factor=24;           // converting days into hours so it is 24.
	 int i=0;
	 int [] array=new int[4];                                                                       // storing days,hours,minutes and seconds.
	 // evaluating number of days.
	 result=second/(24.0*3600);                                                                      //conversion from seconds to days.
	 while(i<=3){
     BigDecimal bigDecimal=new BigDecimal(String.valueOf(result));                                   // using BigDecimal to seperate integer part and decimal part.
	 int int_value=bigDecimal.intValue();
	 array[i]=int_value;
	 decimal=Double.parseDouble(bigDecimal.subtract(new BigDecimal(int_value)).toPlainString()); 
	 result=(decimal*conversion_factor);
	 
	 i++;
	 conversion_factor=60;                                                                                        // converting hours into minutes so it is 60 and then to seconds,again 60.
	
	} 	 
	 
	System.out.println(array[0]+" days "+array[1]+" hours "+array[2]+" minutes "+array[3]+" seconds .");
	 
 }
}
    
	 