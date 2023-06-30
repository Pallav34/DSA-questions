package Arrays.Easy;

public class MoveZerosEnd {
    public static void moveZeroes(int[] nums) {
        int j = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j = i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1; i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,5,7,8,95,0,4,5,0,5,7};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
