// Question 1: Cumulative Multiple of an Array with exception handling

// Skill Mapping: Basic

// Description: Consider an Array with N number of integers.

// Task 1- WAP in Java to calculate cumulative multiple at each index.

// Task 2 – Push the result into the same Array and Print.

// Task 3 - Handle the exceptions in program

// Sample input: arrNum = [5, 3, 4, 2, 0, 8]

// Output:- arrNum = [5, 15, 60, 120, 0, 0]

package assessment;
import java.util.*;

public class CummulativeArray {
	public static int [] cumMultiple(int [] arrNum) {
		int[] a=new int[arrNum.length];
//		try {
//			
			a[0]=arrNum[0];
			int product=a[0];
			for(int i=1;i<arrNum.length;i++) {
				product=product*arrNum[i];
				a[i]=product;
		
			}
	
//		}
//		catch(Exception e) {
//			System.out.println("ArrayIndexOutOfBounds");
//			
//		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		try {
			int n=sc.nextInt();
		
			int arrNum[]=new int[n];
			for(int i=0;i<n;i++) {
				arrNum[i]=sc.nextInt();
			}
		
			arrNum=cumMultiple(arrNum);
			for(int i=0;i<n;i++) {
				System.out.print(arrNum[i]+" ");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
