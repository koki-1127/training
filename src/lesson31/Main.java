package lesson31;

class Main {
    public static void main(String[] args) {
    	
        Person person1 = new Person("鈴木太郎",20,1.7,60);
        person1.print();

        Person person2 = new Person("山田花子",22,1.5,40);
        person2.print();

        // 問３：クラス・フィールド "count "を使って「総人数は00人です」と出力する
        System.out.println("総人数は" + Person.count + "人です");
        
        // 問６：クラスメソッド "printCount "の呼び出し
        Person.printCount();
    }
}