package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class b9506 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		StringBuilder sb = new StringBuilder();
		while (!(str = br.readLine()).equals("-1")) {
			int n = Integer.parseInt(str);
			int sum = 0;
			List<Integer> nArr = new ArrayList<>();
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum += i;
					nArr.add(i);
				}
			}

			if (sum == n) {
				sb.append(n);
				for (int j = 0; j < nArr.size(); j++) {
					if(j == 0) {
						sb.append(" = "+nArr.get(j));
					}else {
						sb.append(" + "+nArr.get(j));						
					}
				}
				sb.append("\n");
			} else {
				sb.append(n + " is NOT perfect.\n");
			}
		}
		
		br.close();		
		System.out.println(sb);
	}
}
