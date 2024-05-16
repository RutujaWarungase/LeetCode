class Solution {
    public int lengthOfLongestSubstring(String s) {
      int i=0;
      List <Character> l= new ArrayList<>();
      int max=0;

       int count=0;
       //System.out.println(s.length());

        while(i < s.length())
        {
            if(s.length()==1)
            {
                max=1;
                break;
            }
            char x= s.charAt(i);
             if(  l== null || l.contains(x))
             {
                int j= l.indexOf(x);
                while(j>=0)
                {
                    l.remove(j);
                    j--;
                }
                 
                 if(count > max)
                 {
                     max=count;
                 }

                 count=l.size()+1;
                 l.add(x);
                 
             }
             else{
                 l.add(x);
                count++;

             }
             if(count > max)
             {max=count;}
             i++;
        }
        return max;
    }
}