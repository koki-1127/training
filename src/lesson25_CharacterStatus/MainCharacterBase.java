package lesson25_CharacterStatus;

public class MainCharacterBase {
    // フィールド
    private String Name;
    private int HP,MP,Atack,Speed,Defense;
    
    // 引数なしコンストラクタ
    public MainCharacterBase() {
    }
    
    // 引数ありコンストラクタ
    public MainCharacterBase(String Name,int HP,int MP,int Atack,int Speed,int Defense) {
        this.Name = Name;
        this.HP = HP;
        this.MP = MP;
        this.Atack = Atack;
        this.Speed = Speed;
        this.Defense = Defense;
    }
    
    // getter setter
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public int getMP() {
        return MP;
    }
    public void setMP(int MP) {
        this.MP = MP;
    }
    public int getAtack() {
        return Atack;
    }
    public void setAtack(int Atack) {
        this.Atack = Atack;
    }
    public int getSpeed() {
        return Speed;
    }
    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }
    public int getDefense() {
        return Defense;
    }
    public void setDefense(int Defense) {
        this.Defense = Defense;
    }
 
    @Override
    public String toString() {
      return "HP:" + this.HP + "\nMP:" + this.MP + 
      "\n攻撃力:" + this.Atack + "\n素早さ:" + this.Speed + 
      "\n防御力:" + this.Defense + "\n\nさあ冒険に出かけよう!";
    }
}