package jp.co.aforce.test;

public class Main {
	public static void main(String[] args) {
		PracticeTest8 test = new PracticeTest8();
		
		//1
		test.printHello();
		
		//2
		test.printRandomMessage();
		
		//3
		test.printMessage("Hello");
		
		//4
		test.printMessage("Hello",5);
		
		//5
		test.printRectangleArea(2,8);
		
		//6
		String weather = test.getWeatherForecast();
		System.out.println(weather);
		
		//7
		boolean number = test.isEvenNumber(4);
		System.out.println(number);
		
		//8
//		String n = test.getMessage("うい", 4);
//		System.out.println(n);
		
		
		//9
		String[] a = {"ゆうと", "りんたろう", "ゆうま", "せな"};
		String PracticeTest8 = test.getLongestString(a);
		
		//10
		Person person = new Person("せな",21);
		boolean isAdult = test.isAdult(person);
		System.out.println(isAdult);
	}
}
