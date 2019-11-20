import java.util.*;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
            int num[]={-3,-1,0,0,0,3,3};
        removeDuplicates(num);
    }
    public static  int removeDuplicates(int[] nums) {
//        Arrays.sort(nums);
  List<Integer>  ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ls.add(nums[i]);
        }
        Set<Integer> hs=new HashSet<>();
        hs.addAll(ls);
        ls.clear();
        ls.addAll(hs);
        Collections.sort(ls);
        int x=0;
        for(int i=0;i<hs.size();i++)
        {
            nums[i]=ls.get(i);
        }
       // System.out.println(ls);
//        Arrays.sort(nums);
        //System.out.println(x);


        return hs.size();
    }

}
