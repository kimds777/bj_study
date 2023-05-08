package bj_git;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p15552 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCaseNum =  Integer.parseInt(br.readLine());
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int test = 0; test<testCaseNum; test++) {
			st = new StringTokenizer(br.readLine());
			int firstNum = Integer.parseInt(st.nextToken());
			int secondNum = Integer.parseInt(st.nextToken());
			bw.write(firstNum+secondNum+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
