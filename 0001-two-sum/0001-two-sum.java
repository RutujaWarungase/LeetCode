class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]c= new int [2];
        for(int i=0;i<nums.length;i++)
        {
            if((i+1)<nums.length)
            {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    c[0]=i;
                    c[1]=j;

                }
            }
            }
        }
        return c;
    }
}