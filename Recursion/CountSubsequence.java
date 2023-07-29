package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountSubsequence {
    public static int subsequence(int ind, List<Integer> ans,int s, int sum, int arr[], int n){
        
        if(ind==n){
            //condition satisfied
            if(s==sum){
            for (Integer i : ans) {
                System.out.print(i+" ");
            }
            System.out.println();
            return 1;
        }
        //condition not satisfied
        return 0;
        }
        
        ans.add(arr[ind]);
        s+=arr[ind];
        int left = subsequence(ind+1, ans,s,sum, arr, n);
        ans.remove(ans.size()-1);
        s-=arr[ind];
        int right = subsequence(ind+1, ans,s,sum, arr, n);

        return left+right;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int count = subsequence(0, new ArrayList<>(), 0, 2, arr, arr.length);
        System.out.println("Count="+count);
    }
}
