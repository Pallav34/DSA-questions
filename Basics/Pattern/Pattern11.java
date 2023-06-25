// Input: 5

// Output:
// 1 
// 0 1 
// 1 0 1
// 0 1 0 1 
// 1 0 1 0 1
package Basics.Pattern;

public class Pattern11 {
    static void printSquare(int n) {
        for(int i=0;i<n;i++){
            int start = 0;
            if(i%2==0) start =1;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
    
}
