package Arrays.Easy;

public class SecLargeSmall {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int seclargest = findSlargest(a,  n);
        int secsmallest = findSsmallest(a, n);
        int ans[] = {seclargest,secsmallest};
        return ans;
    }
    public static int findSlargest(int[]arr, int n){
        int largest = arr[0];
        int secL = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secL = largest;
                largest = arr[i];
            }
            //imp example 1,4,7,7,7,5
            else if(arr[i]<largest && arr[i]> secL ){
                secL = arr[i];
            }
        }
        return secL;
    }
    public static int findSsmallest (int[]arr, int n){
        int smallest = arr[0];
        int secsmall = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secsmall = smallest;
                smallest = arr[i];
            }
            
            else if(arr[i]!=smallest && arr[i]< secsmall ){
                secsmall = arr[i];
            }
        }
        return secsmall;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5};
        int ans[]= getSecondOrderElements(6, arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
