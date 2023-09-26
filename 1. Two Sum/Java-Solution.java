class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length - 1;

        while (length > 0) {
            for (int i = 0; i < length; i++) {
                if (nums[i] + nums[length] == target) {
                    return new int[] { i, length };
                }
            }
            length--;
        }
        return new int[0];
    }
}