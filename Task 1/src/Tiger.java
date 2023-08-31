
public class Tiger extends Animal {
	
	final int limitOnRunnig = 600;
	final int limitOnSwimming = 5;

	@Override
	void run(int length) {
		System.out.println("Тигр пробежал " + (length < limitOnRunnig ? length : limitOnRunnig) + "м");
		
	}

	@Override
	void swim(int length) {
		System.out.println("Тигр проплыл " + (length < limitOnSwimming ? length : limitOnSwimming) + "м");
		
	}
}
