package intro2;

public class Subject {
	private String subjectName;  // 과목명
	private int score;           // 점수
	private String grade;        // 학점
	
//생성자 : 과목명과 점수를 초기화
public Subject(String subjectName, int score) {
	this.subjectName = subjectName;
	this.score = score;
	this.grade = "";  //학점은 나중에 설정
}
//학점 설정 메서드
public void setGrade(String grade) {
	this.grade = grade;
}
//학점 계산 메서드
public String getGrade(Subject subject) {
	int score = subject.score;
	 if (score >= 80 && score <= 100) {
         return "A+";
     } else if (score >= 60 && score < 80) {
         return "A";
     } else {
         return "B+";
     }
 }

// Getter와 Setter
public String getSubjectName() {
    return subjectName;
}

public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
}

public int getScore() {
    return score;
}

public void setScore(int score) {
    this.score = score;
}

public String getGrade() {
    return grade;
}
	
}

