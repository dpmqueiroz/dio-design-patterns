package one.digitalInnovationOne.ogf.singleton;

/**
 * Singleton "preguiçoso"
 * @author DanielQueiroz
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
}
