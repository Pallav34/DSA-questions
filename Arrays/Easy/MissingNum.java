package Arrays.Easy;

public class MissingNum {
//Optimal 1 with summation
  public static int missingNumber(int[] nums) {
        int n = nums.length+1;
        long sum1 = (n*(n+1))/2;
        long sum2 =0;
        for(int i=0;i<n-1;i++){
            sum2+=nums[i];
        }
        return (int)(sum1-sum2);
    }
//Optimal 2 with xor
  public static int missingNumberXor(int[] nums) {
    int n = nums.length;
        int xor1 = 0, xor2=0;
        for(int i=0;i<n; i++){
            xor2=xor2^nums[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^n+1;
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumberXor(arr));
    }
}
//Both have a time complexity O(n). But xor has a silghtly better space complexity