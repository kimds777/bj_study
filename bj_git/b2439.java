package bj_git;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int line = Integer.parseInt(br.readLine());
		char[] stars = new char[line];
		StringBuffer starPoint = new StringBuffer();
		for (int gap = 0; gap < line; gap++) {
			stars[gap] = ' ';
		}
		for (int star = 0; star < line; star++) {
			stars[line - star - 1] = '*';
			starPoint.append(stars).append("\n");
		}
		bw.write(starPoint.toString());
		bw.flush();
		bw.close();
		br.close();

	}
}
