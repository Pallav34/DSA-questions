package Basics;

public class SumOfN {
    static long sumOfSeries(long N) {
        // code here
        if(N==0){
            return 0;
        }
        return N*N*N + sumOfSeries(N-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
}
