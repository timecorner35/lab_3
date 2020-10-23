package lab_3;

public class Q10 {

	public static void main(String[] args) {
		System.out.println(frontAgain("Endited"));

	}

	public static boolean frontAgain(String a) {
		String first = a.substring(0,2);
		String last = a.substring(a.length()-2);
		return first.equalsIgnoreCase(last);
		
		}
		
		
	}

