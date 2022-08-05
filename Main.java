import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component("x")
public class Main {

	public static void main(String[] args) {
	try (ClassPathXmlApplicationContext _context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
		//CustomerManager _manager = new CustomerManager(_context.getBean("database",IDal.class));
		ICustomerService _Service = _context.getBean("service",ICustomerService.class);
		_Service.add();
//		IDal _Service_x = _context.getBean("x",IDal.class);
//		_SERVİCE_X.ADD();
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}



//_manager.add(); 

    // class kalıtılmalı yada implement edilmeli yoksa classa bağımlı olunur 
	}
	//Ioc bilgisayar programının özel olarak yazılan bölümleri, genel bir çerçeveden denetim akışını alır.
	//Dependency injection kaba tabir ile bir sınıfın/nesnenin bağımlılıklardan kurtulmasını amaçlayan ve o nesneyi olabildiğince bağımsızlaştıran bir programlama tekniği/prensibidir.

}
