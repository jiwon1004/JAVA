package intro2;

public class Student {
    private String studentName;  // 학생 이름
    private String studentID;    // 학번
    private Subject subject;     // 과목 객체
    private boolean retake;      // 재수강 여부

    // 생성자: 이름, 학번, 과목 객체 초기화
    public Student(String studentName, String studentID, Subject subject) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.subject = subject;
        this.retake = false;  // 기본값은 재수강 아님
    }

    // 학점을 계산하고 세팅하는 메서드
    public void setGrade() {
        String grade = subject.getGrade(subject);
        
        // 재수강인 경우 A+는 A로 변경
        if (retake && grade.equals("A+")) {
            grade = "A";
        }

        subject.setGrade(grade);
    }

    // Getter와 Setter
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public boolean isRetake() {
        return retake;
    }

    public void setRetake(boolean retake) {
        this.retake = retake;
    }
}


