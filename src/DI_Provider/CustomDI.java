package DI_Provider;
import Module.IModule;


/*initialize  configuration  and return  the 'CreDI_Provider',
 *  which after provides the DI:*/

public class CustomDI {
	public static CoreDI_Provider getCoreDI_Provider(IModule module){
		module.configure();
		return new CoreDI_Provider(module);
	}
	

}
