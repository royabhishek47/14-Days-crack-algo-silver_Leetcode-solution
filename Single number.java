//Single number

class Solution {
   public int singleNumber(int[] nums) {
        
        int size = nums.length;
        // Isolate the first number in the array
        int result = nums[0];
        
        
        for (int i = 1; i < size; i++)
            
            result = result ^ nums[i];
            
        // Return the "true" integer that does not appear twice
        return result;
    }
}