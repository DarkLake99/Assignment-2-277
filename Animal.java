//Dmitry Merezhko	ID: 025-947-712
//Charyl Enriquez   ID: 015392154
//Britney Khuu 		ID: 018577765

public abstract class Animal implements Comparable<Object>,Storable, Talkable{
	public Animal(String name, int num){
		mName = name;
		orderKey = num;
	}
	public String getName() {
		return mName;
	}
	public int getKey() {
		return orderKey;
	}
	public abstract String getType();
	
	@Override
	public String toString() {
		return "("+mName+","+orderKey+")";
	}
	private String mName;
	private int orderKey;
}
