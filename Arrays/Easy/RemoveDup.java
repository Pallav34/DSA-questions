package Arrays.Easy;

public class RemoveDup {
    public static int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
                
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,2,2,2,9};
        System.out.println(removeDuplicates(arr));
    }
}
