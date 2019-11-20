public class IntegeRevese07 {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648) );
    }

    /**
     *    2^31-1=2147483647,-2^31=
     * @param x-2147483648
     * @return
     */
    public static int reverse(int x) {


//        String s=new Integer(x).toString();
//        StringBuilder stringBuilder=new StringBuilder(s);
//
//        if (x<0)
//        {
//            stringBuilder.delete(0,1);
//            if (Integer.parseInt(stringBuilder.reverse().toString())>Integer.MAX_VALUE) return 0;
//            return -Integer.parseInt(stringBuilder.reverse().toString());
//        }
//       // System.out.println(Integer.MAX_VALUE);
//        else {
//            return Integer.parseInt(stringBuilder.reverse().toString());
//        }



        int rev = 0;
        while (x != 0) {
            int pop = x % 10; //求尾数
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;


    }

}
