// 1
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5
package Basics.Pattern;

public class Pattern3 {
    static void printSquare(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
}
