import java.util.Arrays;
import java.util.HashSet;

package 1-D_DP;

public class PartitionEqualSubset {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        System.out.println(target);
        // boolean[] dp = new boolean[target];
        // dp[0] = true;

        // for (int no : nums) {
        //     for (int i = target; i >= no; i--) {
        //         if (dp[i - no] == true) {
        //             if (i == target) return true;
        //             dp[i] = true;
        //         }
        //     }
        // }
        // return false;
        HashSet<Integer> set= new HashSet<>();
        set.add(0);
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> tempset= new HashSet<>();
            for(int element: set){
                if(nums[i]+element==target) return true;
                //System.out.print(nums[i]);
                //System.out.println("+"+element);
                tempset.add(nums[i]+element);
                tempset.add(nums[i]);
            }
            //for(int element1: tempset){
                set.addAll(tempset);
            //}
            //set=tempset;
        }
        return false;
    }
}
