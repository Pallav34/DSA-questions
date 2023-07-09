package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/majority-element-ii/
public class MajorityNby3 {
    public static List<Integer> majorityElement(int[] nums) {
       int cnt1=0, cnt2=0;
       int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
       List<Integer> ans = new ArrayList<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
           if(cnt1==0 && ele2!=nums[i]){
               cnt1=1;
               ele1=nums[i];
           }
           else if(cnt2==0 && ele1!=nums[i]){
               cnt2=1;
               ele2=nums[i];
           }
           else if(nums[i]==ele1) cnt1++;
           else if(nums[i]==ele2) cnt2++;
           else{
               cnt1--; cnt2--;
           }
       }
       cnt1 = 0; cnt2 =0;
       int mini = (int)(n/3)+1;
       for(int i=0;i<n;i++){
           if(ele1==nums[i]) cnt1++;
           else if(ele2==nums[i]) cnt2++;
       }
       if(cnt1>=mini) ans.add(ele1);
       if(cnt2>=mini) ans.add(ele2);
       return ans;
    }
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
