
public class Main {

	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
	}
	
	// Problem 1: Language Basics
	private static void problem1() {
		
		int diameter_sun = 865000;
		int diameter_earth = 7600;
		
		double radius_sun = diameter_sun / 2;
		double radius_earth = diameter_earth / 2;
		
		double volume_sun = calculateVolume(radius_sun);
		double volume_earth = calculateVolume(radius_earth);
		
		System.out.println("The volume of Earth is " + String.format("%.2f", volume_earth) + " cubic miles, the volume of the sun is " + String.format("%.2f", volume_sun) + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is " + String.format("%.2f", volume_sun/volume_earth) + ".");
		
	}
	
	private static double calculateVolume(double radius) {
		return 4/3*Math.PI*Math.pow(radius, 3);
	}
	
	// Problem 2: Language Basics
	private static void problem2() {
		int nValues = 50;
		
		for (int i = 2; i <= nValues; i++) {
			
			if(primeCheck(i, 2)) 
				continue;
			
			System.out.println(i);
			
		}
	}
	
	private static boolean primeCheck(int n, int m) {
		if(m > Math.sqrt(n)) {
			return false;
		}
		if(n % m == 0) {
			return true;
		}
		return primeCheck(n, m+1);
	}
	
	// Problem 3: Object Basics
	private static void problem3() {
		
		String text = "To be or not to be, that is the question;"
				+"Whether `tis nobler in the mind to suffer" 
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing end them?";
		int spaces = 0,
				vowels = 0,
				letters = 0;
		
		char c;
		for (int i = 0; i < text.length(); i++) {
			c = text.toLowerCase().charAt(i);
			
			if (c == ' ')
				spaces++;
			else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vowels++;
			
			if (c >= 'a' && c <= 'z')
				letters++;			
		}
		
		System.out.println("The text contained vowels: " + vowels + "\n" + "consonants " + (letters - vowels) + "\n" + "spaces: " + spaces);
		
		
	}
	
	
	// Problem 4: Object Basics
	private static void problem4() {
		
	}

}
