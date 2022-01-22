package dio.one.patterns.strategy;

public class TesteStrategy {

	public static void main(String[] args) {
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento acelerado = new ComportamentoAcelerado();
		Comportamento parado = new Parado();
		
		Objeto robo = new Objeto();
		
		
		robo.setManeira(parado);
		robo.mover();
		robo.setManeira(normal);
		robo.mover();
		robo.setManeira(acelerado);
		robo.mover();
		robo.mover();
		robo.setManeira(normal);
		robo.mover();
		robo.setManeira(parado);
		robo.mover();
		

	}

}
