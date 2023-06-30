package Arrays.Easy;

import java.util.ArrayList;

public class Intersection {
    public static ArrayList<Integer> findIntersec(int arr1[], int arr2[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i=0, j =0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
  int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
  ArrayList<Integer> Union = findIntersec(arr1, arr2);
  System.out.println("Intersec of arr1 and arr2 is ");
  for (int val: Union)
    System.out.print(val+" ");
}
}
