package dio.one.patterns.singleton;

public class ClasseTesteSingleton {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		SingletonLazyHolder lazyh = SingletonLazyHolder.getInstancia();
		System.out.println(lazyh);

	}

}
