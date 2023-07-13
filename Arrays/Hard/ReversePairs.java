package Arrays.Hard;

import java.util.ArrayList;

public class ReversePairs {
    static void Merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right= mid+1; 
        while(left<=mid && right <= high){
            //merge
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
           temp.add(arr[right]);
           right++;
        }
        for(int i= low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }
    public static int countpair(int arr[], int low, int mid, int high){
        int count = 0;
        int right = mid+1;
        for(int i = low;i<=mid;i++){
            while(right<=high && (long)arr[i]>(long)2*arr[right]) right++;
            count += (right-(mid+1));
        }
        return count;
    }

    public static int MergeSort(int arr[],  int low, int high){
       int cnt = 0;
        if(low>=high) return cnt;
        int mid = (low+high)/2;
        cnt+=MergeSort(arr, low, mid);
        cnt+=MergeSort(arr, mid+1, high);
        cnt+=countpair(arr,low,mid,high);
        Merge(arr,low,mid,high);
        return cnt;
    }
    public static int reversePairs(int[] nums) {
        return MergeSort(nums,0,nums.length-1);
    }
}
