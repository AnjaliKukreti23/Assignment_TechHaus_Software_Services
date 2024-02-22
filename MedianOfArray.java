// Problem4:Finding the median of elements in an array.
import java.util.Scanner;
class MedianOfArray{
	public static void main(String...s){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input number of elements in an array");
		int len=sc.nextInt();
		
		double [] arr=new double[len];
		
		System.out.println("Enter the elements ");
		
		//inputing elements of an array.
		for(int i=0;i<arr.length;i++){
			System.out.println("a["+i+"]=");
			arr[i]=sc.nextDouble();
		}
		
		//result.
		System.out.printf("The median of this array is %.1f ",medianNumber(sortArray(arr)));
    }
		
	    public static double[] sortArray(double arr[]){
	       
		   int length=arr.length;
            double temp=0.0;
               //swapping algorithm.
               for(int i=0;i<arr.length;i++){
                  for(int j=i+1;j<arr.length;j++){
                   if(arr[i]>arr[j]){               // if the first element is greater, we swap the two elements.
                      temp=arr[i];         
                      arr[i]=arr[j];
                      arr[j]=temp;					  
				   }
			      }
			     }
		      return arr;
	    }
	
	    public static double medianNumber(double arr[]){
		   
		   int length=arr.length;
		   int mid_element=0;
		   double result=0.0;
		      if(length==0){
			    result= -1;
		     }
		
		  else{
			//condition for odd number of elements i.e. not divisible by 0.
			    if(length%2!=0){
				mid_element=(length+1)/2;        //Calculating the mid element.
				System.out.println(mid_element);
				result= arr[mid_element-1];         //Since array starts from 0,the "actual" position of mid element will be index-1.
				}
			
			    else{
				mid_element=(length)/2;
				result=(arr[mid_element-1]+arr[mid_element])/2.0;        //taking average of the two elements.
		        }
	         }
	
	        return result;
    }
}
		
		
		
		
		
   