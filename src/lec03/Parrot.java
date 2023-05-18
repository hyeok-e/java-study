package lec03;


import java.util.Scanner;

public class Parrot {
    // 입출력을 공부했는데 입출력 이후 앵무새라고 하는 내가 말한 것을 되돌려 말하는 프로그램입니다.
    public static void main(String[] args) {
        System.out.println("안녕하세요 저는 앵무새입니다. ");

        Scanner parrot = new Scanner(System.in);
        String a = parrot.nextLine();

        System.out.println(a);
    }
}
