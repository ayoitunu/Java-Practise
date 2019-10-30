
public class Check {
	
//	static int x = 0;
//	
//	public void count() {
//		x++;
//	}
	public static void main(String [] args) {
//		 Check test = new Check();
//		 
//		 test.count();
//		 test.count();
//		 
//		 System.out.println(x);
		 
		 final int ARRAY_LENGTH = 10;
		 int [] array = new int[ARRAY_LENGTH];
		 
		 System.out.printf("%s%8s%n" , "Index", "Value");
		 
		 for(int counter = 0; counter < array.length; counter++) {
			 array [counter] = 2 + 2 * counter;
			 System.out.printf("%5d%8d%n" , counter, array[counter]);
			 
			 
		 }
	}

}
