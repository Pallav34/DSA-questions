// Given a number N. Count the number of digits in N which evenly divides N.

// Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
package Basics;
public class CountDigits{
    static int evenlyDivides(int N){
        // code here
        int length = String.valueOf(N).length();
        int count = 0;
        int num =N;
        for (int i=length-1;i>=0;i--){
            int rem = num%10;
            if(rem!=0 && N%rem == 0){
                count++;
            }
            num = num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(evenlyDivides(120));
    }
}
