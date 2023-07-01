package Arrays.Medium;

import java.util.HashMap;

//optimal solution O(nlogn)
public class TwoSum {
    public static int[] sumFind(int a[], int sum){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int ans[]={0,0};
        for(int i=0;i<a.length;i++){
            int num = a[i];
            int remaining = sum-num;
            if(mpp.containsKey(remaining)){
                ans[0]=mpp.get(remaining);
                ans[1] = i;
                return ans;
            }
            mpp.put(a[i], i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,5,7,9};
        int ans[] = sumFind(arr, 11);
        for(int i=0;i<2;i++){
            System.out.println(ans[i]);
        }
    } 
}
