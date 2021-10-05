package suraj_pkg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		//load the spring Configuration
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve bean from spring container
		Coach obj=context.getBean("myCoach",Coach.class);
		//call methods on beans
		System.out.println(obj.getDailyWorkOut());
		//close the context
		context.close();
	}

}
