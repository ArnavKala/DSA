/*Given a binary array nums, return the maximum number of consecutive 1's in the array.
Input: nums = [1,1,0,1,1,1]
Output: 3
 */

package maxConsecutiveOnes;
public class maxConsecutiveOnes {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={1,1,0,1,1,1};
        System.out.println(obj.findMaxConsecutiveOnes(arr));
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0;//to count the current consecutive number of ones
        int max=0;//to store the highest number of consecutive ones
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                ones++;//count number of consecutive ones
                max=Math.max(max, ones);//update the value of max if new value of ones is greater than prev max
            }else{
                ones=0;//reassign the default value to ones when a zero is encountered
            }
        }
        return max;
    }
}