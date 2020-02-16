//Dmitry Merezhko	ID: 025-947-712
//Charyl Enriquez   ID: 015392154
//Britney Khuu 		ID: 018577765

public class Cat extends Animal{
	private String color;
	public Cat(String name, int num) {
		this(name, num, "pink");
	}
	public Cat(String name, int num, String color_input) {
		super(name, num);
		color = color_input;
	}
	@Override
	public String getType() {
		return "Kitty";
	}
	//TODO
	@Override
	public String speaksBy() {
		return "meowing";
	}
	@Override
	public String toString() {
		return super.toString() + ", color = " + color;
	}
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Cat))return 0;
		else {
			Cat c = (Cat)o;
			return c.getKey()-this.getKey();
		}
	}
}
