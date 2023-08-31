import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
	 ��������� ��������� ������������� ����� �� ������������ ����������� ���������
	 
	 ���������� �������������� �������: �111�63 �111��RUS63 �111��163 �111��RUS163 � ��������� � ����� ������ � ������� ������ ���������
	 
	 ����������� �������� �� ����� ������, ��� �� ����� ���� �����, � �� ����� ���� �����, ������������ ����, ������������ ������ ������� � �.�.
	 */
	
	public static ArrayList<Integer> regions;
	public static ArrayList<String> letters;
	
	static{
		//������� ������ ����������� ������� ��������
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
        
        //��������� � ������ ������� �������� ���������� �� 1 �� 99
        for(int i = 1; i < 100; i++){
        	regions.add(i);
        }
        
        //������� ������ ��������� ����
        String[] array2 = {"�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�"};
        letters = new ArrayList<String>(Arrays.asList(array2));

	}
	
	public static void processing(){
		Scanner in = new Scanner(System.in);
		String source;
		do{
		    System.out.print("������� ����� ���������� (��� ������ ������� Exit): ");
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
	        	System.out.println("������� �������� �����");
	        	continue;
	        }
	        // ��������� �� ������ ���� � ���� ������ ���� �111��11 � �111��111
	        else if((source.length() == 8) || (source.length() == 9)){
	        	firstLetter = source.substring(0, 1);
	        	numberStr = source.substring(1, 4);
	           	secondLetters = source.substring(4, 6);
	           	
	           	regionStr = source.substring(6);
	        }
	        // ��������� �� ������ ���� � ���� ������ ���� �111��RUS11 � �111��RUS111
	        else if((source.length() == 11) || (source.length() == 12)){
	        	firstLetter = source.substring(0, 1);
	        	numberStr = source.substring(1, 4);
	           	secondLetters = source.substring(4, 6);
	           	rus = source.substring(6, 9);
	           	regionStr = source.substring(9);
	        }
	        else{
	        	System.out.println("������������ ����� ������");
	        	continue;
	        }
	        
	        /*System.out.println("firstLetter: " + firstLetter);
	        System.out.println("numberStr: " + numberStr);
	        System.out.println("secondLetters: " + secondLetters);
	        System.out.println("rus: " + rus);
	        System.out.println("regionStr: " + regionStr);
	        */
	        
	        // ��������� ���������� ������ ����� � ������
	        if(!letters.contains(firstLetter.toUpperCase())){
	        	System.out.println("������������ �����: " + firstLetter + ". ���������: " + letters.toString());
	        }
	        else{
	        	
	        	//���������, ��� ������ ���� 3 �����
	        	try{
	        		number = Integer.parseInt(numberStr);
	        	}
	        	catch(NumberFormatException e){
	        		System.out.println("������������ ����� � ������: " + numberStr);
	        		continue;
	        	}
	        	
	        	// ��������� ���������� ��������� ���� � ������
		        if(!letters.contains(secondLetters.substring(0, 1).toUpperCase())
		        		|| !letters.contains(secondLetters.substring(1, 2).toUpperCase())){
		        	
		        	System.out.println("���������� ������������ �����: " + secondLetters + ". ���������: " + letters.toString());
		        	continue;
		        }
		        // ��������� �� ������������ ������ RUS, ���� ��� ����
		        else if(!rus.isEmpty() && !rus.toUpperCase().equals("RUS")){
		        	System.out.println("���������� ������ 'RUS'");
		        	continue;
		        }
		        else{
		        	//���������, ��� ������ ������� ��������� �������
		        	try{
		        		region = Integer.parseInt(regionStr);
		        	}
		        	catch(NumberFormatException e){
		        		System.out.println("������ ������ ���������� ������ �������: " + regionStr);
		        		continue;
		        	}
		        	
		        	//���������, ��� ����� ������� �� ������ ���������� ������� ��������
		        	if(!regions.contains(region)){
		        		System.out.println("������������ ��� �������: " + region);
		        	}
		        	else{
		        		System.out.println("����� ������������� ������� ����������� �������� ������ � ����������� ������� " + region);
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
