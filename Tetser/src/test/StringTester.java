package test;

public class StringTester {
	public static void main(String[] args) {
		String s = new String();
		for (int i = 0; i < 100000; i++) {
			s=s+i+"|";		
		}
		System.out.println(s);
	}
}
