package Arrays.Medium;
// https://leetcode.com/problems/rotate-image/
public class RotateMatrix {
    public static void rotate(int [][] arr){
        //transpose 
        int n = arr.length;
        for (int i = 0; i <=n-2; i++) {
            for (int j = i+1; j <=n-1; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = arr[i][j];
                arr[i][j]= arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }
    }
    public static void main(String args[]) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
