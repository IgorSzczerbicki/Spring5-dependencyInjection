package dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {

	public static void main(String[] args) {
		//za³adowanie pliku konfiguracji Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pobranie Bean'u z wstrzykiwaniem zale¿noœci do metody typu Set
		Coach theCricketCoach = context.getBean("myCricketCoach", Coach.class);
		
		//wywo³anie metod na Bean'ie
		System.out.println(theCricketCoach.getDailyWorkout());
		
		//metoda wykorzystuj¹ca zale¿noœæ FortuneService
		System.out.println(theCricketCoach.getDailyFortune());
		
		//metoda pobieraj¹ca wstrzykniêty litera³
		System.out.println(((CricketCoach) theCricketCoach).getEmail());
		
		//metoda pobieraj¹ca wstrzykniêty litera³
		System.out.println(((CricketCoach) theCricketCoach).getTitle());
		
		//metoda pobieraj¹ca wstrzykniêty litera³ z pliku
		System.out.println(((CricketCoach) theCricketCoach).getEmail2());
		
		//metoda pobieraj¹ca wstrzykniêty litera³ z pliku
		System.out.println(((CricketCoach) theCricketCoach).getTitle2());
		
		//zamkniêcie kontekstu
		context.close();
	}
}
