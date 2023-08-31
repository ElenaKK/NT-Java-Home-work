
public class Dog extends Animal {
	
	final int limitOnRunnig = 500;
	final int limitOnSwimming = 10;

	@Override
	void run(int length) {
		System.out.println("����� �������� " + (length < limitOnRunnig ? length : limitOnRunnig) + "�");
		
	}

	@Override
	void swim(int length) {
		System.out.println("����� ������� " + (length < limitOnSwimming ? length : limitOnSwimming) + "�");
		
	}
}