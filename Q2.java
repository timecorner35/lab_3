package lab_3;

public class Q2 {

	public static void main(String[] args) {
		System.out.println(makeAbba("hi","bye"));
		

	}

	public static String makeAbba(String a, String b) {
		String c = a+b+b+a;
		return c;
		
	}

}
