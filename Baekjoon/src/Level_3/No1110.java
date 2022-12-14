package Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1110 {
    public static void main(String[] args) throws IOException {
        /*
        0보다 크거나 같고, 99보다 작거나 같은 정수가 주어진다.
        주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
        그 다음, 주어진 수의 가장 오른쪽 자리의 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
        N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하라.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = N;

        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
        }
        while (copy != N);

        System.out.println(cnt);
    }
}