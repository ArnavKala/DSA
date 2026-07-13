/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up 
to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
  */

package twoSum;
import java.util.Arrays;
public class twoSum {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={2,7,11,15};
        int targ=9;
        System.out.println(Arrays.toString(obj.twoSum(arr, targ)));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];//array to store the numbers that form the sum
        //finding out sum of each element with other element without repeating
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                //if sum is equal to the target value then store it in the array
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}