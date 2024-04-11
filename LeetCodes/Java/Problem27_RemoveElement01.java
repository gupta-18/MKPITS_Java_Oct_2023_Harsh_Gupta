package com.leetcodes.problems;


//Example 1:
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//It does not matter what you leave beyond the returned k (hence they are underscores).

//Example 2:
//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//Note that the five elements can be returned in any order.
//It does not matter what you leave beyond the returned k (hence they are underscores).


public class Problem27_RemoveElement01 {
	
	    //Taking an array nums and value as a parameter
	    public int removeElement(int[] nums, int val) {
	        // taking index so we can add numbers except target values
	        int index = 0;
	        for (int i = 0; i < nums.length; i++) {
	            //checks if target value is matching to current if not then its adding to the nums[index]
	            if (nums[i] != val) {
	                nums[index] = nums[i];
	                index++;
	            }
	        }
	        return index;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,4,2,0,4,5};
		int target = 4;
		Problem27_RemoveElement01 obj = new Problem27_RemoveElement01();
		System.out.println("Index of an array after removing target value is\n=> " + obj.removeElement(arr, target));

	}

}
