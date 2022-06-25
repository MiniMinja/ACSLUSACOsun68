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
		//delete 2nd cons
		
		//delete all vowels
		
		//delete chars in like positions LR
		int index = 0;
		while(index <= Math.min(a.length(), b.length())) {
			if(a.charAt(index) == b.charAt(index)) {
				a = deleteChar(a, index);
				b = deleteChar(b, index);
			}
			else {
				index++;
			}
		}
		
		//delete chars in like positions LR
		index = 0;
		while(index <= Math.min(a.length(), b.length())) {
			if(a.charAt(a.length()-1-index) == b.charAt(b.length()-1-index)) {
				a = deleteChar(a, index);
				b = deleteChar(b, index);
			}
			else {
				index++;
			}
		}
	}
	
	public static void output() {
		System.out.println(output);
	}
	
	public static String deleteChar(String s, int i) {
		String l = s.substring(0, i);
		String r = s.substring(i + 1);
		return l + r;
	}
	
}
