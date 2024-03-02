import java.util.ArrayList;

public class Solution {
    public static int singleNonDuplicate(ArrayList<Integer> nums) {
        if (nums.size() == 1)
            return nums.get(0);

        if (nums.get(0) != nums.get(1))
            return nums.get(0);

        if (nums.get(nums.size() - 1) != nums.get(nums.size() - 2))
            return nums.get(nums.size() - 1);

        int low = 1;
        int high = nums.size() - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums.get(mid) != nums.get(mid + 1) && nums.get(mid) != nums.get(mid - 1)) {
                return nums.get(mid);
            } 
             if ((mid % 2 == 0 && nums.get(mid) != nums.get(mid - 1)) ||
                       (mid % 2 == 1 && nums.get(mid) != nums.get(mid + 1))) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
