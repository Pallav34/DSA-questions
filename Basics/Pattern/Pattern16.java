// A
// BB
// CCC
// DDDD
// EEEEE
package Basics.Pattern;

public class Pattern16 {
    static void printSquare(int n) {
        for(int i=0;i<n;i++){
            char ch = (char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
}
