package dependencyInjection;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {}
	
	//metoda typu Set, do której wstrzykiwana jest zale¿noœæ
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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