class Solution {
    public int removeDuplicates(int[] nums) {
        int idex=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i - 1] != nums[i]){
                nums[idex]=nums[i];
                idex++;
            }
        }
        return idex;
        
    }
}