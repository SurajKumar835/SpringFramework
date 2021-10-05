package suraj_pkg;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
		
	public TrackCoach() {		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	

	@Override
	public String getDailyWorkOut() {
		
		return "Run 2 Km second";
	}

	@Override
	public String getDailyFortune() {
		return "Lucky Day ! TrackCoach"+fortuneService.getFortune();
	}
// add init and destroy methodbean lifecycle
	public void doMyStuff()
	{
		System.out.println("trackcoach:init method");
	}
	public void doMyCleanStuff()
	{
		System.out.println("trackcoach:destroy method");
	}
	
}
