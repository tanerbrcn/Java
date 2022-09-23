package Lesson2Examples.InheritanceDemo;

public class Main {

	public static void main(String[] args) {

		CreditUI creditUI = new CreditUI();
		creditUI.creditCalculate(new TeacherCreditManager());
		
	}

}
