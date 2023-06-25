//     *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****  
//    ***   
//     *  
package Basics.Pattern;

public class Pattern9 {
    static void printSquare(int n) {
        //1st part pattern7
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
            
        }
        //2nd part pat 8
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*n - (2*i+1);j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
    
}
