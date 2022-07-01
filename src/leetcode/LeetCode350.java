package src.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int a : nums1){
            int count = 0;
            if(map.containsKey(a)){
                count = map.get(a);
            }
            count++;
            map.put(a, count);
        }

        List<Integer> lst = new ArrayList<>();

        for(int a : nums2){
            int count = 0;

            if(map.containsKey(a)){
                count = map.get(a);

                if(count > 0){
                    count--;
                    map.put(a, count);
                    lst.add(a);
                }
            }
        }

        int[] arr = new int[lst.size()];

        for(int i=0;i<lst.size();i++){
            arr[i] = lst.get(i);
        }

        return arr;
    }
}
