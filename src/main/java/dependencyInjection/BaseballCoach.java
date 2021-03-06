package dependencyInjection;

public class BaseballCoach implements Coach{
	
	//prywatne pole dla zależności
	private FortuneService fortuneService;
	
	//konstruktor z zależnością
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
		// zależność - fortuneService
		return fortuneService.getFortune();
	}
}