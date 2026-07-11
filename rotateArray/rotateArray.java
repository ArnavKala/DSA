package rotateArray;

import java.util.Arrays;

/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

class rotateArray{
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(obj.rotate(arr, 3)));
        //arrays cannot be directly printed in java,they need to be converted to string first
    }
}
class Solution {
    public int[] rotate(int[] nums, int k) {
        int l=nums.length;//length of the array
        k=k%l;//to convert k value so that it stays within the length of array
        int temp[]=new int[l];//temp array to store the coverted array
        for (int i=0; i<l; i++) {
            temp[(i+k) % l]=nums[i];
            //the temp array will start filling from the kth position of the temporary array, hence rotating the aaray 
        }
        for (int i=0; i<l; i++) {
            nums[i] = temp[i];//storing the converted value in the orignal
        }
        return nums;
    }
}