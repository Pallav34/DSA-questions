package Recursion;

import java.util.ArrayList;
import java.util.List;
//QS: Print all the subsequences of an array
public class Subsequence {
    public static void subsequence(int ind, List<Integer> ans, int arr[], int n){
        if(ind==n){
            for (Integer i : ans) {
                System.out.print(i+" ");
            }
            if(ans.size()==0) System.out.println("{}");
            System.out.println();
            return;
        }
        
        ans.add(arr[ind]);
        subsequence(ind+1, ans, arr, n);
        ans.remove(ans.size()-1);
        subsequence(ind+1, ans, arr, n);
    }
    public static void main(String[] args) {
        int [] arr = {3,1,2};
        int n = 3;
        List<Integer> ans = new ArrayList<>();
        subsequence(0, ans, arr, n);
    }
}
