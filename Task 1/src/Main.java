import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int qty;
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		//Создаем котов
		//Рандомно получаем, сколько нужно создать экземпляров - от 1 до 3
		qty = (int)Math.round(Math.random()*1000) % 3 + 1;
		for(int i = 0; i < qty; i++){
			animals.add(new Cat());
		}
		

		//Создаем собак
		//Рандомно получаем, сколько нужно создать экземпляров - от 1 до 3
		qty = (int)Math.round(Math.random()*1000) % 3 + 1;
		for(int i = 0; i < qty; i++){
			animals.add(new Dog());
		}
		
		
		//Создаем тигров
		//Рандомно получаем, сколько нужно создать экземпляров - от 1 до 3
		qty = (int)Math.round(Math.random()*1000) % 3 + 1;
		for(int i = 0; i < qty; i++){
			animals.add(new Tiger());
		}
			
		//Создаем медведей
		//Рандомно получаем, сколько нужно создать экземпляров - от 1 до 3
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
		
		//Вывод количества всех животных
		System.out.println("Всего животных: " + animals.size());
	}

}
