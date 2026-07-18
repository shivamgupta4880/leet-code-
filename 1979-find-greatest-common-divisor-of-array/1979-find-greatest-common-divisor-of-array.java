class Solution {
    public int findGCD(int[] nums) {
        int smallest =Integer.MAX_VALUE,largest =Integer.MIN_VALUE;
       for(int val:nums){
        if(val<smallest)smallest=val;
         if(val>largest)largest=val;

       }
       return GCD(smallest,largest);
        
    }
    public int GCD(int a, int b){
        if(b==0)return a;
        return GCD(b,a%b);
    }
}