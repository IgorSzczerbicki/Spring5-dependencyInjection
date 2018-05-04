package dependencyInjection;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String title;
	
	public CricketCoach() {}
	
	//metoda typu Set, do której wstrzykiwana jest zale¿noœæ
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	//metoda typu Set, do której wstrzykiwana jest wartosc literalu
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	//metoda typu Set, do której wstrzykiwana jest wartosc literalu
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	@Override
	public String getDailyWorkout() {
		return "Plan treningu dla krykietu";
	}

	@Override
	public String getDailyFortune() {
		return "CricketCoach: " + fortuneService.getFortune();
	}
}