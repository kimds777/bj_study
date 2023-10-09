package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//parseInt를 활용한 진법 변환
class parseInteger{
	public void print(String s, int B) {
		System.out.println(Integer.parseInt(s, B));
	}
}

public class b2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		char[] str = st.nextToken().toCharArray();
		int B = Integer.parseInt(st.nextToken());
		long ans = 0;
		int n;
		int b = 0;

		for (int i = str.length-1; i >= 0; i--) {
			if (str[i] >= 'A' && str[i] <= 'Z') { // 10진수 이상인 경우
				n = str[i] - 55;
			} else { // 10진수 이하인 경우
				n = str[i] - '0';
			}

			ans += (n * Math.pow(B,b)); 
			b++;
		}

		System.out.println(ans);
	}
}
