package IOC_ConfigFile.IOC_ConfigFile.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoldCustomer {
	String type;
	
	
	@Autowired
	public GoldCustomer(@Value("Customer type is Gold.") String  type) {
		this.type = type;
	}
	
	public void disp() {
		System.out.println(type);
	}

}
