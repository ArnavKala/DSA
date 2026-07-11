/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that 
is missing from the array.
Input: nums = [3,0,1]
Output: 2
 */

package MissingNo;
public class missingNo {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={3,0,1};
        System.out.println(obj.missingNumber(arr));
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        for (int i=0; i<=nums.length; i++) {//i is the value of range elements
            boolean found=false;//a flag to check if the range number is found or not
            for (int j=0; j<nums.length; j++) {//j is used as index of array
                if (nums[j]==i) {//if the range element is found in the array, flag=true
                    found=true;
                    break;
                }
            }
            if (!found) {//if the flag is false for any i value, return that
                return i;
            }
        }
        return -1;
    }
}