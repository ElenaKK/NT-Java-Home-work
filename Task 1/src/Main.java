import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int qty;
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		//������� �����
		//�������� ��������, ������� ����� ������� ����������� - �� 1 �� 3
		qty = (int)Math.round(Math.random()*1000) % 3 + 1;
		for(int i = 0; i < qty; i++){
			animals.add(new Cat());
		}
		

		//������� �����
		//�������� ��������, ������� ����� ������� ����������� - �� 1 �� 3
		qty = (int)Math.round(Math.random()*1000) % 3 + 1;
		for(int i = 0; i < qty; i++){
			animals.add(new Dog());
		}
		
		
		//������� ������
		//�������� ��������, ������� ����� ������� ����������� - �� 1 �� 3
		qty = (int)Math.round(Math.random()*1000) % 3 + 1;
		for(int i = 0; i < qty; i++){
			animals.add(new Tiger());
		}
			
		//������� ��������
		//�������� ��������, ������� ����� ������� ����������� - �� 1 �� 3
		qty = (int)Math.round(Math.random()*1000) % 3 + 1;
		for(int i = 0; i < qty; i++){
			animals.add(new Bear());
		}
		
		int length;
		for(Animal animal : animals){
			length = (int)Math.round(Math.random()*1000);
			animal.run(length);
			animal.swim(length);
		}
		
		//����� ���������� ���� ��������
		System.out.println("����� ��������: " + animals.size());
	}

}
