package Arrays.Medium;

//Optimal Solution of 1st variety.(Positive and negative are same times)
public class RearrangeArray {
    public static int[] rearrangeArray(int arr[]){
        int pos = 0, neg = 1;
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {-2,3,4,-9,8,-1};
        int ans[]=rearrangeArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
