/**
 * 
 */
package testClass;

import java.util.Scanner;

import AyoUtilities.AyoMath;

/**
 * @author Emmanuel Akinbode
 *
 */
public class RootsCalculation {

	/**
	 * @param args
	 */
	
	public int getRoot(int num) {
		
		int root = AyoMath.SquareRoot(num);
		return root;
	}
	public int calNRoot(int number) {
		int nroot = AyoMath.countPrimeNumbers(number);;
		return nroot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		//int x = input.nextInt();
		RootsCalculation m = new RootsCalculation();
		//System.out.println(m.calNRoot(number));
		m.calNRoot(number);
		
		

	}
	
	

}
