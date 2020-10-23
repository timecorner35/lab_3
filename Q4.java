package lab_3;

public class Q4 {

	public static void main(String[] args) {
		firstTwo("Hello");
		System.out.println(firstTwo("H"));

	}

	public static String firstTwo(String a) {
		if (a.length()>1) {
			a = a.substring(0, 2);
			
		}
		return a;
	}

}
