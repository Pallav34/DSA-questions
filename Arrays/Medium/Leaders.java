package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int max = arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(ans);
    //   Collections.sort(ans, Collections.reverseOrder());
        return ans;
    }
}
