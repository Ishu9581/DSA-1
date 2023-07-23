// Question 4: Java Subarray

// Skill Mapping: Basic

// Description: Solve the HackerRank Problem given as a link below -

// https://www.hackerrank.com/challenges/java-negative-subarray/problem

package assessment;
import java .util.*;

public class JavaSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        int count = 0;
        for(int i = 0;i<n;i++){
            int total = arr[i];
            if (total < 0){
                count += 1;
            }
            for(int j = i+1;j<n;j++){
                total += arr[j];
                if (total < 0){
                    count += 1;
                }
            }
        }
        System.out.println(count);

	}

}
