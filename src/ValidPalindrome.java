public class ValidPalindrome {
    public boolean isPalindrome(String s){
        //if(s.length()<=0) return false;
        int i=0;
        int j=s.length()-1;

        while(i<j){
            Character left= s.charAt(i);
            Character right = s.charAt(j);

            if(!Character.isLetterOrDigit(left)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                right++;
                continue;
            }
            if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }
            i++;
            j++;
    }
    return true;
}
}
