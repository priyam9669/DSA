import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class threeSum {
    
    public List<List<Integer>> threeSum(int[] nums) {

        LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
        if (nums.length < 3)
            return list;
        Arrays.sort(nums);
        int[] n = nums;

        for (int i = 0; i < n.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1;
                int right = n.length - 1;
                while (left < right) {
                    if (n[left] + n[right] + n[i] == 0) {
                        ArrayList<Integer> minlist = new ArrayList<>();
                        minlist.add(n[left]);
                        minlist.add(n[right]);
                        minlist.add(n[i]);
                        list.add(minlist);
                        while (left < right && n[left] == n[left + 1]) {
                            left++;
                        }
                        while (left < right && n[right] == n[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (n[i] + n[left] + n[right] > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return list;
    }

}
