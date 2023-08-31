import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task4 {
	
	final static String sourceFileName = "poem.txt";
	final static String destFilePrefix = "part";
	final static String destFilePostfix = ".txt";
	
	// Задание 4.1
	public static void cutting(String fileName){

		FileInputStream fin;
		try {
			fin = new FileInputStream(fileName);
			Scanner sc = new Scanner(fin);
			String s;
			int i = 1;
			BufferedWriter writer = new BufferedWriter(new FileWriter(destFilePrefix + i + destFilePostfix));
			while(sc.hasNextLine()){
				s = sc.nextLine();
				if(s.isEmpty()){
					writer.close();
					writer = new BufferedWriter(new FileWriter(destFilePrefix + ++i + destFilePostfix));
				}
				else{
					writer.write(s);
				}
				
			}
			writer.close();
			sc.close();
			fin.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Задание 4.2
	public static void printing(String fileName){
		Queue <String> q = new LinkedList<>();
		
		FileInputStream fin;
		String s;
		try {
			fin = new FileInputStream(fileName);
			Scanner sc = new Scanner(fin);
			while(sc.hasNextLine()){
				s = sc.nextLine();
				q.add(s);
			}

			sc.close();
			fin.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int time;
		int size = q.size();
		try{
			for(int i = 0; i < size; i++){
				s = q.poll();
				time = 1000 + (int)(Math.random()*2000);
				Thread.sleep(time);
//				System.out.println(time);
				System.out.println(s);
			}
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}

	public static void main(String[] args) {
		
		cutting(sourceFileName);
		printing(sourceFileName);
		
	}

}
