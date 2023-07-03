package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

//Majority element >=n/2
public class MajorityElem {
    //Hashmap used. We are using a map data structure. Insertion in the map takes logN time. And we are doing it for N elements. So, it results in the first term O(N*logN). The second O(N) is for checking which element occurs more than floor(N/2) times. If we use unordered_map instead, the first term will be O(N) for the best and average case and for the worst case, it will be O(N2).
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
    //Optimal approach. Moors Voting algo
    public static int majorOptimal(int arr[]){
        int count = 0;
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            int currElem = arr[i];
            if(count == 0){element=currElem; count++;}
            else if(currElem==element) count++;
            else if(currElem!=element) count--;
        }
        return element;
    }

     public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = MajorBetter(arr);
        System.out.println("The majority element is: " + ans);
        int ans2 = majorOptimal(arr);
        System.out.println("The majority element is: " + ans2);

    }
}
