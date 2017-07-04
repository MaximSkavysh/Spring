package Module;

public interface IModule {
	void configure();
	<T> Class<? extends T> getMapping(Class<T> type);

}
