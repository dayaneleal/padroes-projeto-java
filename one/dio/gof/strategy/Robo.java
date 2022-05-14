package one.dio.gof.strategy;

public class Robo {

	private IComportamento comportamento;


	public Robo() {
		super();
	}

	public void setComportamento(IComportamento comportamento) {
		this.comportamento = comportamento;
	}

	public void mover() {
		comportamento.mover();
	}
	
	
}
