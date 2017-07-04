package DI_Provider;
import java.lang.reflect.Constructor;
import Module.IModule;

/*core class of DI, 
  which uses java reflection to find the dependency and inject it*/

public class CoreDI_Provider {
	private IModule module;
	
	public CoreDI_Provider(IModule module){
		this.module = module;
	}
	
	@SuppressWarnings("unchecked")
	public Object starterDI(Class myClass) throws Exception{
		if(myClass != null){
			boolean flag = true;
			int index = 0;
		
		for(Constructor constructor: myClass.getConstructors()){
			if(constructor.isAnnotationPresent(DI_Provider.class)){
				if(flag && index == 0){
					flag = false;
					index++;
					Class[] parameterTypes = constructor.getParameterTypes();
					Object[] objArr = new Object[parameterTypes.length];
					
					int i = 0;
					for(Class _class : parameterTypes){
						Class dependency = module.getMapping(_class);
						if(_class.isAssignableFrom(dependency)){
							objArr[i++] = dependency.getConstructor().newInstance();
							
							
						}
					}
					Object resultObj  = myClass.getConstructor(parameterTypes).newInstance(objArr);
					return resultObj;
				}
			}
		}
	}
		return null;
	}
}

