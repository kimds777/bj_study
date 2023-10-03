package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nm = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] A = new int[nm[0]*2][nm[1]];
		
		for (int i = 0; i < nm[0]*2; i++) {
			A[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		br.close();

		for (int i = 0; i < nm[0]; i++) {
			for (int j = 0; j < nm[1]; j++) {
				System.out.print(A[i][j] + A[i+nm[0]][j]+" ");
			}
			System.out.println();
		}

	}

}
