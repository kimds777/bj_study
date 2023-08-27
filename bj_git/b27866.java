package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = (br.readLine()).toCharArray();
		int i =Integer.parseInt(br.readLine());
		
		br.close();
		
		System.out.println(str[i-1]);
	}
}
