
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
package Basics.Pattern;

public class Pattern20 {
    static void printSquare(int n) {
        int space = 2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            
            if(i>=n) space+=2;
            else space-=2;
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
}
