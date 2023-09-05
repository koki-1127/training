package lesson29_management;

public class Prefecture {
	
	// フィールドの生成
	private String name;
	private String prefecturalOffice;
	private double area;
	
	// コンストラクタの生成
	public Prefecture(String name, String prefecturalOffice, double area) {
		this.name = name;
		this.prefecturalOffice = prefecturalOffice;
		this.area = area;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getPrefecturalOffice() {
		return prefecturalOffice;
	}
	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "都道府県名：" + name + "\n" +
				"県庁所在地：" + prefecturalOffice + "\n" +
				"面積：" + area + "km2\n";
	}
}
