package intro;

import java.util.Scanner;

public class if_else_2024_09_24_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = scanner.nextInt();
		
		System.out.println("학년 입력 : ");
		int year = scanner.nextInt();
		
		if (score >= 60) {
			if(year < 4)
				System.out.println("합격"); //4학년이 아닌 경우에 합격
			else {
				if (score >= 70)
					System.out.println("합격"); // 4학년이 70점 이상일 경우 합격
				else 
					System.out.println("불합격"); //4학년이 70점 미만일 경우 불합격
					}
			}
		else {
			if(year != 1) // 1학년이 아닌 경우
				System.out.println("불합격"); // 1학년이 아닌 경우에는 무조건 불합격
			else {
				if (score > 50) // 1학년이 50점 이상인 경우 재시험
				System.out.println("재시험");
				else if(score < 50)
					System.out.println("불합격"); // 1학년이 50점 미만인 경우 불합격
		}
	}
}
}
