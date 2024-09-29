package intro;

import java.util.Scanner;

public class for_2024_09_29_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요. : ");//첫번째 숫자 입력받기
		int num1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요. : ");//두번째 숫자 입력받기
		int num2 = scanner.nextInt();
		
		int sum = 0;                             //합이 우선 0으로 시작한다는 것을 알려줌
		int minNumber = 0;
		int maxNumber = 0;
		
		if(num1<num2) {                         //if문을 써서 숫자가 만약 클때 작을때를 구별
			minNumber = num1;
			maxNumber = num2;
			}
		else if(num1>num2) {
			minNumber = num2;
			maxNumber = num1;
		}
		else {
			sum = num1;                        // 입력받은 두 숫자가 같을 경우를 대비하여 작성
			System.out.printf("%d에서 %d까지의 합은 %d입니다.", num1,num2,sum); //printf로 해야함 float 실수형
		}
		
		for(int count = minNumber; count <= maxNumber; count++) {
			//for문 사용 초기값 : minNumber , 탈출조건 : maxNumber , <= : count에서 maxNumber까지의 반복
			sum += count;
		}
		
		System.out.printf("%d에서 %d까지의 합은 %d입니다.", minNumber,maxNumber,sum);
		
		
	}

}
