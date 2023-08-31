
public class Bear extends Animal {
	
	final int limitOnRunnig = 700;
	final int limitOnSwimming = 100;

	@Override
	void run(int length) {
		System.out.println("������� �������� " + (length < limitOnRunnig ? length : limitOnRunnig) + "�");
		
	}

	@Override
	void swim(int length) {
		System.out.println("������� ������� " + (length < limitOnSwimming ? length : limitOnSwimming) + "�");
		
	}
}
