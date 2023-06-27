// You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

// Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

// 0 <= j <= nums[i] and
// i + j < n
// Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
package Basics;

public class Jump2 {
    public static int jump(int[] nums) {
        int farthest = 0;
        int jumps = 0;
        int current = 0;
        for(int i=0;i<nums.length;i++){
            farthest = Math.max(farthest,nums[i]+i);
            if(i==current && current!=nums.length-1){
                current = farthest;
                jumps++;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
