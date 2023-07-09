package Arrays.Medium;
//Optimal 
public class SetMatrix0 {
     public static void setZeroes(int[][] matrix) {
        //int row[]=new int[n] matrix[...][0]
        //int col[]=new int[m] matrix[0][...]
        int col0=1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    //mark ith row
                    matrix[i][0]=0;
                    //mark jth col
                    if(j!=0)
                     matrix[0][j]=0;
                    else
                    col0=0;
                }
            }
        }
        //traversal
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]!=0){
                    //check for col and rows
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<matrix[0].length;j++) matrix[0][j]=0;
        }
        if(col0==0){
            for(int i=0;i<matrix.length;i++) matrix[i][0]=0;
        }
    }
}
