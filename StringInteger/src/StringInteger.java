
public class StringInteger {

	public static void main(String[] args) {
		/*String s = "102";
		int n = Integer.parseInt(s);
		
		System.out.println(n + 4);*/
		String s = "age: 47";
		s = s.replaceAll("\\D+", "");
		System.out.println(s);
	}

}
