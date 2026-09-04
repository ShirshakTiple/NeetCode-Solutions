class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsSize = nums.length;
        int countZeroes = 0;
        int[] ans = new int[numsSize];
        int productOfAll = 1;

        // first loop to get product of all 
        // except for zeroes
        for(int i = 0 ; i < numsSize ; i++){
            // if zero is there set flag and skip this iteration
            if(nums[i] == 0){
                countZeroes++;
                continue;
            }
            productOfAll = productOfAll * nums[i];
        }

        // special case if there is zero in the list
        if(countZeroes == 0){
            // if no zeroes are present fill all values with productOfAll
            Arrays.fill(ans, productOfAll);
        } else if(countZeroes == 1){
            for(int i = 0; i < numsSize ; i++){
                if(nums[i] == 0){
                    ans[i] = productOfAll;
                } else{
                    ans[i] = 0;
                }
            }
            return ans;
        } else if(countZeroes > 1){
            Arrays.fill(ans, 0);
            return ans;
        }

        for(int i = 0; i < numsSize ; i++){
            ans[i] = ans[i]/nums[i];
        }
        return ans;
    }
}  
