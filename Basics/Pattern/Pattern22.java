// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444
package Basics.Pattern;

public class Pattern22 {
    static void printSquare(int n) {
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left=j;
                int right = (2*n-2)-j;
                int bottm = (2*n-2)-i;
                System.out.print(n-(Math.min(Math.min(top,left),Math.min(right,bottm))));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(4);
}
}