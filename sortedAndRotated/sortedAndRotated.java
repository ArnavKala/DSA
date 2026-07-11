package sortedAndRotated;

/*Check if Array Is Sorted and Rotated
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
 */


/*Solution
As we can see in the examples that when moving left to right if only one element on the left is grater than the 
adjacent right element then the array can be rotated one time to make a sorted array.
While if this happens more than one time or does not happen even once, the array cannot be rotated to sort.
 */
public class sortedAndRotated {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={3,4,5,1,2};
        System.out.println(obj.check(arr));
    }
}

class Solution {
    public boolean check(int[] nums) {
         int count=0;//to check how many time the left element is greater than the adjacent right element
        int n=nums.length;
        for (int i=0; i<n; i++) {
            if (nums[i]>nums[(i+1)%n]) {
                //this checks the condition in a circular way hence the last and first elements are also checked
                count++;
            }
            if (count>1) {
                return false;//if condition happens more than once then return false
            }
        }
        return true;
    }
}
