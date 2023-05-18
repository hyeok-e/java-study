package lec03;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        // 1.작은 정수가 입력될 때, 2의 32승 까지만 받는다 약 21억
        int a = scan.nextInt();
        System.out.println(a);

        // 2.큰 정수 2^63 - 1까지 받는다.
        long b = scan2.nextLong();
        System.out.println(b);

    }
}
