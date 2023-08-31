
public class Dog extends Animal {
	
	final int limitOnRunnig = 500;
	final int limitOnSwimming = 10;

	@Override
	void run(int length) {
		System.out.println("Бобик пробежал " + (length < limitOnRunnig ? length : limitOnRunnig) + "м");
		
	}

	@Override
	void swim(int length) {
		System.out.println("Бобик проплыл " + (length < limitOnSwimming ? length : limitOnSwimming) + "м");
		
	}
}