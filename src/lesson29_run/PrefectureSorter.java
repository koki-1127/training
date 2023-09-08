package lesson29_run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import lesson29_management.Prefecture;

public class PrefectureSorter {
	public static void main(String[] args) {

		// 入力宣言
		Scanner scanner = new Scanner(System.in);

		// リストの作成
		List<Prefecture> prefectures = new ArrayList<>();
		prefectures.add(new Prefecture("北海道","札幌市",83424));
		prefectures.add(new Prefecture("青森県","青森市",9646));
		prefectures.add(new Prefecture("岩手県","盛岡市",15275));
		prefectures.add(new Prefecture("宮城県","仙台市",7282));
		prefectures.add(new Prefecture("秋田県","秋田市",11638));
		prefectures.add(new Prefecture("山形県","山形市",9323));
		prefectures.add(new Prefecture("福島県","福島市",13784));
		prefectures.add(new Prefecture("茨城県","水戸市",6097));
		prefectures.add(new Prefecture("栃木県","宇都宮市",6408));
		prefectures.add(new Prefecture("群馬県","前橋市",6362));
		prefectures.add(new Prefecture("埼玉県","さいたま市",3798));

		// メッセージ表示
		System.out.println("0～10の数字をカンマ区切りで入力して下さい");

		// 出力する数字入力の受け取り
		String userInput = scanner.nextLine();

		// メッセージ表示
		System.out.println("昇順,降順どちらにしますか\n昇順なら0、降順なら1を入力してください");

		// 昇順か降順を決める入力の受け取り
		String sortOrder = scanner.nextLine();

		// カンマで区切った入力の受け取り
		String[] inputValues = userInput.split(",");

		// 入力した数字の文言をリストに格納
		List<Integer> indices = new ArrayList<>();

		// 入力リスト分for文を回す
		for (String trimmedValue : inputValues) {

			// 空でないか値をチェック
			if (!trimmedValue.isEmpty()) {

				// 整数の場合入力された分のリストを生成
				indices.add(Integer.parseInt(trimmedValue));
			}
			// 入力が空の場合、nullの出力
			else {
				System.out.println("null");
			}
		}

		// スキャナーを閉じる
		scanner.close();

		// ユーザーの選択に基づいて並び替えする
		if ("0".equalsIgnoreCase(sortOrder)) {

			// 昇順に並べ替え
			Collections.sort(indices);
		}
		
		// 降順に並べ替え
		else {
			Collections.sort(indices, Collections.reverseOrder());
		}

		// 並び替えた順に都道府県を出力する
		for (int index : indices) {

			// リストの数分、条件を回す
			if (index < prefectures.size()) {

				// indexを変数に格納
				Prefecture prefecture = prefectures.get(index);

				// nullチェック後、並び替えた順に都道府県を出力
				if (prefecture != null) {
					System.out.println(prefecture);
				} 
				else {
					System.out.println("null");
				}
			} 
		}

	}
}
