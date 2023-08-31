
public class Bear extends Animal {
	
	final int limitOnRunnig = 700;
	final int limitOnSwimming = 100;

	@Override
	void run(int length) {
		System.out.println("Ìוהגוהü ןנמבוזאכ " + (length < limitOnRunnig ? length : limitOnRunnig) + "ל");
		
	}

	@Override
	void swim(int length) {
		System.out.println("Ìוהגוהü ןנמןכûכ " + (length < limitOnSwimming ? length : limitOnSwimming) + "ל");
		
	}
}
