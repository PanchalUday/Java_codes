package Inheritance_;

class CarModel{
	void Model() {
		System.out.println("Basemodel");
	}
}
	class CarModel1 extends CarModel{
		void Model1() {
			System.out.println("Topmodel");
		}
	}
	class CarModel2 extends CarModel1{
		void Model2() {
			System.out.println("Top+");
		}
	}

public class Inheritance2 {

	public static void main(String[] args) {
		CarModel2 m = new CarModel2();
		m.Model();
		m.Model1();
		m.Model2();
	}
}