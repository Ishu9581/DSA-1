// Question 3: Find the count of singulars in array -

// Skill Mapping: Expert

// Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.

// Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}

// Output: Count of singular socks = 3

// Explanation : Socks Id - 10: total count 4 => Two pairs of socks - no singular left

// Socks Id - 20: total count 3 => One pair of socks - 1 singular left

// Socks Id - 30: total count 1 => No pair of socks - 1 singular left

// Socks Id - 50: total count 1 => No pair of socks - 1 singular left

// So, Total number of Singular socks = 3

package assessment;

import java.util.Arrays;
import java.util.Scanner;

public class Singulars {
	
	    public static int singularSocks(int[] arrNum) {
	        int singleCount = 0;
	        int[] sockPairs = new int[200]; // Assuming sock IDs range from 1 to 100

	        // Count the occurrences of each sock pair ID
	        for (int num : arrNum) {
	            sockPairs[num]++;
	        }

	        // Find the count of singular socks
	        for (int count : sockPairs) {
	            singleCount += count % 2;
	        }

	        return singleCount;
	    }

	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	try {
	    		int n=sc.nextInt();
	    		int arrNum[]=new int[n];
	    		for(int i=0;i<n;i++) {
	    			arrNum[i]=sc.nextInt();
	    			
	    		}
	    		int result = singularSocks(arrNum);
	    		System.out.println("Count of singular socks = " + result);
	    	}
	    	catch(Exception e) {
	    		System.out.println(e);
	    	}
	    }
	}



