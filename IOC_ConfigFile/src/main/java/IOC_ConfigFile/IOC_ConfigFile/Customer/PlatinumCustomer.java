package IOC_ConfigFile.IOC_ConfigFile.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class PlatinumCustomer {
	String type;
	
	
	@Autowired
	public PlatinumCustomer(@Value("Customer type is Platinum.")String type) {
		this.type = type;
	}
	
	public void disp() {
		System.out.println(type);
	}

}
