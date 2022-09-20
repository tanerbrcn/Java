package OOP_Example;

import java.util.Calendar;

public class Employee {

	// Değişkenlerimizi tanımlıyoruz. Değişkenlerin erişim belirtecini private
	// yaptık çünkü bu değişkenlere başka bir sınıftan erişmeyeceğiz.
	// Başka sınıftan parametre ile veri gönderip bu class içerisinde bu
	// değişkenlere gönderdiğimiz verileri atayacağız.
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	// Constructor Method
	Employee(String name, double salary, int workHours, int hireYear) {

		// Class içinde tanımladığımız değişkene parametre içinden gelen değeri
		// atıyoruz. This. diyerek bu class'taki değişkenleri hedef gösteriyoruz.
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		if (this.salary >= 1000) {
			return salary * 0.03;
		}
		return 0.0;
	}

	public double bonus() {
		int extraHours=this.workHours-40;
		if(extraHours>0) {
			return extraHours * 30;
		}
		return 0.0;
	}

	public double raiseSalary() {
		// Calendar sınıfını import ettik ve o sınıftan bir nesne ürettik o nesne
		// sayesinde güncel yılın tarihini aldık.
		Calendar date = Calendar.getInstance();
		int year = date.get(Calendar.YEAR) - this.hireYear;

		if (year < 10) {
			return salary * 0.5;
		} else if (year >= 10 && year < 20) {
			return salary * 0.10;
		} else if (year >= 20) {
			return salary * 0.15;
		}else {
			return 0.0;
		}

	}
	
	public void toString(Employee employee1) {
		System.out.println("Tax = " + employee1.tax());
		System.out.println("Bonus = " + employee1.bonus());
		System.out.println("Maaş Artışı = " + employee1.raiseSalary());
		double totalSalary=employee1.raiseSalary()- employee1.tax()+employee1.bonus();
		System.out.println("Total salary with tax and bonus = " + totalSalary);
		System.out.println("Total salary with the raise of salary = " + employee1.raiseSalary());
	}

}

/*
 * İki adet sınıf oluşturulacak. Bu sınıfların isimleri Employee ve EmpDriver.
 * Employee değişkenlerin tutulduğu sınıf, EmpDriver ise o sınıfı çağıracak
 * Main() metodunu tutacak sınıf olacak. 5 adet metot olacak. Metot 1 Employee
 * Constructor = 4 adet parametre alacak Name(ad),Salary(maaş),the work
 * hours(çalışma saati), hire year(işe başladığı yıl) Metot 2 Tax Method (vergi
 * metodu)= Çalışanın maaşı 1000 tlden yüksek ise ondan %3 vergi alınacak. Metot
 * 3 Bonus Method = Çalışana her çalışma saati için 30 tl bonus ücret verilecek(Normal çalışma 40 saat üzeri ekstra olacak).
 * Metot 4 RaiseSalary Method (maaş arttırma metodu) = Toplam çalıştığı yıl <=9
 * ise %5, <=19 ise %10, >19 ise %15 çalışanın maaşı arttırılacak. Metot 5
 * toString Method = Bu metotta tüm bilgileri ekrana basacak. (Ad,Maaş,Çalışma
 * Saati,İşe başlama Yılı, vergi, bonus, zam)
 */