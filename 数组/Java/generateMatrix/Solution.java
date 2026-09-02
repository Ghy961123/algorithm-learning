class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int startX = 0 ;
        int startY = 0;
        int count = 1;
        int offset = 1;
        int loop = 1;
        int i=startX  ,j = startY;
        while(loop++ <= n/2)
        {
            for(j = startY;j< n-offset;j++)
            {
                nums[startX][j] = count++;
            }

            for(i = startX;i< n-offset;i++)
            {
                nums[i][j] = count++;
            }
            for(;j>startY;j--)
            {
                nums[i][j] = count++;
            }
            for(;i>startX;i--)
            {
                nums[i][j] = count++;
            }

            startX++;
            startY++;
            offset++;
        }

        if(n%2!=0)
        {
            nums[startX][startY] = count;
        }
        return nums;
    }
}