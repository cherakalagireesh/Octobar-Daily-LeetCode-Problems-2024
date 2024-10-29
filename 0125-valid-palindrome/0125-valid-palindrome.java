class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while(left < right)
        {
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);

            if(!Character.isLetterOrDigit(ch1))
            {
                left++;
                continue;
            }
            else if(!Character.isLetterOrDigit(ch2)) 
            {
                right--;
                continue;
            }
            else
            {
                if(ch1 != ch2)
                    return false;
            }

            left++;
            right--;
        }

        return true;
    }
}