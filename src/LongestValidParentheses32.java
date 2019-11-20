import java.util.Map;
import java.util.Stack;

public class LongestValidParentheses32 {
    public int longestValidParentheses(String s) {

        /**
         * 栈 配对
         */
        int len=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='(')
            {
                stack.push(i);
            }
            else
            {
                stack.pop();
                if (stack.empty()){
                    stack.push(i);
                }
                else {
                    len= Math.max(len,i-stack.peek());
                }
            }
        }


        return len;

        //这个想法真的棒！
//        int left = 0, right = 0, maxlength = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                left++;
//            } else {
//                right++;
//            }
//            if (left == right) {
//                maxlength = Math.max(maxlength, 2 * right);
//            } else if (right >= left) {
//                left = right = 0;
//            }
//        }
//        left = right = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) == '(') {
//                left++;
//            } else {
//                right++;
//            }
//            if (left == right) {
//                maxlength = Math.max(maxlength, 2 * left);
//            } else if (left >= right) {
//                left = right = 0;
//            }
//        }
//        return maxlength;
    }
}
