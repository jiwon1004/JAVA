package intro;
/*2차원 배열에 학년별로 1,2학기 성적으로 저장되어 있는데,
• 각 학년의 평균을 저장하는 avg[]를 만들고, avg[]를 이용해서 각 학년 평균을
출력하는 프로그램을 만들자 */

public class Class {
	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},       //1학년 1, 2학기 평점
		                    {3.5, 3.6},       //2학년 1, 2학기 평점
		                    {3.7, 4.0},       //3학년 1, 2학기 평점
		                    {4.1, 4.2} };     //4학년 1, 2학기 평점      //배열의 선언 + 할당 + 초기화
		 
		double avg[] = new double[score.length];
		double sum;
		for(int i=0; i<score.length; i++) {   // 이중 for 문에서 외부 for 문에 sum = 0 으로 초기화 되어야 한다.
			sum = 0;
			for(int j=0; j<score[i].length; j++) {   //
				sum = sum + score[i][j];
			}
			avg[i] = sum/score[i].length;    // 내부 for 문에서 1순환하고 나서 평균이 구해짐. 이는 각 행의 값의 평균이다. 
		}
		for(int j=0; j<avg.length; j++) {
			System.out.println("각 학년의 평균 : " + avg[j]);
		}
			}
		
	}// i = 행,  j = 열


