// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.
package Arrays.Easy;

//optimise sol
public class SingleNum {
    public static int singleNumber(int[] nums) {
       int xor =0;
       for(int i=0;i<nums.length;i++){
           xor=xor^nums[i];
       }
       return xor; 
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,1,5,5};
        System.out.println(singleNumber(arr));
    }
}
