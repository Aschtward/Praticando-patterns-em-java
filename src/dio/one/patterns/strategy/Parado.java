package dio.one.patterns.strategy;

public class Parado implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Esta parado");
		
	}
	
}
