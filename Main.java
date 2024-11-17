package intro2;

public class Main {
	public static void main(String[] args) {
	        // Subject 객체 생성
	        Subject subject1 = new Subject("프로그래밍", 85);  // 프로그래밍 과목, 점수 85
	        Subject subject2 = new Subject("수학", 69);  // 수학 과목, 점수 69

	        // Student 객체 생성
	        Student student1 = new Student("김철수", "2024552", subject1);
	        Student student2 = new Student("이영희", "2024334", subject2);

	        // 학생1의 학점 계산 및 세팅
	        student1.setGrade();

	        // 학생2가 재수강이면 A+는 A로 변경
	        student2.setRetake(true);  // 재수강 여부 설정
	        student2.setGrade();

	        // 학생1 정보 출력
	        System.out.println("학생 이름: " + student1.getStudentName());
	        System.out.println("학번: " + student1.getStudentID());
	        System.out.println("과목: " + student1.getSubject().getSubjectName());
	        System.out.println("점수: " + student1.getSubject().getScore());
	        System.out.println("학점: " + student1.getSubject().getGrade());
	        
	        // 학생2 정보 출력
	        System.out.println("\n학생 이름: " + student2.getStudentName());
	        System.out.println("학번: " + student2.getStudentID());
	        System.out.println("과목: " + student2.getSubject().getSubjectName());
	        System.out.println("점수: " + student2.getSubject().getScore());
	        System.out.println("학점: " + student2.getSubject().getGrade());
	    }
	
	}


