import java.util.ArrayList;

/**
 * Shows method overriding: Once you override a method, there is no way for the
 * main() to get back to the superclass's version of it, even by casting.
 */
public class TestOverridding {
	public static void main(String args[]) {
		Mammal m;
		m = new Mammal();
		m.print();
		Dog d = new Dog();
		d.print();
		((Mammal) d).print();
		ArrayList<Mammal> a = new ArrayList<Mammal>() ;
		a.add(d);
		a.add(m);
		a.get(1).print();
		for (int i = 0; i < 2; i++){
			if (a.get(i) instanceof Mammal){
				((Mammal) a.get(i)).print();
			}
			else if (a.get(i) instanceof Dog){
				((Dog)a.get(i)).print();
			}
		}
	}
}
/**
 * Console:
 * Open Mammal
 * Inside Mammal's version of print()
 * Open Mammal
 * Open Dog
 * Inside Dog's version of print()
 * Inside Dog's version of print()
 * Inside Mammal's version of print()
 * Inside Dog's version of print()
 * Inside Mammal's version of print()
 */