
public class Cat extends Animal {
	
	final int limitOnRunnig = 200;

	@Override
	void run(int length) {
		System.out.println("����� ��������� " + (length < limitOnRunnig ? length : limitOnRunnig) + "�");
		
	}

	@Override
	void swim(int length) {
//		System.out.println("����� �� ����� �������");
		
	}
}
