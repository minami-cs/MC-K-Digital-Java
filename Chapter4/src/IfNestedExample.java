
public class IfNestedExample {

	public static void main(String[] args) {
		int score = 44;
		String grade = "";
		
		if(score>=90) {
			grade = "A";
			if(score>=98) {
				grade += "+";
			} else if(score<94) {
				grade += "-";
			}
		}
		else if(score>=80) {
			grade = "B";
			if(score>=88) {
				grade += "+";
			} else if(score<84) {
				grade += "-";
			}
		}
		else if(score>=70) {
			grade = "C";
			if(score>=78) {
				grade += "+";
			} else if(score<74) {
				grade += "-";
			}
		}
		else if(score>=60) {
			grade = "D";
			if(score>=68) {
				grade += "+";
			} else if(score<64) {
				grade += "-";
			}
		}
		else {
			grade = "F";
		}
		System.out.println("학점: " + grade);

	}

}
