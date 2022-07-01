package src.leetcode;

public class Leetcode566 {
    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int column = mat[0].length;

        if((row*column) != (r*c)){
            return mat;
        }

        int row_num =0;
        int col_num =0;

        int[][] output_arr = new int[r][c];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                output_arr[row_num][col_num] = mat[i][j];

                col_num++;

                if(col_num == c){
                    col_num = 0;
                    row_num++;
                }
            }
        }

        return output_arr;
    }
}
