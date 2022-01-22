package dio.one.patterns.strategy;

public class ComportamentoAcelerado implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movimento acelerado");
		
	}

}
