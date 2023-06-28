package Basics;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    static boolean isPalindromeByRecur(String S, int i){
        int n = S.length();
        if(i>=n/2){
            return true;
        }
        if(S.charAt(i)!=S.charAt(n-i-1)){
            return false;
        }
        return isPalindromeByRecur(S,i+1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindromeByRecur("Madam",0));
    }
}
