class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        for(int i = 0; i < nums.length; i++) {
            int currentCount = 0;
            while(i < nums.length && nums[i] == 1) {
                currentCount++;
                i++;
            }
           maxOnes = Math.max(maxOnes, currentCount); 
        }
        return maxOnes;
    }
}