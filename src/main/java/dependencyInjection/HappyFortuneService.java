package dependencyInjection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Szczêœliwa wró¿ba";
	}
}