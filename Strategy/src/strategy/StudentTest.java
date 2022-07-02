package strategy;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("����", 100, false);
		studentLee.addSubject("����", 100, true);
		
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("����", 55, true);
		studentKim.addSubject("����", 55, false);
		studentKim.addSubject("����", 100, false);
		
		studentLee.showGradeInfo();
		System.out.println("======================================");
		studentKim.showGradeInfo();
	}
}
