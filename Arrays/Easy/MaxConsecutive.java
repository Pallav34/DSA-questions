package Arrays.Easy;

public class MaxConsecutive {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int curr=0, max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr++;
                if(curr>max){
                    max=curr;
                }
            }else{
                curr=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
