
public class Tiger extends Animal {
	
	final int limitOnRunnig = 600;
	final int limitOnSwimming = 5;

	@Override
	void run(int length) {
		System.out.println("���� �������� " + (length < limitOnRunnig ? length : limitOnRunnig) + "�");
		
	}

	@Override
	void swim(int length) {
		System.out.println("���� ������� " + (length < limitOnSwimming ? length : limitOnSwimming) + "�");
		
	}
}
