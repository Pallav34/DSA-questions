package Basics;

public class PrintDivisior {
    public static void printDivisior(int n){
        //i*i<= n is same as sqrt(n) 6*6<=36 7*7<=49
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i!=i) System.out.print(n/i+" ");
            }
        }
    }
    public static void main(String[] args) {
        printDivisior(4);
    }
}
