package SelfIntroduction;

class Main {
	public static void main(String[] args) {

		// プロフィールの入力
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// インスタンスメソッドの出力
		Person.print(person1);

		// 合計人数を出力
		System.out.println("合計" + Person.getTotalPeople() + "人です");
	}
}
