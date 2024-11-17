package intro3;

public class StringPrinter {
	  // 첫 번째 오버로드: 하나의 int만 받아서 a번째 위치부터 끝까지 출력
    public static void printString(String str, int a) {
        // 입력된 a가 문자열의 범위를 벗어나지 않도록 검사
        if (a < 0 || a >= str.length()) {
            System.out.println("Invalid position");
            return;
        }
        
        // a번째 인덱스부터 끝까지 출력
        System.out.println(str.substring(a));
    }

    // 두 번째 오버로드: 두 개의 int를 받아서 a번째 위치부터 b번째 위치 바로 앞까지 출력
    public static void printString(String str, int a, int b) {
        // a가 b보다 크거나, a나 b가 범위를 벗어나면 오류 메시지 출력
        if (a < 0 || b < 0 || a >= str.length() || b > str.length() || a >= b) {
            System.out.println("Invalid range");
            return;
        }

        // a번째 인덱스부터 b번째 인덱스 바로 앞까지 출력
        System.out.println(str.substring(a, b));
    }

    // main 메서드에서 테스트
    public static void main(String[] args) {
        String testString = "Hello, World!";

        // 하나의 인자만 받는 버전
        printString(testString, 7);  // 출력: "World!"

        // 두 개의 인자를 받는 버전
        printString(testString, 7, 12);  // 출력: "World"
    }
}

	