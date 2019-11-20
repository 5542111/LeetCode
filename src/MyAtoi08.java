public class MyAtoi08 {
    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));
    }

    public static int myAtoi(String str) {


        str = str.trim(); //去除空格


        if (str == null || str.length() == 0 ) //去除全空格字符串
            return 0;
        //System.out.println(str);
        int flag = 1;// 标志±
        int res = 0;
        if (str.charAt(0) == '-') {
            flag = -1;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            flag = 1;
            str = str.substring(1);
        } else if (!(str.charAt(0) >= '0' && str.charAt(0) <= '9')) {
            return 0;
        }



        for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                int a = c - '0';
                System.out.println(a);
                if (res >= Integer.MAX_VALUE / 10) {
                    if (flag == 1) {
                        if (res > Integer.MAX_VALUE / 10 || a > 7)//验证正向溢出
                        {
                            return Integer.MAX_VALUE;
                        }
                    } else {
                        if (res > Integer.MAX_VALUE / 10 || a > 8) //验证负向溢出
                            return Integer.MIN_VALUE;
                    }

                }
                res = res * 10 + a;
            } else
                break;

        }
        return res * flag;

    }
}
