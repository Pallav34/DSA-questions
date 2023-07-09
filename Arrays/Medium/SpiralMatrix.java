package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        // m*n matrix
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0, left = 0, right = m - 1, btm = n - 1;
        while (top <= btm && top <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= btm; i++) {
                ans.add(matrix[i][right]);// e
            }
            right--;
            if (top <= btm) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[btm][i]);
                }
                btm--;
            }
            if (left <= right) {
                for (int i = btm; i >= top; i--) {
                    ans.add(matrix[i][left]);// e
                }
                left++;
            }
        }
        return ans;
    }
}
