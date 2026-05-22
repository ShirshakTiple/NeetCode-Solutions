class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            int diff = target - nums[i];

            // if this exists in hash map take that value and nums[i] 
            // that is your answer
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }

            // else add the nums[i] in the hashMap
            map.put(nums[i], i);
        }
         return new int[] {};
    }
}
