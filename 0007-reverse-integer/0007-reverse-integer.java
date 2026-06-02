class Solution {
    public int reverse(int x) {

        boolean neg = x < 0;

        long num = Math.abs((long)x);

        String str = Long.toString(num);
        StringBuilder sb = new StringBuilder(str);

        long rev = Long.parseLong(sb.reverse().toString());

        if (neg) {
            rev = -rev;
        }

        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) rev;
    }
}