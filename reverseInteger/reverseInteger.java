package reverseInteger;
public class reverseInteger {
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.reverse(10111));
    }
}
class Solution {
    public int reverse(int x) {
        int reversed = 0;//variable to store the reversed string
        while(x!=0){//looping condition
            int ld=x%10;//to store the last digit of the number
            x=x/10;//to remove the last digit from the number

            //checking conditon so that reversing the number does not cause the value to go outside the signed 32-bit integer range
            if (reversed >Integer.MAX_VALUE/10 || reversed < Integer.MIN_VALUE/10 ){
                return 0;
            }
            reversed = reversed*10 + ld;//to form the reversed number
        }
        return reversed;
    }
}