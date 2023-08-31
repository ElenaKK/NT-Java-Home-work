import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
	 Программа проверяет автомобильный номер на соответствие российскому стандарту
	 
	 Программой воспринимаются форматы: а111а63 А111ААRUS63 А111АА163 А111ааRUS163 с пробелами в любых местах и буквами разных регистров
	 
	 Реализованы проверки на длину номера, что на месте букв буквы, а на месте цифр цифры, допустимость букв, допустимость номера региона и т.д.
	 */
	
	public static ArrayList<Integer> regions;
	public static ArrayList<String> letters;
	
	static{
		//создаем список трехзначных номеров регионов
		Integer[] array = {102
				,
				103
				,
				109
				,
				111
				,
				116
				,
				118
				,
				121
				,
				123
				,
				124
				,
				125
				,
				126
				,
				130
				,
				134
				,
				136
				,
				138
				,
				139
				,
				142
				,
				152
				,
				154
				,
				155
				,
				156
				,
				158
				,
				159
				,
				161
				,
				163
				,
				164
				,
				169
				,
				173
				,
				174
				,
				177
				,
				178
				,
				180
				,
				181
				,
				184
				,
				185
				,
				186
				,
				192
				,
				193
				,
				196
				,
				197
				,
				199
				,
				198
				,
				702
				,
				716
				,
				754
				,
				761
				,
				763
				,
				774
				,
				777
				,
				797
				,
				799
				,
				977
		};

        regions = new ArrayList<Integer>(Arrays.asList(array));
        
        //добавляем в список номеров регионов двузначные от 1 до 99
        for(int i = 1; i < 100; i++){
        	regions.add(i);
        }
        
        //создаем список допутимых букв
        String[] array2 = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        letters = new ArrayList<String>(Arrays.asList(array2));

	}
	
	public static void processing(){
		Scanner in = new Scanner(System.in);
		String source;
		do{
		    System.out.print("Введите номер автомобиля (для выхода введите Exit): ");
	        source = in.nextLine();
	        source = source.replaceAll(" ", "");
//	        System.out.println(source);
	        String firstLetter = "";
	        String numberStr = "";
	        int number;
	        String secondLetters = "";
	        String rus = "";
	        String regionStr = "";
	        int region;
	        
	        if(source.isEmpty()){
	        	continue;
	        }
	        else if(source.equals("Exit")){
	        	break;
	        }
	        else if(source.length() < 8){
	        	System.out.println("Слишком короткий номер");
	        	continue;
	        }
	        // разбиваем на секции букв и цифр номера вида а111аа11 и а111аа111
	        else if((source.length() == 8) || (source.length() == 9)){
	        	firstLetter = source.substring(0, 1);
	        	numberStr = source.substring(1, 4);
	           	secondLetters = source.substring(4, 6);
	           	
	           	regionStr = source.substring(6);
	        }
	        // разбиваем на секции букв и цифр номера вида а111ааRUS11 и а111ааRUS111
	        else if((source.length() == 11) || (source.length() == 12)){
	        	firstLetter = source.substring(0, 1);
	        	numberStr = source.substring(1, 4);
	           	secondLetters = source.substring(4, 6);
	           	rus = source.substring(6, 9);
	           	regionStr = source.substring(9);
	        }
	        else{
	        	System.out.println("Неправильная длина номера");
	        	continue;
	        }
	        
	        /*System.out.println("firstLetter: " + firstLetter);
	        System.out.println("numberStr: " + numberStr);
	        System.out.println("secondLetters: " + secondLetters);
	        System.out.println("rus: " + rus);
	        System.out.println("regionStr: " + regionStr);
	        */
	        
	        // проверяем валидность первой буквы в номере
	        if(!letters.contains(firstLetter.toUpperCase())){
	        	System.out.println("Недопустимая буква: " + firstLetter + ". Допустимы: " + letters.toString());
	        }
	        else{
	        	
	        	//проверяем, что следом идут 3 цифры
	        	try{
	        		number = Integer.parseInt(numberStr);
	        	}
	        	catch(NumberFormatException e){
	        		System.out.println("Неправильная цифра в номере: " + numberStr);
	        		continue;
	        	}
	        	
	        	// проверяем валидность следующих букв в номере
		        if(!letters.contains(secondLetters.substring(0, 1).toUpperCase())
		        		|| !letters.contains(secondLetters.substring(1, 2).toUpperCase())){
		        	
		        	System.out.println("Содержится недопустимая буква: " + secondLetters + ". Допустимы: " + letters.toString());
		        	continue;
		        }
		        // проверяем на правильность секцию RUS, если она есть
		        else if(!rus.isEmpty() && !rus.toUpperCase().equals("RUS")){
		        	System.out.println("Невалидная секция 'RUS'");
		        	continue;
		        }
		        else{
		        	//проверяем, что секция региона заполнена цифрами
		        	try{
		        		region = Integer.parseInt(regionStr);
		        	}
		        	catch(NumberFormatException e){
		        		System.out.println("Регион должен заполнятся только цифрами: " + regionStr);
		        		continue;
		        	}
		        	
		        	//проверяем, что номер региона из списка допустимых номеров регионов
		        	if(!regions.contains(region)){
		        		System.out.println("Недопустимый код региона: " + region);
		        	}
		        	else{
		        		System.out.println("Номер соответствует формату федеральных номерных знаков и принадлежит региону " + region);
		        	}
		        }
	        }
		}
		while (!source.equals("Exit"));
		in.close();
	}

	public static void main(String[] args) {
		processing();
	}

}
