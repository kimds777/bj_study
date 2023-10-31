package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b27323 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rec = Integer.parseInt(br.readLine());
		rec *= Integer.parseInt(br.readLine()); 
		br.close();
		
		System.out.println(rec);
	}
}
