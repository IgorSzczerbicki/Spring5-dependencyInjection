package dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//ladowanie pliku configuracji Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pobranie Bean'a z kontenera Spring
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//wywo³anie metod na Bean'ie
		System.out.println(theCoach.getDailyWorkout());
		
		//metoda wykorzystuj¹ca zale¿noœæ FortuneService
		System.out.println(theCoach.getDailyFortune());
		
		//zamkniêcie contextu
		context.close();
	}
}