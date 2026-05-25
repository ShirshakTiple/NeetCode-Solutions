class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // --- optmized solution (bucket sort) ----

        //Frequency map
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        // Creating Buckets
        // max size of  bucket will be : size of array 
        List<Integer>[] bucket = new ArrayList[nums.length+1];

        // filling buckets
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // collect answer
        int[] ans = new int[k];
        int index = 0;
        
        // traverse from the highest frequency
        for(int i = bucket.length - 1 ; i >= 0 ; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    ans[index] = num;
                    index++;
                    if(index == k) return ans;
                } 
            }
        }
        return ans;
    }
}
