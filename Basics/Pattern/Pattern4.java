// 1
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5
package Basics.Pattern;

public class Pattern4 {
    static void printSquare(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
}
