// E 
// D E 
// C D E 
// B C D E 
// A B C D E 
package Basics.Pattern;

public class Pattern18 {
    static void printSquare(int n) {
        for(int i=0;i<n;i++){
            char ch = (char)('A'+n-i-1);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
}
