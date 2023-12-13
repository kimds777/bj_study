package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int movieTitleNumber = 666;
		
		int i = 1;
		while(N != i) {
			movieTitleNumber++;
			
			if(String.valueOf(movieTitleNumber).contains("666")) {
				i++;
			}
		}
		
		System.out.println(movieTitleNumber);		
	}
}
