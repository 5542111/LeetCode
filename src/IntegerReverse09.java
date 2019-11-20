public class IntegerReverse09 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int x) {
        StringBuilder stringBuilder=new StringBuilder(new Integer(x).toString());

        return  stringBuilder.reverse().toString().equals(new Integer(x).toString());


    }

}
