package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		int i = 0;
		int sum = 0;

		while (!(sum >= N)) {

			if (sum == 0) {
				sum += 1;
			}
			
			sum += i * 6;
			++i;
		}
		System.out.println(i);


	}
}
