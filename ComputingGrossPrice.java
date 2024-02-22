// Problem 2:Computing GrossPrice ,given NetPrice and TaxRate.
import java.util.Scanner;
class ComputingGrossPrice{
  public static void main(String...s){
    
	Scanner sc=new Scanner(System.in);
	
	double NetPrice=sc.nextDouble();
	double TaxRate=sc.nextDouble();
	
	System.out.println("NetPrice\t"+"TaxRate\t"+"\tGrossPrice");
	System.out.println(NetPrice+"\t\t"+TaxRate+"\t\t"+grossPrice(NetPrice,TaxRate));
	
  }
  
  public static double grossPrice(double NetPrice, double TaxRate){
	  return NetPrice-(NetPrice*TaxRate);
  }
}