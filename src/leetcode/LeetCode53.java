package src.leetcode;

public class LeetCode53 {
    public static void main(String[] args) {
        //Test you input here
    }

    public int maxSubArray(int[] nums) {
        int maxSumSofar = nums[0];
        int maxSumEndingHere = nums[0];

        for(int i=1;i<nums.length;i++){
            maxSumEndingHere = Math.max(maxSumEndingHere+nums[i], nums[i]);

            if(maxSumSofar < maxSumEndingHere){
                maxSumSofar = maxSumEndingHere;
            }
        }

        return maxSumSofar;

    }
}
