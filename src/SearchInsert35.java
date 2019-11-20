public class SearchInsert35 {
    public int searchInsert(int[] nums, int target) {
        if (target<nums[0])
            return 0;
        for (int i = 1; i <nums.length; i++) {
            if (nums[i]>=target&&nums[i-1]<target)
                return i;
        }
        return nums.length;
    }
}
