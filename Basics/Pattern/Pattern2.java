// Input: 5

// Output:
// * 
// * * 
// * * * 
// * * * * 
// * * * * *
package Basics.Pattern;

public class Pattern2 {
    static void printSquare(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
    
}
