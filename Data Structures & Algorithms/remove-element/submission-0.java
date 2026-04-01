class Solution {
    public int removeElement(int[] nums, int val) {
        int nonZeroIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[nonZeroIndex++] = nums[i];
            }
        }
        return nonZeroIndex;
    }
}