// Question 7: Longest Palindromic Substring

// Skill Mapping: Medium

// Description: Solve the LeetCode Problem given as a link below -

// https://leetcode.com/problems/longest-palindromic-substring/


package assessment;
import java.util.*;

public class LongestPalindrome {
	    public String longestPalindrome(String s) {
	        if (s == null || s.length() < 1) {
	            return "";
	        }

	        int start = 0;
	        int maxLength = 1; 

	        for (int i = 0; i < s.length(); i++) {
	            int len1 = search(s, i, i); 
	            int len2 = search(s, i, i + 1); 
	            int len = Math.max(len1, len2);

	            if (len > maxLength) {
	                maxLength = len;
	                start = i - (len - 1) / 2;
	            }
	        }

	        return s.substring(start, start + maxLength);
	    }

	    private int search(String s, int left, int right) {
	        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	            left--;
	            right++;
	        }
	        return right - left - 1;
	    }

	    public static void main(String[] args) {
	    	LongestPalindrome lp = new LongestPalindrome();
	    	Scanner sc=new Scanner(System.in);
	        String s1 = sc.next();
	        System.out.println("String: " + s1);
	        System.out.println("Longest Palindromic Substring: " + lp.longestPalindrome(s1));

	       
	    }
	}
