package Client;
import Service.Service;
import Service.NewService;
import DI_Provider.DI_Provider;

// Dependencies will be injected at runtime, with the help of "DI_Provider" annotation

public class Client {
	
	private Service service;
	private NewService newService;
	
	@DI_Provider
	 public Client(Service service, NewService newService) {
        this.service = service;
        this.newService = newService;
    }
     
    public void doSomething() {
        service.doSomething();
        newService.doSomethingNew();
    }

}
