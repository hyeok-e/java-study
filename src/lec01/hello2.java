package lec01;

public class hello2 {
    public static void main(String[] args) {
        //""따옴표 기입 시에는 문장이라고 인식한다.
        //따옴표가 없는 경우에는 숫자로 인식한다.
        System.out.println("hello world");
        System.out.println(3+1);
        System.out.println("3"+2); //여기서 31이 나오는 이유는 문자열로 인식해서 3과 1을 붙혀서 출력되기 때문임.
        System.out.println('A');
        System.out.println(" \" "); //따옴표 같은 특수문자를 삽입하여 출력해야하는 경우 역슬래시를 넣어서 이스케이프 처리한다.
        System.out.println("Hello World\n"); // \n은 한 줄 개행, /t는 탭, /b는 백스페이스이다.
        System.out.println("123123");
        System.out.println("Hello\nWorld");
        System.out.println(3.14);
        System.out.println(10);
    }
}
