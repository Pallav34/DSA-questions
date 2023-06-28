package Basics;

public class Reverse {
    public static int[] reverseArray(int[]arr, int i){
        int n = arr.length;
        if(i>=n/2){
            return arr;
        }
        //swap arr[i] and arr[n-i-1]
        int temp = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        return reverseArray(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={7,89,5,142,6};
        arr=reverseArray(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
