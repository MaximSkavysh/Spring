package Main;
import Client.Client;
import Module.Module;
import DI_Provider.CoreDI_Provider;
import DI_Provider.CustomDI;

public class App {
	public static void main(String[] args)throws Exception{
		CoreDI_Provider coreDI_Provider = CustomDI.getCoreDI_Provider(new Module());
		
		Client client = (Client) coreDI_Provider.starterDI(Client.class);
		
		client.doSomething();
	}

}
