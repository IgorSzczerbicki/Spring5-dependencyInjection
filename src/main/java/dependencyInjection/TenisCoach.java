package dependencyInjection;

public class TenisCoach implements Coach{

	private FortuneService fortuneService;
	
	public TenisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Plan treningu dla tenisa";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
