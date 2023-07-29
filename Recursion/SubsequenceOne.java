package Recursion;

import java.util.ArrayList;
import java.util.List;

//Print only one Subsequence with Sum k;
public class SubsequenceOne {
    public static boolean subsequence(int ind, List<Integer> ans,int s, int sum, int arr[], int n){
        
        if(ind==n){
            //condition satisfied
            if(s==sum){
            for (Integer i : ans) {
                System.out.print(i+" ");
            }
            System.out.println();
            return true;
        }
        //condition not satisfied
        return false;
        }
        
        ans.add(arr[ind]);
        s+=arr[ind];
        if(subsequence(ind+1, ans,s,sum, arr, n)==true) return true;
        ans.remove(ans.size()-1);
        s-=arr[ind];
        if(subsequence(ind+1, ans,s,sum, arr, n)==true) return true;

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        subsequence(0, new ArrayList<>(), 0, 2, arr, arr.length);
    }
}
