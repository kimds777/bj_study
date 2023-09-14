package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] findChess = Stream.of((br.readLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();

		int[] orginalChess = { 1, 1, 2, 2, 2, 8 };

		for (int f = 0; f < findChess.length; f++) {
			findChess[f] = orginalChess[f] - findChess[f];
		}
		
		for(int f : findChess) {
			System.out.print(f+" ");
		}
	}
}
