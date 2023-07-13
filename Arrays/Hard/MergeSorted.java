package Arrays.Hard;

import java.util.Arrays;
//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
public class MergeSorted {
    //Function to merge the arrays. Optimal soluiton 1
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i = n-1;
        int j = 0;
        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                //swap
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--; j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    //Optimal 2
    
    private static void Swap(long arr1[], long arr2[], int ind1, int ind2){
        if(arr1[ind1]>arr2[ind2]){
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }
    //Function to merge the arrays.
    public static void merge2(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int len = n+m;
        int gap = (len/2) + (len%2);
        while(gap>0){
            int left = 0, right= left+gap;
            while(right<len){
                //arr1 arr2
                if(left<n && right >=n){
                    Swap(arr1,arr2,left,right-n);
                }
                //arr2 both
                else if(left>=n){
                    Swap(arr2,arr2,left-n,right-n);
                }
                else{
                    Swap(arr1,arr1,left,right);
                }
                left++;
                right++;
            }
            if(gap == 1) break;
            gap=(gap/2)+(gap%2);
        }
}
}




