class Solution {
    public boolean isPalindrome(String s) {
        // s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        // int n=s.length()-1;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)!=s.charAt(n-i)){
        //         return false;
        //     }
        // }
        // return true;
        
        s=s.toUpperCase().replaceAll("[^A-Za-z0-9]","");
        int left=0;
        int right=s.length()-1;
        boolean isPalindrome =true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                isPalindrome =false;
                break;
            }else{
                left++;
                right--;
            }
        }
        return isPalindrome ;
    }
}
