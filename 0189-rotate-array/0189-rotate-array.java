class Solution {
    public static void rotate(int[] num, int k) {
       
        int n=num.length;
         k%=n;
    
         reverse(num, 0, n - 1);
        reverse(num, 0 , k - 1);
        reverse(num, k, n - 1);
    }
        public static void reverse(int[] num, int i,int j){
            while(i<j){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                i++;
                j--;
            }
            
                    }
        
    
}