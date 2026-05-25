class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // ---- optimized solution ----
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

        // priority queue 
        // larger second value to be first
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]);

        // form pair and add it in the priority queue
        for(int key : map.keySet()){
            pq.add(new int[]{key, map.get(key)});
        }

        for(int i = 0; i<k ; i++){
            ans[i] = pq.poll()[0];
        }

        return ans;
    }
}
