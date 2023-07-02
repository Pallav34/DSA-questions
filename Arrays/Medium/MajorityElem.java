package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

//Majority element >=n/2
public class MajorityElem {
    //Hashmap used. O(n)+o(u)
    public static int MajorBetter(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value+1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()>n/2){
                return e.getKey();
            }
        }
        return -1;
    }

     public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = MajorBetter(arr);
        System.out.println("The majority element is: " + ans);

    }
}
