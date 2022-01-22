package dio.one.patterns.strategy;

public class Objeto {
	
	private Comportamento maneira;
	
	public void mover() {
		maneira.mover();
	}

	public void setManeira(Comportamento maneira) {
		this.maneira = maneira;
	}
}
