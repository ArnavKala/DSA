package removeElement;

/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then return the number of elements in nums which are not
equal to val.*/

public class removeElement {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={0,1,2,2,3,0,4,2};
        System.out.println(obj.removeElement(arr,2));
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int size=nums.length;
        int i=0;//variable for taking index of the array
        while(i<size){//looping condition
            if(nums[i]==val){
                /*when the value in array is equal to the value to be removed. move that value to the end 
                of the array and then decrease the size of array*/
                nums[i]=nums[size-1];
                size--;
            }
            else{//when values are not equal, traverse the array as normal
                i++;
            }
        }
        return size;
    }
}