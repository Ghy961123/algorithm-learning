class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int sublen = 0;
        int i = 0;
        for(int j = 0; j<nums.length; j++)
        {
            sum += nums[j];
            while(sum>=target)
            {
                sublen = j-i+1;
                result = result>sublen?sublen:result;
                sum -= nums[i++];
            }
        }
        return result == Integer.MAX_VALUE? 0:result;

    }
}

//滑动窗口法，双指针思想，虽然是两层循环，但是时间复杂度数是看被操作数的执行次数，ij一共2n次，所以时间复杂度O(n)，而不是O(n^2)