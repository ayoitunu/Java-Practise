package chapter6.MathUtility;

public class AyoMath {
	

		
		// SQUARE ROOTS
		 public static int SquareRoot(int num) {
		    	int i;
		    	int n = 0;
		        for(i =1; i < num; i++)
		        {
		            if(num / i == i)
		            {   
		            	n = i;
		            }          
		        }
		        	return n;	    
		}
		 
			// SQUARE ROOTS return Double
		 public static double SquareRoot(double num) {
		    	int i;
		    	double n = 0;
		        for(i =1; i < num; i++)
		        {
		            if(num / i == i)
		            {   
		            	n = i;
		            }          
		        }
		        	return n;	    
		}
		 
		 // NROOTS 
		 public static int NRoot(int num,int x){
		        //int c ;
		        int d = 1;
		        int root = 0;
		        
		        for(int i =1; i <=num /2; i++)
		        { 
		            if(num % i == 0)
		            {
		               // c = i;
		                for(int j=1; j<=x; j++)
		                {
		                d = d * i;
		                    if (d == num)
		                    {
		                    	root = i; 
		                    }
		                }
		             }
		        }
				return root;        
		 }
		 
		 // PRODUCT OF ODD NUMBERS
		 public static int oddNumberProduct(int number) {
			 
			 int oddNum = 1;
				int counter = 1;
				int product = 1;
				 while(counter<=number) 
				 {
					 oddNum =+ counter;
					 
					 product = product * counter;
					 counter+=2;
					 System.out.println(oddNum);
				 }
				 return product;
			}
		 
		 // SUM OF ODD NUMBERS
		 public static int oddNumberSum(int number) {
				 
				 int oddNum = 1;
					int counter = 1;
					int sum = 0;
					 while(counter<=number) 
					 {
						 oddNum =+ counter;
						 
						 sum = sum + counter;
						 counter+=2;
						 System.out.println(oddNum);
					 }
					 return sum;
				}
		 
		 // ODD NUMBERS
		 public static int oddNumbers(int number) {
			 
			 	int oddNum = 1;
				int counter = 1;
				while(counter<=number) 
				 {
					oddNum =+ counter;
					
					System.out.println(oddNum);
					 counter+=2;
				 }
				 return oddNum;
			}
		 
		 // EVEN NUMBERS
		 public static int evenNumbers(int number) {
			 
			 	int evenNum = 1;
				int counter = 2;
				while(counter<=number) 
				 {
					evenNum =+ counter;
					
					System.out.println(evenNum);
					 counter+=2;
				 }
				 return evenNum;
			}
		 
		 // PRODUCT OF EVEN NUMBERS
		public static int evenNumberProduct(int number) {
				 
				 int evenNum = 1;
					int counter = 2;
					int product = 1;
					 while(counter<=number) 
					 {
						 evenNum =+ counter;
						 
						 product = product * counter;
						 counter+=2;
						 System.out.println(evenNum);
					 }
					 return product;
				}
		
		// SUM OF EVEN NUMBERS
		public static int evenNumberSum(int number) {
			 
			 int evenNum = 1;
				int counter = 2;
				int sum = 0;
				 while(counter<=number) 
				 {
					 evenNum =+ counter;
					 
					 sum = sum + counter;
					 counter+=2;
					 System.out.println(evenNum);
				 }
				 return sum;
			}
		
		//	PRIME NUMBERS
		 public static int countPrimeNumbers(int number){
			 
			 
		        for(int counter = 1; counter <= number; counter++)
		        {
		        	
		            if(counter % number == 0)
		            {
		                
		               System.out.println("The Prime numbers are " + counter); 
		        }
		        
		        }
		        return number;
		    }
		
			 
	}




