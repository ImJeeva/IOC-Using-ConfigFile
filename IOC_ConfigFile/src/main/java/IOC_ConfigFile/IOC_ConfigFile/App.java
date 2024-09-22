package IOC_ConfigFile.IOC_ConfigFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Config.ConfigureFile;
import IOC_ConfigFile.IOC_ConfigFile.Customer.GoldCustomer;
import IOC_ConfigFile.IOC_ConfigFile.Customer.PlatinumCustomer;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ConfigureFile.class);
		GoldCustomer gc = (GoldCustomer)ac.getBean("goldCustomer");
		PlatinumCustomer pc = (PlatinumCustomer)ac.getBean("platinumCustomer");
		
		gc.disp();
		pc.disp();
		
	}
	
}
