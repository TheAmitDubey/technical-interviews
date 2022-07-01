package src.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode118 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lstOflst = new ArrayList<>();

        if(numRows == 1){
            List<Integer> lst = new ArrayList<>();
            lst.add(1);
            lstOflst.add(lst);

        }else if(numRows == 2){
            List<Integer> lst = new ArrayList<>();
            lst.add(1);
            lstOflst.add(lst);

            lst = new ArrayList<>();
            lst.add(1);
            lst.add(1);
            lstOflst.add(lst);
        }else{
            List<Integer> preLst = new ArrayList<>();
            preLst.add(1);
            lstOflst.add(preLst);

            preLst = new ArrayList<>();
            preLst.add(1);
            preLst.add(1);
            lstOflst.add(preLst);
            int count = 3;

            while(count <=numRows){
                List<Integer> currLst = new ArrayList<>();

                currLst.add(1);
                for(int i=0;i<preLst.size() -1;i++){
                    currLst.add(preLst.get(i) + preLst.get(i+1));
                }
                currLst.add(1);
                lstOflst.add(currLst);
                preLst = currLst;
                count++;
            }

        }

        return lstOflst;
    }
}
