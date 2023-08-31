
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("Дядя Вася", "vasya@mail.ru", true);
		Book b1 = new Book("Как вырастить репу", a1, 1000, 10);
		
		Author a2 = new Author("Тетя Фёкла", "fa@mail.ru", false);
		Book b2 = new Book("Барышня-крестьянка", a2, 2000, 1050);
		
		System.out.println(b2);
		System.out.println(b1);
	}

}
