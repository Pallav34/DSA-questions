package Arrays.Hard;

public class MissingReapeating {
    
    int[] findTwoElement(int arr[], int n) {
        // code here
        long sn = (n*(n+1))/2; //sum of first n natural
        long s2n = (n*(n+1)*(2*n+1))/6; //sum of squares
        long s=0, s2=0; // sum using for loops
        for(int i=0;i<n;i++){
            s+=arr[i];
            s2+= (arr[i] * arr[i]);
        }
        long val1 = sn-s; //x-y 
        long val2 = s2n-s2; //x^2 - y^2
        val2= val2/(val1); //x+y
        
        int repeating = (int)((val1+val2)/2);
        int missing = (int)(val2-repeating);
        
        int ans[] = {missing,repeating};
        return ans;
    }
}

