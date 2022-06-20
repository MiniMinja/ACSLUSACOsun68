import java.util.*;
public class _1920jrc2 {
	static Scanner in;
	
	static String a, b;
	
	static String output;
	
	public static void main(String[] args) {
		init();
		solve();
		output();
	}
	
	public static void init() {
		in = new Scanner(System.in);
		
		a = in.next();
		b = in.next();
		
		output = "";
	}
	
	public static void solve() {
		a = delete2ndCons(a);
		b = delete2ndCons(b);
		System.out.println(a + " "  + b);
		
		int l = Math.min(a.length(), b.length());
		for(int i = 0;i<l;i++) {
			if(a.charAt(i) == b.charAt(i)) {
				a = deleteChar(a, i);
				b = deleteChar(b, i);
				i--;
			}
		}
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	public static String delete2ndCons(String a) {
		return null;
	}
	
	public static String deleteChar(String s, int i) {
		
	}
	
}
