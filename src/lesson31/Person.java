package lesson31;

class Person {
    public String name;
    public int age;
    public double height;
    public double weight;
    
    // 問１：クラスフィールド「count」を定義（初期値：0,データ型：int）
    public static int count = 0;

    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        
        // 問２：カウント１追加
        count++; 
    }

    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年齢は" + this.age + "です");
        System.out.println("BMIは" + this.bmi() + "です" + "\n");
    }

	// 問４：クラスメソッド「printCount」を定義（データ型：void）
    public static void printCount() {
    	
        // 問５：クラスメソッドの中にクラスフィールド「count」で「合計〇〇人です」と出力
        System.out.println("合計" + count + "人です");
    }
}