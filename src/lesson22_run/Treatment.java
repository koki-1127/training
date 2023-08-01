package lesson22_run;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import lesson22_management.Management;

public class Treatment {

	public static void main(String[] args) {
		
		// 日付データの宣言
		Date ManagementDate = new Date();
		
		// 呼び出し（引数へ与えられた値を元に生成）
		Management japanContents = new Management("こんにちは！ここは日本です！","この寿司はうまい","寿司は和食です","yyyy/MM/dd HH:mm:ss");
		
		// yyyy-MM-dd H:mm:ss の形式で変数に代入
		SimpleDateFormat dateFormat = new SimpleDateFormat(japanContents.date);
		
		// 指定の形式に合わせたデータを変数に代入
		String displayDate = dateFormat.format(ManagementDate);
		
		// null判定をして出力処理
		String checkNull = null;
		
		if (Objects.nonNull(japanContents)) {
			System.out.println(japanContents.helloJpn);
			System.out.println(japanContents.sushiTasty);
			System.out.println(japanContents.sushiJapaneseFood);
			System.out.println("今の現在日時は" + displayDate + "です");
		} else {
			System.out.println(checkNull);
		}
	}
}