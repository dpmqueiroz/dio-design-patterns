package one.digitalInnovationOne.ogf.singleton;

/**
 * Singleton "apressado"
 * @author DanielQueiroz
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		
		return instancia;
	}
	
}
