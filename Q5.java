package lab_3;

public class Q5 {

	public static void main(String[] args) {
		System.out.println(firstHalf("Helloo8888"));
		
	}

	public static String firstHalf(String a) {
		if(a.length()%2==0){
			a = a.substring(0, (a.length()/2));
			return a;
		}
		return "try again";
	}

}
