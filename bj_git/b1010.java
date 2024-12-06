package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class b1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (NM[0] == 1) {
                sb.append(NM[1]).append("\n");
            } else if (NM[0] == NM[1]) {
                sb.append("1\n");
            } else {
//                BigInteger를 활용한 풀이 -> 정답처리됐지만 효율이 떨어져서 수정 필요
//                sb.append(factorialBig(NM[1], NM[0]).divide(factorialBig(NM[1] - NM[0], 1))).append("\n");

//              combiLong(n, r) -> 분자에서 분모를 바로 나눠 계산하여 long으로 받을 수 있게 처리
                sb.append(combiLong(NM[1], NM[0])).append("\n");
            }
        }

        System.out.print(sb);
    }

    public static long combiLong(int n, int r) {
        long combi = 1;
        for (int i = 0; i < r; i++) {
            combi *= (n - i);
            combi /= (i + 1);
        }

        return combi;
    }

    public static BigInteger factorialBig(int number, int limit) {
        BigInteger fac = new BigInteger("1");
        while (number > limit) {
            fac = fac.multiply(BigInteger.valueOf(number));
            number--;
        }

        return fac;
    }
}
