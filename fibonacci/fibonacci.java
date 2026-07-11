package fibonacci;
public class fibonacci {
    public static void main(String[] args) {
        Solution obj=new Solution();
        System.out.println(obj.fib(4));
    }
    
}

class Solution {
    public int fib(int n) {
        if (n<=1){
            return n;
        }
        int a=0, b=1;//first 2 elements of fibonacci series
        for (int i=2; i<=n; i++){
            int c=a+b;//calculation to find the next element in the series
            //incrementing  the series 
            a=b;
            b=c;
        }
        return b;
    }
}