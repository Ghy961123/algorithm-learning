package binarysearch;

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right)
        {
            int mid = (left + right)/2;
            if(target == nums[mid]) return mid;
            else if(target>nums[mid]) left = mid+1;
            else if(target<nums[mid]) right = mid-1;
        }
        return -1;
    }
}

//写mid+1 -1可以防止死循环，并且mid已经判断过了，也应该加1减1
