
import java.util.*;

public class longestPalindrome03 {
    public static void main(String[] args) {
        System.out.println( longestPalindrome1("vmqjjfnxtyciixhceqyvibhdmivndvxyzzamcrtpywczjmvlodtqbpjayfchpisbiycczpgjdzezzprfyfwiujqbcubohvvyakxfmsyqkysbigwcslofikvurcbjxrccasvyflhwkzlrqowyijfxacvirmyuhtobbpadxvngydlyzudvnyrgnipnpztdyqledweguchivlwfctafeavejkqyxvfqsigjwodxoqeabnhfhuwzgqarehgmhgisqetrhuszoklbywqrtauvsinumhnrmfkbxffkijrbeefjmipocoeddjuemvqqjpzktxecolwzgpdseshzztnvljbntrbkealeemgkapikyleontpwmoltfwfnrtnxcwmvshepsahffekaemmeklzrpmjxjpwqhihkgvnqhysptomfeqsikvnyhnujcgokfddwsqjmqgsqwsggwhxyinfspgukkfowoxaxosmmogxephzhhy"));
}

    public static  String longestPalindrome1(String s) {
        //暴力 时间复杂度太高
        if (s.length()==0) {
            return "";
        }



        Map<Integer,String> hs = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp=s.substring(i,j);
                StringBuffer stringBuffer=new StringBuffer(temp);

                if (temp.equals(stringBuffer.reverse().toString()))
                {
                    hs.put(temp.length(),temp);
                }
            }
        }

        Integer max=0;
        for (Map.Entry<Integer,String> entry:hs.entrySet())
        {
            //System.out.println(entry.getKey()+","+entry.getValue());
            if (entry.getKey()>max)
            {
                max=entry.getKey();
            }
        }
        return hs.get(max);
    }
}
