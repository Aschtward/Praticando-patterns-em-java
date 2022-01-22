package dio.one.patterns.singleton;

/**
 *Singleton "apressado" 
 * @author Leozin da Vg
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
