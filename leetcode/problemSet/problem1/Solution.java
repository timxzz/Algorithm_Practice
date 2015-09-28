import java.util.HashMap;

public class Solution {

    public static void main(String[] args)
    {
	int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
	System.out.println(result[0] + " & " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for(int i = 0; i < nums.length; i++)
            if(map.get(target - nums[i]) != null && map.get(target - nums[i]) != i)
            {
                result[0] = i + 1;
                result[1] = map.get(target - nums[i]) + 1;
                
                if(result[0] > result[1])
                {
                    int temp = result[0];
                    result[0] = result[1];
                    result[1] = temp;
                }
            }
       return result;
    }
}
