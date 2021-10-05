package suraj_pkg;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService thefortuneService)
	{
		fortuneService=thefortuneService;
	}
	public String getDailyWorkOut() {
		return "Run 1 Km first";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
