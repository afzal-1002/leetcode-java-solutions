import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> total = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (total.containsKey(diff)) {
                return new int[]{total.get(diff), i};
            } else {
                total.put(nums[i], i);
            }
        }

        return new int[]{0, 0};
    }
}