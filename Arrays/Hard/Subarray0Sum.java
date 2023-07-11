package Arrays.Hard;
//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
import java.util.HashMap;

public class Subarray0Sum {
    
 public static int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(sum==0) maxlen = Math.max(maxlen,i+1);
            
            int rem = sum-0;
            if(mpp.containsKey(rem)){
                int value = i-mpp.get(rem);
                maxlen= Math.max(maxlen,value);
            }
            if(!mpp.containsKey(sum)){
                mpp.put(sum,i);
            }
            
            // int value = mpp.getOrDefault(rem,0);
            // maxlen = Math.max(maxlen,i-value);
            // mpp.put(sum,i);
        }
        return maxlen;
    }
}

