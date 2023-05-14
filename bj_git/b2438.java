package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2438 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder star = new StringBuilder();
		StringBuilder starSum = new StringBuilder();
		for (int starCount = 0; starCount < line; starCount++) {
			star.append("*");
			starSum.append(star+"\n");
		}
		System.out.println(starSum);
	}
}
