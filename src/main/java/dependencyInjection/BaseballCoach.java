package dependencyInjection;

public class BaseballCoach implements Coach{
	
	//prywatne pole dla zale¿noœci
	private FortuneService fortuneService;
	
	//konstruktor z zale¿noœci¹
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Plan treningu dla baseballu";
	}

	@Override
	public String getDailyFortune() {
		// zale¿noœæ - fortuneService
		return fortuneService.getFortune();
	}
}