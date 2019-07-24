package chapter5;

public enum EnumExample {
	//5.6 枚举类
	SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

	private String abbreviation;
	
	private EnumExample(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
}


