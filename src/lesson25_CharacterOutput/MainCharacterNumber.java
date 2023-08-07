package lesson25_CharacterOutput;

import java.util.Random;

import lesson25_CharacterStatus.MainCharacterBase;

public class MainCharacterNumber extends MainCharacterBase {

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
}