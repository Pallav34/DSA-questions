package Arrays.Medium;

import java.util.HashSet;

//returns length of the longest consecutive sequence
public class LongestConSequence {
    public static int longConsecutive(int[]arr){
        HashSet<Integer> temp = new HashSet<>();
        for(int nums: arr){
            temp.add(nums);
        }
        int maxlength = 0;
        for(Integer nums:temp){
            if(!temp.contains(nums-1)){
                int currlength = 1;
                int currnum = nums;
                while(temp.contains(currnum+1)){
                    currlength++;
                    currnum++;
                }
                maxlength = Math.max(maxlength, currlength);
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        int arr[]={100,200,1,2,3,4};
        System.out.println(longConsecutive(arr));
    }
}
