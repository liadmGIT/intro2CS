
public class Mirror {
	
	public static boolean mirrorEq(String s1, String s2) {
		boolean ans = true;
		
		//------Your code goes here-----
		if((s1.length() == s2.length()) && (s1.length() == 0 || s1.length() == 1 && s1.charAt(0) == s2.charAt(0)) && (ans == true)){
			return ans;
		}
		else if (s1.length() != s2.length() || (s1.charAt(0) != s2.charAt(0) || s1.charAt(s1.length()-1) != s2.charAt(s2.length()-1)) && (s1.charAt(0) != s2.charAt(s2.length()-1) || s1.charAt(s1.length()-1) != s2.charAt(0))){
			ans = false;
		}
		else{
			ans = mirrorEq(s1.substring(1, s1.length()-1), s2.substring(1, s2.length()-1));
		}


		return ans;
	}



	public static void main(String[] args) {
		// You can test your code here
		String s1 = "adefbc";
		String s2 = "cbefda";
		boolean ans =mirrorEq (s1,s2);
		System.out.println (ans);

	}
	
}
