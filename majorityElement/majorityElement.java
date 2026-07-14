/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element 
always exists in the array. 
Input: nums = [3,2,3]
Output: 3
*/

package majorityElement;
import java.util.Scanner;
class majorityElement{
    public static void main(String[] args) {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int length = sc.nextInt();
        int arr[]=new int[length];
        System.out.println("Enter array elements:");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("OUTPUT: "+obj.majority(arr));
    }
}
class Solution {
    public int majority(int[] nums) {
        int singleCount=0, maxCount=0;
        //variables to count the occurances of each element(singleCount) and to store the max occurances in the array
        //loop to find the occurances of each element
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    singleCount++;
                }
            }
            //to update the element having max occurances
            maxCount=Math.max(singleCount,maxCount);
            singleCount=0;
            //condition of the problem
            if(maxCount>=nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}