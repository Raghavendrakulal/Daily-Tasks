
import java.util.Arrays;

public  class LongestIncreasingSubsequence{
    public static int LIS(int[] nums){
        if(nums.length==0|| nums==null){
            return 0;
        }
        int[] dp= new int[nums.length];

        Arrays.fill(dp, 1);

        for(int i=1;i<dp.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int result=0;
        for(int i=0;i<dp.length;i++){
            result=Math.max(result,dp[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={2,4,1,5,6,7,8,45,7,8};
        int result=LIS(nums);
        System.out.println("result="+ result);
    }
}