package lesson27;

import java.util.Scanner;

class Animal {

	// フィールド
	private String name;
	private double length;
	private double speed;
	private String scientific;

	// コンストラクタ
	public Animal(String name, double length, double speed, String scientific) {
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.scientific = scientific;
	}

	// getter
	public String getName() {
		return name;
	}
	public double getLength() {
		return length;
	}
	public double getSpeed() {
		return speed;
	}
	public String getScientific() {
		return scientific;
	}
}

public class AnimalInfo {
	public static void main(String[] args) {
		
		// 名前入力のscanner宣言
		Scanner sca = new Scanner(System.in);
		
		// 文字出力
		System.out.println("コンソールに文字を入力してください");
		
		// 名前入力の受け取り
		String input = sca.nextLine();
		
		// ","で区切られた文章を変数に格納
		String[] inputLines = input.split(",");
		
		// 拡張for文でユーザーが指定した各入力行に分割
		for (String line : inputLines) {
			
			// ":"で区切られた文章を変数に格納
			String[] data = line.split(":");
			
			// それぞれの値を当てはめる
			String name = data[0];
			double length = Double.parseDouble(data[1]);
			double speed = Double.parseDouble(data[2]);
			String scientific = "";
			
			// 名前と学名を紐づける処理
			if (name.equals("ライオン")) {
				scientific = "パンテラ レオ";
			} 
			else if (name.equals("ゾウ")) {
				scientific = "ロキソドンタ・サイクロティス";
			} 
			else if (name.equals("パンダ")) {
				scientific = "アイルロポダ・メラノレウカ";
			} 
			else if (name.equals("チンパンジー")) {
				scientific = "パン・トゥログロディテス";
			} 
			else if (name.equals("シマウマ")) {
				scientific = "チャップマンシマウマ";
			} 
			else if (name.equals("インコ")) {
				scientific = "不明";
			}

			// Animalの呼び出し
			Animal animal = new Animal(name, length, speed, scientific);

			// null判定後に出力
			if (sca != null) {
				System.out.println("\n動物名: " + animal.getName() + "\n体長: " + animal.getLength() + "m" + 
									"\n速度: " + animal.getSpeed() + "km/h" + "\n学名: " + animal.getScientific());
			}
			// Scannerのclose
			sca.close();
		}
	}
}