package minSubArrayLen;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int sublen = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            sum = 0;
            for(int j = i; j<nums.length;j++)
            {
                sum+=nums[j];
                if(sum>=target)
                {
                    sublen = j-i+1;
                    result = result>sublen? sublen:result;
                    break;
                }
            }
        }
        return result == Integer.MAX_VALUE? 0:result;
    }
}

//暴力求解
