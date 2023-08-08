package lesson25_CharacterStatus;

import java.util.Random;

public class MainCharacterNumber extends MainCharacterBase {
	
	// フィールド
    private String Name;

    // 引数なしコンストラクタ
    public MainCharacterNumber() {
    }

    // 引数ありコンストラクタ
    public MainCharacterNumber(String CharacterName) {
    	
    	// ランダムの宣言
    	Random rnd = new Random();
    	
    	// メソッドにそれぞれ値を参照
    	super.setName(CharacterName);
    	super.setHP(rnd.nextInt(999)+1);
    	super.setMP(rnd.nextInt(999)+1);
    	super.setAtack(rnd.nextInt(999)+1);
    	super.setSpeed(rnd.nextInt(999)+1);
    	super.setDefense(rnd.nextInt(999)+1);
    }
    
    @Override
    public String toString() {
    	return "こんにちは 「" + this.Name + "」 さん\nステータス\n" +
    	super.toString();
    }
}