
public class Cat extends Animal {
	
	final int limitOnRunnig = 200;

	@Override
	void run(int length) {
		System.out.println("Кошка пробежала " + (length < limitOnRunnig ? length : limitOnRunnig) + "м");
		
	}

	@Override
	void swim(int length) {
//		System.out.println("Кошка не умеет плавать");
		
	}
}
