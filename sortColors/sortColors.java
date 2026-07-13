/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same 
color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */

package sortColors;
import java.util.Arrays;
class sortColors{
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={2,0,2,1,1,0};
        obj.sortColor(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    public void sortColor(int[] nums) {
        //variables to store the numbers of 0s, 1s and 2s present in the array
        int zero=0;
        int one=0;
        int two=0;
        for (int num : nums){//for each loop
            //calculating the number of 0s, 1s and 2s in the array
            if (num==0)
                zero++;
            else if(num==1)
                one++;
            else
                two++;
        }
        int i=0;
        //storing each number of colors in sequence
        while(zero-->0)
            nums[i++]=0;
        while(one-->0)
            nums[i++]=1;
        while(two-->0)
            nums[i++]=2;
    }
}