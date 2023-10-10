package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class ToString{
	public void print(int N, int B) {
		System.out.println((Integer.toString(N, B)).toUpperCase());
	}
}

public class b11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		for (int i = N; i > 0; i = i / B) {
			int temp = i%B;
			if(temp>=10) {
				char c = (char)(temp+55);
				sb.append(c);
			}else {
				char c = (char)(temp+'0');
				sb.append(c);
			}
		}
		
		System.out.println(sb.reverse());

	}
}
