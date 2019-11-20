public class IntegerToRome12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        Integer[] arr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] str = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder stringBuilder = new StringBuilder();
        int index = arr.length - 1;


        while (index>=0){
            while(num>=arr[index])
            {
                stringBuilder.append(str[index]);
                num-=arr[index];

            }
            index--;
        }
        return stringBuilder.toString();
//        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//
//        StringBuilder stringBuilder = new StringBuilder();
//        int index = 0;
//        while (index < 13) {
//            // 特别注意：这里是等号
//            while (num >= nums[index]) {
//                // 注意：这里是等于号，表示尽量使用大的"面值"
//                stringBuilder.append(romans[index]);
//                num -= nums[index];
//            }
//            index++;
//        }
//        return stringBuilder.toString();


    }
}
