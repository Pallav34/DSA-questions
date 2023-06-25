// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
package Basics.Pattern;

public class Pattern14 {
     static void printSquare(int n) {
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
}
