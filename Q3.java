package lab_3;

public class Q3 {

	public static void main(String[] args) {
		System.out.println(extraEnd("a"));
		

	}

	public static String extraEnd(String a) {
		if (a.length()>1) {
			a = a.substring(a.length()-2);
			String s = a+a+a;
			return s;
		}
		return a;
	}

}
