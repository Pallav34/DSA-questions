package Recursion;

import java.util.ArrayList;
import java.util.List;
//QS: Print All subsequence with Sum K;
public class SubsequenceWithSum {
    public static void subsequence(int ind, List<Integer> ans,int s, int sum, int arr[], int n){
        
        if(ind==n && s==sum){
            for (Integer i : ans) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        if(ind==n) return;
        
        ans.add(arr[ind]);
        s+=arr[ind];
        subsequence(ind+1, ans,s,sum, arr, n);
        ans.remove(ans.size()-1);
        s-=arr[ind];
        subsequence(ind+1, ans,s,sum, arr, n);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        subsequence(0, new ArrayList<>(), 0, 2, arr, arr.length);
    }
}
