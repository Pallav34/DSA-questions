package Basics;

public class ArmstrongNum {
    static String armstrongNumber(int n){
        // code here
        int dup =n;
        int sum = 0;
        while(n>0){
            int lastdig = n%10;
            n=n/10;
            sum += (lastdig * lastdig * lastdig);
        }
        if(sum==dup){
            return "Yes";
        }
        return "No";
    }
}
