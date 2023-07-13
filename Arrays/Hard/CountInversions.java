package Arrays.Hard;

import java.util.ArrayList;

class CountInversions{
    static long Merge(long arr[], int low, int mid, int high){
        ArrayList<Long> temp = new ArrayList<>();
        int left = low;
        int right= mid+1; 
        long cnt =0;
        while(left<=mid && right <= high){
            //merge
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                cnt+=mid-left+1;
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
        return cnt;
    }
    public static long MergeSort(long arr[],  int low, int high){
       long cnt = 0;
        if(low>=high) return cnt;
        int mid = (low+high)/2;
        cnt+=MergeSort(arr, low, mid);
        cnt+=MergeSort(arr, mid+1, high);
        cnt+=Merge(arr,low,mid,high);
        return cnt;
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return MergeSort(arr,0,(int)N-1);
        
    }
} 

    


