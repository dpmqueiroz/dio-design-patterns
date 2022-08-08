package one.digitalInnovationOne.ogf.singleton;
/**
 * 
 * @see <a href="https://stackoverflw.com/a/24018148"> Referencia </a>
 * 
 * @author DanielQueiroz
 *
 */
public class SingletonLazyHolder {

	
	private static class InstaceHolder{
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {	
		return InstaceHolder.instancia;
	}
}
