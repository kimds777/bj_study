package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		br.close();

		int big = 0;
		int[] index = new int[2];

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (arr[i][j] > big) {
					big = arr[i][j];
					index[0] = i+1;
					index[1] = j+1;
				} else if(arr[i][j] == big) {
					index[0] = i+1;
					index[1] = j+1;
				}
			}
		}
		
		System.out.println(big);
		for(int i : index) {
			System.out.print(i+" ");
		}
	}
}
