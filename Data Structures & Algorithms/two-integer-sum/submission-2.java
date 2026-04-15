class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] {0, 1};
        }

        HashMap<Integer, Integer> numMap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (numMap.containsKey(diff) && numMap.get(diff) != i) {
                return new int[] {i, numMap.get(diff)};
            }
        }

        return null;
    }
}
