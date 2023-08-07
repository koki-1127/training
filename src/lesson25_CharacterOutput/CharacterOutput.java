package lesson25_CharacterOutput;

import java.util.Scanner;

public class CharacterOutput {

	public static void main(String[] args) {

		// 名前入力のscanner宣言
		Scanner scan = new Scanner(System.in);

		// 名前入力の受け取り
		String str = scan.next();

		// 入力タイミングでコンストラクタの処理の呼び出し
		MainCharacterNumber dev = new MainCharacterNumber(str);

		// スーパークラスの画面表示メソッド呼び出し
		dev.introduce();
	}
}