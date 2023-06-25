// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
package Basics.Pattern;

public class Pattern19 {
    //For upper part
    static void printSquare(int n) {
        int iniSpace = 0;
        for(int i=0;i<n;i++){
            //star
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<iniSpace;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            iniSpace+=2;
            System.out.println();
        }
        iniSpace = 2*n-2;
        for(int i=0;i<n;i++){
            //star
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<iniSpace;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            iniSpace-=2;
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        printSquare(5);
    }
}
