package lab_3;

public class Q8 {

	public static void main(String[] args) {
		System.out.println(left2("Hello"));

	}

	public static String left2(String a) {
		if(a.length()<2)return "invalid string";
		return a.substring(2)+a.substring(0, 2);
	}

}
