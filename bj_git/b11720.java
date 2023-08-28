package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11720 {
	public static void main(String[] args) throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		String n = br.readLine();
		int total = 0;
		
		br.close();
		
		for(int i = 0; i<n.length(); i++) {
			total += n.charAt(i)-'0';
		}
		
		System.out.println(total);
	}
}
