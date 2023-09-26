package SelfIntroduction;

class Person {

	// インスタンスフィールドを定義
	static String name;
	static int age;
	static double height;
	static double weight;

	// 合計人数を格納
	static int totalPeople = 0;

	// コンストラクタの定義
	public Person(String name, int age, double height, double weight) {
		Person.name = name;
		Person.age = age;
		Person.height = height;
		Person.weight = weight;

		// 人数のカウント
		totalPeople++;
	}

	// BMIを割り出す計算
	public static double bmi() {
		double bmi = weight / (height * height);
		return Math.floor(bmi * 1.0) / 1.0;
	}

	// インスタンスメソッドの定義
	public static void print(Person person) {
		System.out.println("名前は" + getName() + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi()) + "です");
		System.out.println("年は" + getAge() + "です");
	}

	// getter
	public static String getName() {
		return name;
	}
	public static int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public static int getTotalPeople() {
		return totalPeople;
	}
}
