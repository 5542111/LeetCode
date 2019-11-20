import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveElement27 {
    public static void main(String[] args) {
        int num[] = {-3, -1, 0, 0, 0, 3, 3};
        removeElement(num, 3);
    }

    public static int removeElement(int[] nums, int val) {
        int len=0;
        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[i]==val)
            {
                nums[i]=nums[i+1];
                len++;
            }

        }
        for (int i = 0; i <len ; i++) {
            System.out.println(nums[i]);
        }
        return len;
    }
}
