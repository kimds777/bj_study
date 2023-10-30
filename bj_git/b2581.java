package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class b2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		br.close();

		List<Integer> arr = new ArrayList<>();
		for (int i = M; i <= N; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}

			if (cnt == 2) {
				arr.add(i);
			}
		}
		
		if(arr.size()==0) {
			System.out.println(-1);
		}else {
			int arrSum = 0;
			for (int a = 0; a < arr.size(); a++) {
				arrSum += arr.get(a);
			}
			System.out.println(arrSum);
			System.out.println(arr.get(0));			
		}
	}
}
