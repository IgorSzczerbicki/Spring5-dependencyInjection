package dependencyInjection;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String title;
	private String email2;
	private String title2;
	
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
	
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	
	public String getEmail2() {
		return email2;
	}
	
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	
	public String getTitle2() {
		return title2;
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