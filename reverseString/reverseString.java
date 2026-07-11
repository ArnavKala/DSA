package reverseString;
class Solution {
    public void reversestring(char[] s) {
        int l=s.length;//length of the string
        int left=0;//first index of the string
        int right=l-1;//last index of the string
        while(left<=right){//looping condition - left index must not be less than right index
            //function to exchange the characters
            char z=s[left];
            s[left]=s[right];
            s[right]=z;
            left++;
            right--;
        }
        System.out.print(s);
    }
}

class reverseString{
    public static void main(String[] args) {
        Solution obj=new Solution();
        char s[]={'h','e','l','l','o'};
        obj.reversestring(s);
    }
}