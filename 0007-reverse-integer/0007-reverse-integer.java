class Solution {
    public int reverse(int x) {
       
       int prev=0;
        int i=0;
        int y=x;
        while(y!=0)
        {
            // if(prev>=9 )
            // {
            //     i=0;break;
            // }
            int t=y%10;
            prev=i;
            i=i*10+t;
            
            if((i-t)/10 !=prev)
            {
                i=0;
                break;
            }
            y=y/10;

            // prev++;
            // i*=10;
        }
        return i;
    }
}