// Input: 5

// Output:
// * 
// * * 
// * * * 
// * * * * 
// * * * * *
// * * * *
// * * *
// * *
// *
package Basics.Pattern;

public class Pattern10 {
    static void printSquare(int n) {
        for(int i=0;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
}
