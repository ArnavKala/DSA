/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero 
elements.
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/

package MoveZerosToEnd;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={0,1,0,3,12};
        obj.movezeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
class Solution {
    public void movezeroes(int[] nums) {
        int j=0;//to store the index of where the non-zero elements need to go
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=0){
                /*when the element is not zero, it will swap its position so that it can get to the non-zero index
                  if the element is zero, it will keep on swapping until it is at the end*/
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}