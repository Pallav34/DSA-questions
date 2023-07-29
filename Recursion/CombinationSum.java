package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(0,target,new ArrayList<>(),ans,candidates,candidates.length);
        return ans;
    }
    public void combinationSum(int ind, int target, List<Integer>ds, List<List<Integer>> ans, int[]candidates, int n){
        if(ind==n){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[ind]<=target){
            int val=candidates[ind];
            ds.add(val);
            combinationSum(ind,target-val,ds,ans,candidates,n);
            ds.remove(ds.size()-1);
        }
        combinationSum(ind+1,target,ds,ans,candidates,n);
    }
}
