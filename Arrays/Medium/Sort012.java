package Arrays.Medium;

//Dutch national flag algo . o(n)
public class Sort012 {
     public static void Sort(int arr[]){
        int n = arr.length;
        int low=0, mid=0, high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]= temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        
     }
     public static void main(String[] args) {
        int arr[] = {1,2,0,2,1,0,0,2,0};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
     }
}
