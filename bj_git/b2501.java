package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken())-1;
		
		List<Integer> factor = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				factor.add(i);
			}
		}
		if(factor.size()>K) {
			System.out.println(factor.get(K));			
		}else {
			System.out.println(0);
		}
	}
}
