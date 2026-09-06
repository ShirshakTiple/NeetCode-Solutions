class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }

        for(int num2 : hashSet){
            if(!hashSet.contains(num2-1)){
                int currentNum = num2;
                int currentLength = 1;

                while(hashSet.contains(currentNum+1)){
                    currentNum++;
                    currentLength++;
                }

                longest = Math.max(currentLength, longest);
            }
        }
        return longest;
    }
}
