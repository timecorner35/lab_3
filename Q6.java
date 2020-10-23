package lab_3;

public class Q6 {

	public static void main(String[] args) {
		System.out.println(withoutEnd("hal"));

	}

	public static String withoutEnd(String a) {
		if(a.length()>1) {
			a=a.substring(1, a.length()-1);
			return a;		
		}
		return "try again";
	}

}
