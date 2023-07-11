package Arrays.Hard;

//https://leetcode.com/problems/4sum/
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sum4 {
    public static List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> ans = new LinkedList<>();
        int n = num.length;
        Arrays.sort(num);
        for(int i=0;i<n;i++){
            if(i>0 && num[i-1]==num[i]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && num[j-1]==num[j]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = num[i]+num[j]+num[k]+num[l];
                    if(sum<target) k++;
                    else if(sum>target) l--;
                    else{
                        //List<Integer> temp = new LinkedList<>();
                        ans.add(Arrays.asList(num[i],num[j],num[k],num[l]));
                        k++;l--;
                        while(k<l && num[k]==num[k-1]) k++;
                        while(k<l && num[l] == num[l+1]) l--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,1,2,2};
        int target = 0;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
