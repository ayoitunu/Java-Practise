/**
 * 
 */
package testClass;

/**
 * @author USER
 *
 */
public class ArrayPractise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [][] a = new int[4][4];
//		a[0] = new int[2];
//		a[1] = new int [3];
//		a[2] = new int [5];
		
//		a[0] = new int [2];
//		a[1] = new int [3];
//		a[2] = new int [5];
//		a[3] = new int [6];
		
		int a[][] = {{2,3},{2,4,5},{1,2,3,4,5},{3,5,3,7,8,9}};
		
		for(int i = 0; i < a.length; i++) 
			for(int j= 0; j < a[i].length; j++) {
				System.out.printf("row %d col %d = %d%n ",i,j, a[i][j]);
		
			}
		System.out.println();
		}
		
		

	}


