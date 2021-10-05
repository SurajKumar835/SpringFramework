package suraj_pkg;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public CricketCoach() {}
	@Override
	public String getDailyWorkOut() {
		return "Cricket Fast Bowling 22 yards praticse";
	}

	@Override
	public String getDailyFortune() {
		
		return "CricketCoach"+fortuneService.getFortune();
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

}
