public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        firstloop:
        for(int i = 0; i < nums.length; i++)
            for(int j = i + 1; j < nums.length; j++)
                if(nums[i] + nums[j] == target)
                {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break firstloop;
                }
        return result;
    }
}
