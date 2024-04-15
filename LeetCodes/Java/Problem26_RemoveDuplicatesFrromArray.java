package com.leetcodes.problems;

//Given an integer array nums sorted in non-decreasing order, 
//remove the duplicates in-place such that each unique element appears only once. 
//The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
//The remaining elements of nums are not important as well as the size of nums.
//Return k

//Example 1:
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).

//Example 2:
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).




public class Problem26_RemoveDuplicatesFrromArray {

	    //we just want to return how many elements are present after removing duplicate
	    //taking  an array to which we want to sort

	public  static int removeDuplicates(int[] nums) {
	        int j = 1;
	
	        //j =1 cause we will put non duplicate  element into an array through it
	        //taking i=1 cause we are using it to compare it that elements are duplicate or not
	        
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	
	 //in if we are checking that current element is equal to previous one if its not then 
	//we are putting that number into nums at j index
	               
	            	nums[j] = nums[i];
	                
	//after  putting j will increased by 1
	                j++;
	            }
	        }
   //we will return j as we want only how much elements are present their
	        return j;
	    }
	
	
	
	public static void main(String[] args) {

		
		int arr[]= {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println("The length of elements after removing duplicates are => " +removeDuplicates(arr));
		
		
	}

}
