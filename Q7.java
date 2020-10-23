package lab_3;

public class Q7 {

	public static void main(String[] args) {
		System.out.println(comboString("aaa","bbbbbbb"));
	}

	public static String comboString(String a, String b) {
		String s;
		if(a.length()<=b.length()) {
			 s = a+b+a;
		}else {
			s = b+a+b;
		}
		return s;
	}

}
