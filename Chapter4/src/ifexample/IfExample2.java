package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		int age = 9;
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		else if(age < 14) {
			charge = 2500;
			System.out.println("초등학생 입니다.");
		}
	}

}
