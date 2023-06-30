package Arrays.Easy;

//Optimal Solution
public class LeftRotate {
    public static int[] LeftRotateByD(int arr[], int n, int d){
        reverse(arr, 0,d-1);
        reverse(arr, d,n-1);
        reverse(arr, 0, n-1);
        return arr;
    }
    public static int[] RightRotationByD(int arr[], int n, int d){
        reverse(arr, 0, n-d-1);
        reverse(arr, n-d, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }
    public static void reverse(int arr[],int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        //Wrong Swap function
        // for(int i=start;i<=end/2;i++){
        //     int temp = arr[i];
        //     arr[i]=arr[end-i-1];
        //     arr[end-i-1]=temp;
        // }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        arr=LeftRotateByD(arr,7,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr=RightRotationByD(arr,7,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
