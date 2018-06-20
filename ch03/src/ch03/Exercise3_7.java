package ch03;

public class Exercise3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)((5f/9f * (fahrenheit - 32))*100+0.5)/100.0f;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		}
}
