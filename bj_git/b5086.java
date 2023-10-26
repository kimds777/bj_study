package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringBuilder sb = new StringBuilder();
		
		while (!(str = br.readLine()).equals("0 0")) {
			int[] testCase = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();
			if (testCase[1] % testCase[0] == 0) {
				sb.append("factor"+"\n");
			}else if(testCase[0] % testCase[1] == 0) {
				sb.append("multiple"+"\n");
			}else {
				sb.append("neither"+"\n");
			}
		}
		
		br.close();		
		System.out.println(sb);
	}
}
