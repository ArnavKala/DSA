package validPalindrome;

public class validPalindrome {
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.isPalindrome("race a car"));
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;//first index of the string
        int right = s.length()-1;//last index of the string

        while (left<right) {

            //condition to find the characters from the left side of the string 
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            //condition to find the characters from the right side of the string 
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            //checking both the left and the right characters for equivalence
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
