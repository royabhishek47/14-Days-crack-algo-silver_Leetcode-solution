//Minimum size sub-array sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        if(nums == null){
            return 0;
        }
        
        int p1 = 0 , p2 = 0;
        
        int sum = 0;
        int length = Integer.MAX_VALUE;
        
        while(p2 < nums.length){
            
            sum += nums[p2];
            
            if(sum >= target){
                while(sum >= target){
                    sum -= nums[p1];
                    p1++;
                }
                length = Math.min(length,p2-p1+2);
            }
            
            p2++;
        }
        
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}