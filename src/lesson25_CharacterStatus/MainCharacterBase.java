package lesson25_CharacterStatus;

public class MainCharacterBase {
	// フィールド
	private String name;
	private int hp,mp,atack,speed,defense;

	// 引数なしコンストラクタ
	public MainCharacterBase() {
	}

	// 引数ありコンストラクタ
	public MainCharacterBase(String Name,int HP,int MP,int Atack,int Speed,int Defense) {
		this.name = Name;
		this.hp = HP;
		this.mp = MP;
		this.atack = Atack;
		this.speed = Speed;
		this.defense = Defense;
	}

	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public int getHP() {
		return hp;
	}
	public void setHP(int HP) {
		this.hp = HP;
	}
	public int getMP() {
		return mp;
	}
	public void setMP(int MP) {
		this.mp = MP;
	}
	public int getAtack() {
		return atack;
	}
	public void setAtack(int Atack) {
		this.atack = Atack;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int Speed) {
		this.speed = Speed;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int Defense) {
		this.defense = Defense;
	}

	@Override
	public String toString() {
		return "HP:" + this.hp + "\nMP:" + this.mp + 
				"\n攻撃力:" + this.atack + "\n素早さ:" + this.speed + 
				"\n防御力:" + this.defense + "\n\nさあ冒険に出かけよう!";
	}
}