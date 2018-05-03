package dependencyInjection;

public class TenisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Plan treningu dla tenisa";
	}
	
}
