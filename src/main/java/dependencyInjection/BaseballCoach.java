package dependencyInjection;

public class BaseballCoach implements Coach{
	
	//prywatne pole dla zale�no�ci
	private FortuneService fortuneService;
	
	//konstruktor z zale�no�ci�
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
		// zale�no�� - fortuneService
		return fortuneService.getFortune();
	}
}