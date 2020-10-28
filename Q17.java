package lab_3;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("asda"));

	}

	public static  boolean isPalindrome(String a) {
		// TODO Auto-generated method stub
		String s = "";
		for (int i = a.length()-1;i>=0;i--) {
		 s+= a.charAt(i);
		}
		return s.equals(a)? true:false;
		
	}

}
