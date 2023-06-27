package Basics;

public class Prime {
    public static boolean CheckPrime(int n){
        int cnt = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if(n/i != i) cnt++;
            }
        }
        if(cnt == 2) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(CheckPrime(15));
    }
}

//T.C = O(sqrt(n))