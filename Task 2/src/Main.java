
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("���� ����", "vasya@mail.ru", true);
		Book b1 = new Book("��� ��������� ����", a1, 1000, 10);
		
		Author a2 = new Author("���� Ը���", "fa@mail.ru", false);
		Book b2 = new Book("�������-����������", a2, 2000, 1050);
		
		System.out.println(b2);
		System.out.println(b1);
	}

}
