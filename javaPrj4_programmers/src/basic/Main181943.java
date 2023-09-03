package basic;
import java.util.Scanner;
public class Main181943 {
	
	Scanner sc = new Scanner(System.in);
	
	public static void solution(String my_string, 
			String overwrite_string, int s) {
        
        for(int i = 0; i<s; i++) {
        	char ms = my_string.charAt(i);
        	System.out.print(ms);
        }
        
        for(int i = s; i<overwrite_string.length(); i++) {
        	char os = overwrite_string.charAt(i);
        	System.out.print(os);
        }
        
        
        
        return;
	}
	
	public static void main(String[] args) {
		solution("He110Wor1d", "lloWorl", 2);
	}

}
