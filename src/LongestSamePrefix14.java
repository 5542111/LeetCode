public class LongestSamePrefix14 {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        if (strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char current = strs[0].charAt(index);
            for (String str : strs) {
                if (str.length() == i || current != str.charAt(index)) {
                    return str.substring(0, index);
                }
            }
            index++;
        }

        return strs[0].substring(0, index);
    }
}
