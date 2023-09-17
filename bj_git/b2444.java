package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StarDot {
	//StringBulider와 repeat을 활용하면 메모리와 시간 감소!
	public void sbUsed() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < n; i++) {
			sb.append(" ".repeat(n - i)).append("*".repeat(i * 2 - 1)).append("\n");
		}

		for (int i = 0; i < n; i++) {
			sb.append(" ".repeat(i)).append("*".repeat(n*2-1-i*2)).append("\n");
		}
		
		System.out.println(sb);
	}

	public void print() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		br.close();

		int point = n - 1;
		int point2 = n - 1;

		for (int s = 0; s < n; s++) {
			for (int d = 0; d < point; d++) {
				System.out.print(" ");
			}

			for (int star = point - 1; star < point2; star++) {
				System.out.print("*");
			}

			point--;
			point2++;
			System.out.println();

		}

		point += 1;
		point2 -= 1;

		for (int s = n; s > 1; s--) {
			++point;
			--point2;

			for (int d = 0; d < point; d++) {
				System.out.print(" ");
			}

			for (int star = point - 1; star < point2; star++) {
				System.out.print("*");
			}

			System.out.println();

		}
	}
}

public class b2444 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StarDot sd = new StarDot();
//		sd.print();
		sd.sbUsed();
	}
}
