package classwork.lesson170901;

import classwork.lesson170828.concurrency.Utils;

public class EnumExamples {
//	public final static int WINTER = 0;
//	public final static int SPRING = 0;
//	public final static int SUMMER = 0;
//	public final static int AUTUMN = 0;
	
	public static void main(String[] args) {
		System.out.println("start");
		Seasons s;
		Utils.pause(5000);
		for(Seasons season : Seasons.values()) {
			System.out.println(season +" " + season.ordinal());
		}
		
//		new Swason(); FORBIDDEN!
		
//		Seasons curentSeason = Seasons.AUTUMN;
		Seasons curentSeason = Seasons.valueOf(args[0]);

		switch(curentSeason) {
		case WINTER:
			System.out.println("Бери зонт!");
			break;
		case SPRING:
			System.out.println("Достань зонт!");
			break;
		case SUMMER:
			System.out.println("Не убирай зонт!");
			break;
		case AUTUMN:
			System.out.println("Пора по грибы");
			break;
		default:
			break;
		}
		
		Singleton.INSTANSE.getState();
		
	}

}
