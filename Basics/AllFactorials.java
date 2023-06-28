//Find all factorial numbers less than or equal to N
package Basics;

import java.util.ArrayList;

public class AllFactorials {
    static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> ans = new ArrayList<>();
        long factorial = 1;
        long i=1;
        while(factorial<=N){
            ans.add(factorial);
            i++;
            factorial = fact(i);
        }
        return ans;
        
    }
    static Long fact(long N){
        if(N==1){
            return (long)1;
        }
        return N*fact(N-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialNumbers(15));
    }
}
