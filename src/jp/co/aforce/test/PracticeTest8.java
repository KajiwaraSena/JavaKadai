package jp.co.aforce.test;

public class PracticeTest8 {
	
	//1
	public void printHello() {
		System.out.println("Hello");
	}
	
	//2
	public void printRandomMessage() {
		String[] str = new String[3];  
		str[0] = "こんばんは";
		str[1] = "こんにちは";
		str[2] = "おはよう";
		int n = (int)(3 * Math.random());
		System.out.println(str[n]);
	}
	
	//3
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	//4
	public void printMessage(String message, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}
	
	//5
	public void printRectangleArea(double height,double width) {
		System.out.println(height * width);
	}
	
	//6
	public String getWeatherForecast() {
		String[] day = { "今日", "明日", "明後日" };
		String[] weather = { "晴れ", "曇り", "雨", "雪"};
		int daybox = (int)(3 * Math.random());
		int weatherbox = (int)(4 * Math.random());
		return String.format("%sの天気は%sでしょう",day[daybox],weather[weatherbox]);
	}
	
	//7
	public boolean isEvenNumber(int value) {
		if(value % 2 == 0)
			return true;
		else
			return false;
	}
	
	//8
	public String getMessage(String name, boolean isKid) {
		String s = "";
		if(isKid) {
			s="ちゃん";
		}else {
			s="さん";
		}
		return("こんにちは" + name + s);
	}
	
	//9
	public String getLongestString(String[] array) {
		String nekoName = null;
		int n = array[0].length();
		
		for (int i = 1; i < array.length; i++) {
			if (n < array[i].length()) {
				n = array[i].length();
				System.out.println(array[i]);
				}
			}	
			
		return nekoName;
		}
	
	//10
	public boolean isAdult(Person person) {
		if(person.getAge() >= 20) 
			return true;
		else 
			return false;	
	}	
}
