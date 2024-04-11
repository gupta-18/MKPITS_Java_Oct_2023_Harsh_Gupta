package com.leetcodes.problems;

public class Problem125_ValidPalindrome {


	    //a method is created where we passing a string parameter
	    public boolean isPalindrome(String s) {
	        //checking if it is empty then it is a palindrome numberit will simply return true
	        if (s.isEmpty()) {
	        	return true;
	        }
	        //if its not empty then start and last are initialised so we can compare for palindrome  letter
	        int start = 0;
	        int last = s.length() - 1;
	        //it will  run till start is less than or equal to last
	        while(start <= last) {
	            //every time initialising currFirst and currLast their start and last pointer for its letter
	        	char currFirst = s.charAt(start);
	        	char currLast = s.charAt(last);
	            //if currfirst and currlast are not a letter and digit it will simply increase its counters 
	        	if (!Character.isLetterOrDigit(currFirst )) {
	        		start++;
	        	} else if(!Character.isLetterOrDigit(currLast)) {
	        		last--;
	        	} else {
	                //it will convert the letter from currfirst and currlast to lowercase
	                //if its not matching return false otherwise again it will increase its counters and go to while loop
	        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
	        			return false;
	        		}
	        		start++;
	        		last--;
	        	}
	        }
	        //if while loop is ends it means it is palindrome number  and it will return true
	        return true;
	    }
	
	
	public static void main(String[] args) {
       String str="Harsh";
       System.out.println(str);
       Problem125_ValidPalindrome obj = new Problem125_ValidPalindrome();
       
       System.out.println("is it a palindrome ?  \n=> " + obj.isPalindrome(str));
       
	}

	

}
