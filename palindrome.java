class palindrome {
    public boolean isPalindrome(int x) {
        
        String s=Integer.toString(x);
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        
        if(s.equalsIgnoreCase(sb.reverse().toString()))
            return true;
        else
            return false;
        
    }
}