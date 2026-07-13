/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Input: nums = [2,2,1]
Output: 1
 */

package singleNo;
public class singleNo {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={2,2,1};
        System.out.println(obj.singleNumber(arr));
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int frequency=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    frequency++;
                }
            }
            if(frequency!=2){
                return nums[i];
            }
            frequency=0;
        }
        return -1;
    }
}