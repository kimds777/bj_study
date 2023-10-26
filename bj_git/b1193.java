package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		br.close();

		int sum = 0;
		int cycle = 0;
		String result = "";
		while (X > sum) {
			cycle++;
			sum += cycle;
		}

		int index = X - (sum - cycle);

		if (cycle % 2 == 0) {
			result = index+"/"+(cycle-(index-1));
		}else {
			result = (cycle-(index-1))+"/"+index;
		}
		
		System.out.println(result);

	}
}
