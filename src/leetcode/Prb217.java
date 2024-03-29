package src.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Prb217 {

    public static void main(String[] args) {
        //Check you input here
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }

        return false;
    }
}
