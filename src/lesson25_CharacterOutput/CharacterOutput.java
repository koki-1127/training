package lesson25_CharacterOutput;

import java.util.Scanner;

import lesson25_CharacterStatus.MainCharacterNumber;

public class CharacterOutput {

	public static void main(String[] args) {

		// 名前入力のscanner宣言
		Scanner scan = new Scanner(System.in);

		// 名前入力の受け取り
		String str = scan.next();

		// 入力タイミングでコンストラクタの処理の呼び出し
		MainCharacterNumber dev = new MainCharacterNumber(str);

		// nullチェックの後出力
		if (str != null) {
			System.out.println(dev);
		}

		// Scannerのclose
		scan.close();
	}
}