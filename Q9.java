package lab_3;

public class Q9 {

	public static void main(String[] args) {
		System.out.println(right2("Hello"));

	}

	public static String right2(String a) {
		if(a.length()<2) return "invalid string";
		return a.substring(a.length()-2).concat(a.substring(0,a.length()-2));
		
		
	}

}
