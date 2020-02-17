//Dmitry Merezhko	ID: 025-947-712
//Charyl Enriquez   ID: 015392154
//Britney Khuu 		ID: 018577765

public class Dog extends Animal {
	private double weight; 
	public Dog(String name, int num) {
		this(name, num, 100);
	}
	public Dog(String name, int num, double weight_input) {
		super(name, num);
		weight = weight_input;
	}
	@Override
	public String getType() {
		return "Doggie";
	}
	// TODO
	@Override 
	public String speaksBy() {
		return "barking";
	}
	
	@Override
	public void store()
	{
		System.out.println(toString() + " being stored in coach");
	}
	
	@Override
	public void load()
	{
		System.out.println(toString() + " being loaded from kennel");
	}
	
	@Override
	public String toString() {
		return super.toString() + ", weight = " + weight;
	}
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Dog))return 0;
		else {
			Dog d = (Dog)o;
			return this.getKey()-d.getKey();
		}
	}
}
