// A B C D E 
// A B C D 
// A B C 
// A B 
// A 
package Basics.Pattern;

public class Pattern15 {
    static void printSquare(int n) {
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
}
