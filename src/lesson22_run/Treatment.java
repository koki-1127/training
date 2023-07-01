package lesson22_run;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import lesson22_management.Management;

public class Treatment {

	public static void main(String[] args) {
		
		// 日付データの宣言
		Date Management_date = new Date();
		
		// 呼び出し（引数へ与えられた値を元に生成）
		Management japan_contents = new Management("こんにちは！ここは日本です！","この寿司はうまい","寿司は和食です","yyyy/MM/dd HH:mm:ss");
		
		// yyyy-MM-dd H:mm:ss の形式で変数に代入
		SimpleDateFormat date_format = new SimpleDateFormat(japan_contents.dateObj);
		
		// 指定の形式に合わせたデータを変数に代入
		String display_date = date_format.format(Management_date);
		
		// null判定をして出力処理
		String check_null = null;
		
		if (Objects.nonNull(japan_contents)) {
			System.out.println(japan_contents.jpn);
			System.out.println(japan_contents.sushi1);
			System.out.println(japan_contents.sushi2);
			System.out.println("今の現在日時は" + display_date + "です");
		} else {
			System.out.println(check_null);
		}
	}
}