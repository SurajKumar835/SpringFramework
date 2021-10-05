package suraj_pkg;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] arr= {"lucky daya","Lucky day","Lucky old day"};
		return arr[2];
	}

}
