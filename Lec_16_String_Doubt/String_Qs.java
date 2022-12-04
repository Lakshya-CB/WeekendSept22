package Lec_16_String_Doubt;

public class String_Qs {
	public static void main(String[] args) {
		String str = "hallaballaralla";
		System.out.println(str.length());
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.startsWith("halla"));
		System.out.println(str.endsWith("halla"));
		System.out.println(str.indexOf("balla"));
		System.out.println(str.lastIndexOf("alla"));
		System.out.println(str.substring(2));
		
		
		
		
	}
//	check is String t a subsequence of string s
//	https://leetcode.com/problems/is-subsequence/
	public boolean isSubsequence(String t, String s) {
        int i1=0;
        int i2=0;
        while(i1<s.length() && i2<t.length()){
            if(s.charAt(i1)==t.charAt(i2)){
                i1++;i2++;
            }else{
                i1++;
            }
        }
        if(i2==t.length()){
            return true;
        }else{
            return false;
        }
    }
	
	

		
}
