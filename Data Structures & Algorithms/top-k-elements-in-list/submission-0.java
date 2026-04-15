class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numMap = new HashMap();
        for (int n : nums) {
            numMap.put(n, numMap.getOrDefault(n, 0) + 1);
        }

        int[] result = new int[k];

        List<Map.Entry<Integer, Integer>> topItems =numMap.entrySet()
                .stream()
                .sorted(
                    Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .toList();
        
        for (int i = 0; i < k; i++) {
            result[i] = topItems.get(i).getKey();
        }

        return result;
    }
}
