package src.leetcode;

import java.util.HashSet;

public class Leetcode36 {
    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];

                if(ch == '.'){
                    continue;
                }

                if(!rows[i].add(ch)){
                    return false;
                }

                if(!cols[j].add(ch)){
                    return false;
                }

                int idx = (i/3) * 3 + (j/3);

                if(!boxes[idx].add(ch)){
                    return false;
                }
            }
        }

        return true;
    }
}
