package Arrays.Hard;
//https://leetcode.com/problems/3sum/
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sum3 {
    public static List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> ans = new LinkedList<>();
        int n = num.length;
        for(int i=0;i<n;i++){
            if(i>0 && num[i]==num[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = num[i]+num[j]+num[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    ans.add(Arrays.asList(num[i],num[j],num[k]));
                    //ans.add(temp);
                    j++;
                    k--;
                    while(j<k && num[j]==num[j-1]) j++;
                    while(j<k && num[k]==num[k+1]) k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-2,0,1,1,2};
        List < List < Integer >> ans;
        ans = threeSum(arr);
        System.out.println("The triplets are as follows: ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
