package Arrays.Hard;
//https://www.codingninjas.com/studio/problems/subarrays-with-xor-k_6826258?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
import java.util.HashMap;

public class XorwithK {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int cnt = 0;
        int xr = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        for(int i=0;i<a.length;i++){
            xr=xr^a[i];
            int x = xr^b;
            cnt += mpp.getOrDefault(x, 0);
            mpp.put(xr, mpp.getOrDefault(xr,0)+1);
        }
        return cnt;
    }
}
