package lesson22_management;

public class Management {
	/*
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
	*/
	
	// それぞれの変数宣言
	public String jpn;
	public String sushi1;
	public String sushi2;
	public String dateObj;
	
	// それぞれの引数に変数を代入
	public Management(String jpn, String sushi1, String sushi2, String dateObj) {
		this.jpn = jpn;
		this.sushi1 = sushi1;
		this.sushi2 = sushi2;
		this.dateObj = dateObj;
	}
}