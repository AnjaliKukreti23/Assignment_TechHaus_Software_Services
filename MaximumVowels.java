import java.util.Scanner;
//Problem 6: Finding most number of vowels from an array of string.
class MaximumVowels{
  public static void main(String...s){
    
      Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the number of elements in an array");
	  int number=sc.nextInt();
	  String [] words=new String[number];
      
	  for(int i=0;i<number;i++){
		  System.out.println("words[ "+i+" ]=");
		  words[i]=sc.next();
       }
	   System.out.println();
       System.out.println("The word "+maxVowelWord(words)+" has maximum vowels.");	      //calling function.
    }
	
	public static String maxVowelWord(String [] names){
		int len=names.length;                                        
        
		int vowel_max=0,vowel_count=0,index=0;
		
		for(int i=0;i<names.length;i++){
			vowel_max=vowel_count;
			int j=0;                                                                        // j=0 means the first character of the first name in array 'names'.
			vowel_count=0;                                                                  // number of vowels.
			
		    while(j<names[i].length()){                                                     // loop through the whole length of first name in array.
				char alphabet=names[i].charAt(j);
				
				switch(alphabet){                                                            // switch case for counting the total vowels in name.
					
					case 'a':
					case 'A':
						 vowel_count++;
						 break;
                    
                    case 'e':
                    case 'E':
                         vowel_count++;
                         break;
						 
                    case 'i':
                    case 'I':
                         vowel_count++;	
                         break; 
						 
                    case 'o':
                    case 'O':
                          vowel_count++;
                          break;
						  
                    case 'u':
                    case 'U':
                         vowel_count++;
						 break;
				}
 
              j++;                                                                                       
			}
          
		  if(vowel_count>vowel_max){                                                                // finding the maximum vowel count 
			  vowel_max=vowel_count;
			  index=i;                                                                               // noting the index of the element for maximum vowel count.
		  }
		}
		
		return names[index];                                                               
		
	}
}
  
     