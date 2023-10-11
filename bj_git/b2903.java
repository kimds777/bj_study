package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2903 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iter = Integer.parseInt(br.readLine());
		br.close();
		
		int first = 2; 

		for (int i = 0; i < iter; i++) { // 1 -> 2 -> 4 -> 8
			first += (int) Math.pow(2, i); // i=0 -> 1, i=1 -> 2, i=2 -> 4 
		}
		
		System.out.println((int) Math.pow(first, 2));
	}
}
