package 1-D_DP;

public class HouseRobbers {
     public int rob(int[] nums) {
        int n = nums.length;
        int pre=0;
        int current=0;
        for (int i=0;i<n;i++){
            int temp=Math.max(pre+nums[i],current);
            pre=current;
            current=temp;
        }
        return current;
    }
}
