package intro;

import java.util.Scanner;

public class Switch_2024_09_24_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade; // char = 실수형 변수
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		switch (score/10) {
		case 10:
		grade = 'A';
		//break;
		case 9: //score는 90~99까지  //switch문에서 case뒤에는 : 임
		grade = 'A';
		//break;
		case 8: //score는 80~89까지
		grade = 'B';
		//break;
		case 7: //score는 70~79까지
		grade = 'C';
		break;
		case 6: //score는 60~69까지 
		grade = 'D';
		break;
		default: //score가 59점 이하
		grade = 'F';
		
		}
		
		System.out.println("학점은 " + grade + "입니다.");
		scanner.close();
		
	}

}
