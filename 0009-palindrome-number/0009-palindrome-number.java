class Solution {
    public boolean isPalindrome(int x) {
       // String s = Integer.toString(x);
       String s= String.valueOf(x);
        System.out.println(s);
        boolean f= true;
       // int j=0;
        for(int i=0;i<=s.length()/2;i++)
        { int j=s.length()-i-1;
            if(s.charAt(i)!=s.charAt(j))
            {
                f=false;
                break;
            }
        }

        return f;
        
    }
}