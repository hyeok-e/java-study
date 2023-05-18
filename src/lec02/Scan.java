package lec02;


import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        //입력을 받을 스캐너를 만든다. * 스캐너 - 자바 유틸 임포트 필요
        //system.in : 시스템 안으로 데이터를 스캔
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        //String : 입력받는 값이 문자열이라는 뜻
        //str : 입력받은 문장의 이름
        //a.nextline() : 한 줄을 입력받는다.
        String str = a.nextLine();
        var value = b.nextLine(); //함수가 진행되기 전 함수가 받을 값에 대한 변수타입을 지정한다. String : 문자, var : 숫자 등 여러가지가 있다.

        System.out.println(str);
        System.out.println(value);
    }
}