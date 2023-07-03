package Arrays.Medium;

//Kadans ALgo
public class MaxSubarraySum {
    public static int maxSubSum(int arr[]){
        int max= Integer.MIN_VALUE;
        int sum = 0;
        int ansStart =0, ansEnd = 0, start = 0;
        for (int i = 0; i < arr.length; i++) {
            //for printing 
            if(sum==0){
                start = i;
            }
            sum+=arr[i];
            if(sum>max){
                max= sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0){
                sum=0;
            }
        }
        //printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        return max;
    }
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        long maxSum = maxSubSum(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}
