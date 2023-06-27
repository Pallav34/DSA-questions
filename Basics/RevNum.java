//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.


package Basics;

public class RevNum {
    public static int Reverse(int x){
        int num = x; 
        long rev=0; 
        if(num<0) num=-num; 
        while(num>0){ 
            int lastdigit = num%10; 
            num=num/10; rev=(rev*10)+lastdigit; 
        } 
        if(x<0) rev = -rev; 
        if(rev<Integer.MIN_VALUE || rev> Integer.MAX_VALUE) return 0; 
        return (int)rev;
    }
}
