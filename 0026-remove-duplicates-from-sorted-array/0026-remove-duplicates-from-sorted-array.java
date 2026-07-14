class Solution {
    public int removeDuplicates(int[] nums) {
        int idex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[idex]){
                idex++;
                nums[idex]=nums[i];
                
            }
        }
        return idex
        +1;
        
    }
}