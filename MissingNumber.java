// Question 2: Find missing numbers in array -

// Skill Mapping: Basic

// Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

// Sample input: arrNum = {1, 2, 4, 5, 6}

// Output: 3

// Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}

// Output: 4, 7, 9, 12, 13

package assessment;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arrNum[]=new int[n];
		for(int i=0;i<n;i++) {
			arrNum[i]=sc.nextInt();
			
		}
		int a=arrNum[0];
		for(int i=1;i<n;i++) {
			a=a+1;
			if(arrNum[i]==a) {
				continue;
			}
			else {
				int diff=arrNum[i]-a+1;
				if(diff>1) {
					while(diff>1) {
						System.out.print(a+" ");
						a=a+1;
						diff--;
					}
					
				}
				else {
					System.out.print(a+" ");
					a=arrNum[i];
				}
							
			}
			
		}
		

	}

}
