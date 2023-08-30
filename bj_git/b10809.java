package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10809 {
	// 이중 for문 활용!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = (br.readLine()).toCharArray();
		
		br.close();

		char[] alphabet = new char[26];
		for (int a = 0; a < alphabet.length; a++) {
			alphabet[a] = (char) (97 + a);
		}

		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < str.length; j++) {
				
				if (str[j] == alphabet[i]) {
					System.out.print(j + " ");
					break;
				}
				if (j == (str.length-1)) {
					System.out.print(-1 + " ");
					break;
				}
			}
		}

	}
	

//	public static void main(String[] args) throws Exception {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		char arr[] = br.readLine().toCharArray();
//		int num[] = new int[26];
//		for (int i = 0; i < 26; i++) {
//			num[i] = -1;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			int loc = arr[i] - 97; // 97은 아스키코드 a
//
//			if (num[loc] == -1) { loc은 알파벳 인덱스
//				num[loc] = i;
//			}
//		}
//	
//		for (int i = 0; i <  26; i++) {
//			System.out.print(num[i] + " ");
//		}
//	}
}
