package Arrays.Medium;

//optimal 
public class NextPermutation {
    public static int[] nextPer(int arr[]){
        int n = arr.length;
        int index =-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){
            return rev(arr,0,n-1);
        }
        for (int i = n-1; i > index; i--) {
            if(arr[i]>arr[index]){
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
        return rev(arr, index+1, n-1);
    }
    public static int[] rev(int arr[], int start, int end){
        for(int i=0;start<end;i++){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        arr=nextPer(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
