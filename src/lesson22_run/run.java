package lesson22_run;

import java.text.SimpleDateFormat;
import java.util.Date;

import lesson22_management.management;

public class run {

	public static void main(String[] args) {
		
		// 日付データの宣言
		Date dateObj = new Date();
		
		// 呼び出し（引数へ与えられた値を元に生成）
		management japan = new management("こんにちは！ここは日本です！","この寿司はうまい","寿司は和食です","yyyy/MM/dd HH:mm:ss");
		
		// yyyy-MM-dd H:mm:ss の形式で変数に代入
		SimpleDateFormat format = new SimpleDateFormat(japan.dateObj);
		
		// 指定の形式に合わせたデータを変数に代入
		String display = format.format(dateObj);
		
		// 出力処理
		System.out.println(japan.jpn);
		System.out.println(japan.sushi1);
		System.out.println(japan.sushi2);
		System.out.println("今の現在日時は" + display + "です");

	}
}