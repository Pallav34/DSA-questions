package Extra;

import java.util.Stack;

//problem link: https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
public class NextGreater {
    public static int[] findGreater(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for (int i = n-1; i >=0; i--) {
            while(!st.empty()&& st.peek()<=arr[i]){
                st.pop();
            }
            if(st.empty()) ans[i] = -1;
            else if(!st.empty() && st.peek()>arr[i]) ans[i] = st.peek();

            st.push(arr[i]);
        }
        return ans;
    }
}
