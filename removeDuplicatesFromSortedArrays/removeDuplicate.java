package removeDuplicatesFromSortedArrays;

/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such 
that each unique element appears only once. The relative order of the elements should be kept the same. */
public class removeDuplicate {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(obj.removeDuplicates(arr));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;//index for the updated array
        for(int i=0;i<nums.length-1;i++){//traversal through the array

            if(nums[i]!=nums[i+1]){//checking for non-equal adjacent members
                nums[index++]=nums[i+1];//adding that new non-equal member to the updated array using the new index
            }
        }
        return index;
    }
}