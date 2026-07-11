class Solution {
    public boolean isPalindrome(int x) {
        int reversed=0;//variable to store the reversed number
        int copy=x;//variable to store the copy of the orignal number so that it can be checked later

        //loop to check whether the number is negative(eg: -121, reversed will be 121-, hence not a palindrome)
        if(x<0){
            return false;
        }

        while(x!=0){//looping condition
            int ld=x%10;//to get the last digit of the given number
            reversed=reversed*10 + ld;//to add the last digit to the previously obtained last digits
            x=x/10;//to remove the last digit from the number
        }

        //checking the reversed and the orignal number for equivalence
        if(reversed == copy){
            return true;
        }else{
            return false;
        }
    }
}

public class palindrome{
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.isPalindrome(101));
    }
}