package suraj_pkg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach obj=context.getBean("myCricket",CricketCoach.class);
		System.out.println(obj.getDailyWorkOut());
		System.out.println(obj.getDailyFortune());
		System.out.println(obj.getEmailAddress());
		System.out.println(obj.getTeam());
		context.close();

	}

}
