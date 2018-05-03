package dependencyInjection;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Plan treningu dla baseballu";
	}
}
