class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>=10) {
                
            }else {
                if(i%10==nums[i]){
                    return i;
                }
            }
        }
        return -1;   
    }
}