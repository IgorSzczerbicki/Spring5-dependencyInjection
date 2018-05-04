package dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {

	public static void main(String[] args) {
		//za�adowanie pliku konfiguracji Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pobranie Bean'u z wstrzykiwaniem zale�no�ci do metody typu Set
		Coach theCricketCoach = context.getBean("myCricketCoach", Coach.class);
		
		//wywo�anie metod na Bean'ie
		System.out.println(theCricketCoach.getDailyWorkout());
		
		//metoda wykorzystuj�ca zale�no�� FortuneService
		System.out.println(theCricketCoach.getDailyFortune());
		
		//zamkni�cie kontekstu
		context.close();
	}

}