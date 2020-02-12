import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignmentTwo {

	public static void main(String[] args)
	{
		Cat cat1 = new Cat("Fluffy", 150);
		Cat cat2 = new Cat("Sweety", 200, "yellow");
		Dog dog1 = new Dog("Duke", 10, 500);
		Dog dog2 = new Dog("Jason", 5);
		
				
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(cat1);
		animals.add(cat2);
		animals.add(dog1);
		animals.add(dog2);
		
		printAll("Before Sort", animals);
		Collections.sort(animals);
		printAll("After Sort", animals);
		System.out.println("");
		
		for(Animal animal : animals)
		{
			System.out.println("\nAnimal " + animal + " is a " + animal.getType() + " speaks by " + animal.speaksBy());
			animal.store();
			animal.load();
		}
		
	}
	
	private static void printAll(String title, List<Animal> animals)
	{
		System.out.println("\n" + title);
		
		for(Animal animal : animals) System.out.println(animal);
	}

}
