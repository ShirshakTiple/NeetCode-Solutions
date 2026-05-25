class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        int[] ans = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        // frequency count
        for(int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])) {

                map.put(nums[i], map.get(nums[i]) + 1);

            } else {

                map.put(nums[i], 1);
            }
        }

        // find max frequency k times
        for(int i = 0; i < k; i++) {

            int maxFreq = -1;
            int maxKey = -1;

            for(int key : map.keySet()) {

                if(map.get(key) > maxFreq) {

                    maxFreq = map.get(key);
                    maxKey = key;
                }
            }

            ans[i] = maxKey;

            // remove selected element
            map.remove(maxKey);
        }

        return ans;
    }
}
