import java.util.*;

public class combinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> candidatesList = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            candidatesList.add(candidates[i]);
        }
        List<Integer> ans;
        for (int i = 0; i < candidates.length; i++) {
            ans=new ArrayList<>();
            if (target%candidates[i]==0)
            {
                for (int j=0;j<target/candidates[i];j++){
                    ans.add(candidates[i]);
                }
                list.add(ans);
            }
        }


        return list;
    }
}
