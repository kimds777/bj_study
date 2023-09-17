package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Palindrome{
	public BufferedReader br;
	public int print() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		int strLength = str.length();
		
		for(int i = 0; i<strLength/2; i++) {
			if(str.charAt(i) != str.charAt(strLength-i-1)) {
				return 0;
			}
		}
		
		return 1;
	}
}

public class b10988 {
	public static void main(String[] args) throws IOException {
		Palindrome p = new Palindrome();
		System.out.println(p.print());		
	}
}
