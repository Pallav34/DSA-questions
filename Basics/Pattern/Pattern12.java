// Input: 5

// Output:
// 1                 1
// 1 2             2 1
// 1 2 3         3 2 1
// 1 2 3 4     4 3 2 1
// 1 2 3 4 5 5 4 3 2 1
package Basics.Pattern;

public class Pattern12 {
    static void printSquare(int n) {
        int space = 2*(n-1);
        for(int i=1;i<=n;i++){
            //num
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<space;j++){
                System.out.print(" ");
            }
            //num
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
            space=space-2;
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
    
}
