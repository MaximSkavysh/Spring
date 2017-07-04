package Module;

import Service.NewService;
import Service.NewServiceImpl;
import Service.Service;
import Service.ServiceImpl;

public class Module extends AbstractModule {
	public void configure() {		
		createMapping(Service.class, ServiceImpl.class);
		createMapping(NewService.class, NewServiceImpl.class);
	}

}
