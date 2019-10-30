package testClass;

public class Socratives {
	public static void main(String[] args) {
		int[] a = {0,2,4,1,3};
		for(int i = 0; i < a.length; i++){
			a[i]= a[(a[i] + 3) % a.length];
			System.out.print(a[1]);
              }
      }
}
	

	
//    public static void main(String args[]) 
//    {
// int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
//int n = 6;
// n = arr[arr[n] / 2];
// System.out.println(arr[n] / 2);
//  } 
//}

		
//		   public static void main(String[] args) {
//		      int[] a;
//		      a = new int[10];
//
//		      for (int i = 0; i < a.length; i++) {
//		         a[i] = i + 2;
//		         System.out.printf("Result is: %d%n", a[i]);
//		      }
//
//		      int result = 0;
//		      for (int i = 0; i < a.length; i++) {
//		         result += a[i];
//		      }
//
//		      System.out.printf("Result is: %d%n", result);
//		   } 
//		} 


