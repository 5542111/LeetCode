import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomeToInteger13 {
    public static void main(String[] args) {

        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        Integer[] arr={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] str={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int num=0,sum=0;
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(str[i],arr[i]);
        }
        int preNum=map.get(s.substring(0,1));
        //System.out.println(preNum);
        for(int i=1;i<s.length();i++)
        {
            //System.out.println(preNum);
            sum=map.get(s.substring(i,i+1));
            //System.out.println(s.substring(i,i+1));
            //System.out.println(sum);
            if(preNum<sum)
            {
                num-=preNum;
            }
            else
            {
                num+=preNum;
            }
            preNum=sum;

        }
        num+=preNum;

        return num;
    }
}
