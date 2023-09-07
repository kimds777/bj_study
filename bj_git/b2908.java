package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		char[] a = st.nextToken().toCharArray();
		char[] b = st.nextToken().toCharArray();

		char[] reverseA = new char[a.length];
		char[] reverseB = new char[b.length];

		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			reverseA[i] = a[j];
			reverseB[i] = b[j];
		}
		
		int A =Integer.parseInt(String.valueOf(reverseA));
		int B =Integer.parseInt(String.valueOf(reverseB));

		if(A>B) {			
			System.out.println(A);
		}else {			
			System.out.println(B);
		}

	}
}
